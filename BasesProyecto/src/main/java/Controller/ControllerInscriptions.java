
package Controller;

import Model.Inscriptions;
import Model.InscriptionsDAO;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wendy_6rrub
 */
public class ControllerInscriptions {
    
    InscriptionsDAO idao = new InscriptionsDAO();
    Inscriptions ins = new Inscriptions();
    
public void loadInscripData(JTable table, String search) throws SQLException {
    DefaultTableModel model = new DefaultTableModel(new String[] {
            "Codigo", "ID estudiante", "Sigla curso", "ID facilitador"
        },
        0);
    table.setModel(model);

    if (search == null || search.isEmpty()) {
        search = ""; // 
    }
    
    List<Inscriptions> ins = idao.listInscripFiltered(search);

    for (Inscriptions in : ins) {
        Object[] row = new Object[4];
        row[0] = in.getIDinscrip();
        row[1] = in.getIdStudent();
        row[2] = in.getInitials();
        row[3] = in.getIdInstructor();
        
        model.addRow(row);
    }
}

    public String getNextInscriptionId() {
        return idao.getNextInscriptionId();
    }

public void addInscriptions(String code, String cour, int stud, int fac, String dateRegi) throws ParseException{
    
        if (!isValidDate(dateRegi)) {
            JOptionPane.showMessageDialog(null, "La fecha debe tener el formato yyyy-MM-dd.");
            return;
        }
        
        if (idao.isAlreadyEnrolled(stud, cour)) {
            JOptionPane.showMessageDialog(null, "El estudiante ya está inscrito en este curso.");
            return;
        }
        
        Date[] courseDates = idao.getCourseDatesBySigla(cour);
        LocalDate op = null;
        LocalDate en = null;
        LocalDate dateRegiParsed = null;
        Date ope = courseDates != null && courseDates[0] != null ? courseDates[0] : null;
        Date end = courseDates != null && courseDates[1] != null ? courseDates[1] : null;
        Date reg = null;
        String sta;
        
        if (courseDates != null && courseDates[0] != null && courseDates[1] != null) {
       op = new java.sql.Date(courseDates[0].getTime()).toLocalDate(); 
        en = new java.sql.Date(courseDates[1].getTime()).toLocalDate(); 

        dateRegiParsed = LocalDate.parse(dateRegi, DateTimeFormatter.ISO_DATE); 
        reg = java.sql.Date.valueOf(dateRegiParsed);

        } else {
            System.out.println("No se encontró el curso o las fechas no están disponibles.");
        }
        
        
        if (dateRegiParsed.isAfter(en)) {
            sta= "Finalizado";
        } else {
            sta= "Cursando";
        }

        
        ins.setIDinscrip(code);
        ins.setInitials(cour);
        ins.setIdInstructor(fac);
        ins.setIdStudent(stud);
        ins.setRegisterDate((java.sql.Date) reg);
        
        if (end == null) {
            JOptionPane.showMessageDialog(null, "La fecha final del curso no está disponible.");
            return;
        }
        ins.setEndingDate(new java.sql.Date(end.getTime()));
        
        if (ope == null) {
            JOptionPane.showMessageDialog(null, "La fecha de inicio del curso no está disponible.");
            return;
        }
        ins.setOpeningDate(new java.sql.Date(ope.getTime()));
        ins.setStatus(sta);
        
        boolean validate =validateInscription(ins);
        
        if (validate){
            int r = idao.addInscription(ins);
            if (r > 0) {
            JOptionPane.showMessageDialog(null, "Inscripción añadida con éxito.");
            
            String inscriptionId = ins.getInitials();
            
            boolean addedToAdminInscrip = idao.addToAdministradoresInscripciones(inscriptionId);
            if (addedToAdminInscrip) {
                System.out.println("Inscripción añadida a Administradores_Inscripciones.");
            }
            
            if (idao.checkIfExistsInCursosFacilitadores(inscriptionId, ins.getIdInstructor())) {
                System.out.println("El curso ya tiene este facilitador asignado.");
                
            }else{
                boolean addedToCoursesFacilitators = idao.addToCursosFacilitadores(ins.getInitials(), ins.getIdInstructor());
                    if (addedToCoursesFacilitators) {
                        System.out.println("Inscripción añadida a Cursos_Facilitadores.");
                    }
                }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo añadir la inscripción.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Los datos de la inscripción son incorrectos. Verifique el estudiante, facilitador o curso.");
    }     
}

    public void deleteInscrip(String code){
        int confirm = JOptionPane.showConfirmDialog(null,"¿Estás seguro de que quieres eliminar esta inscripción?", 
                                                    "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            String pass = JOptionPane.showInputDialog(null, "Ingresa tu contraseña para confirmar:");

             if (validatePass(pass)) {
                    
                    boolean deleted = idao.deleteInscriprion(code);

                    if (deleted) {
                        JOptionPane.showMessageDialog(null, "La inscripción fue eliminada exitosamente.");                          
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar la inscripción.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta. La inscripción no se puede eliminar");
            }
    }
    

    public boolean validateInscription(Inscriptions inscription) {
        if (!idao.isStudentExist(inscription.getIdStudent())) {
            System.out.println("Estudiante no existe: " + inscription.getIdStudent());
            return false; 
        }

        if (!idao.isFacilitatorExist(inscription.getIdInstructor())) {
                    System.out.println("Facilitador no existe: " + inscription.getIdInstructor());
            return false; 
        }

        if (!idao.isCourseExist(inscription.getInitials())) {
               System.out.println("Curso no existe: " + inscription.getInitials());
            return false; 
        }
            return true;
    }

     SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    public boolean isValidDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate.parse(dateStr, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false; 
        }
    }
    private boolean validatePass(String passw) {
        String rightPass = "admin123";  
        return passw != null && passw.equals(rightPass);
    }
}
