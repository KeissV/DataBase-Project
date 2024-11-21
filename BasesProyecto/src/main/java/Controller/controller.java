
package Controller;

import InterfaW.CurrentCourses;
import InterfaW.StudentExpedient;
import Interface.AddCourse;
import Interface.ManageCourse;
import Model.CourseBonds;
import Model.Courses;
import Model.CoursesDAO;
import Model.Users;
import Model.UsersDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wendy_6rrub
 */
public class controller implements ActionListener{

    Courses co = new Courses();
    CoursesDAO cdao = new CoursesDAO();
    Users uss = new Users();
    CurrentCourses cc = new CurrentCourses();
    StudentExpedient se = new StudentExpedient();
    DefaultTableModel mod = new DefaultTableModel();
    ManageCourse mc = new ManageCourse();
    UsersDAO udao = new UsersDAO();
    AddCourse ac = new AddCourse();

    
    public controller() {
        this.ac.btnAddCourse.addActionListener(this);
    }
      
    public void list(JTable tb){
        mod=(DefaultTableModel)tb.getModel();
        List<CourseBonds> ldao= cdao.listCurrentCourses();
        Object[]obj = new Object[5];
        for (int i = 0; i < ldao.size(); i++) {
            obj[0]= ldao.get(i).getCourse().getInitials();
            obj[1]= ldao.get(i).getCourse().getCourseName();
            obj[2]= ldao.get(i).getInstructor().getNameUser();
            obj[3]= ldao.get(i).getCourse().getScheduleStd();
            obj[4]= ldao.get(i).getCourse().getEndingDate();
            mod.addRow(obj);
        }
        cc.tableCurrent.setModel(mod);
    }
    
    public void listExpedient(JTable tb){
        mod=(DefaultTableModel)tb.getModel();
        List<CourseBonds> ldao= cdao.listCoursesExpedient();
        Object[]obj = new Object[6];
        for (int i = 0; i < ldao.size(); i++) {
            obj[0]= ldao.get(i).getCourse().getInitials();
            obj[1]= ldao.get(i).getCourse().getCourseName();
            obj[2]= ldao.get(i).getInstructor().getNameUser();
            obj[3]= ldao.get(i).getCourse().getModality();
            obj[4]= ldao.get(i).getInscrip().getStatus();
            obj[5]= ldao.get(i).getCourse().getEndingDate();
            mod.addRow(obj);
        }
        se.tableExpe.setModel(mod);
    }
    
    public void listCourses(JTable tb){
        mod=(DefaultTableModel)tb.getModel();
        List<Courses> csdao= cdao.listCourses();
        Object[]obj = new Object[9];
        for (int i = 0; i < csdao.size(); i++) {
            obj[0]= csdao.get(i).getInitials();
            obj[1]= csdao.get(i).getCourseName();
            obj[2]= csdao.get(i).getModality();
            obj[3]= csdao.get(i).getArea();
            obj[4]= csdao.get(i).getAmountStudents();
            obj[5]= csdao.get(i).getScheduleStd();
            obj[6]= csdao.get(i).getDuration();
            obj[7]= csdao.get(i).getOpeningDate();
            obj[8]= csdao.get(i).getEndingDate();
            mod.addRow(obj);
        }
        
        mc.tableCourses.setModel(mod);
    }
    
//    public void filterCourses() {
//        String previousSelectedArea = "";
//        String selectedArea = mc.selectedArea; // Asumimos que este atributo contiene el área seleccionada.
//
//        if (!selectedArea.equals(previousSelectedArea)) {
//            previousSelectedArea = selectedArea; 
//        }
//        // Filtrar cursos según el área seleccionada
//        List<Courses> courses;
//        if (selectedArea.equals("Todos")) {
//            courses = cdao.listCourses();  // Obtener todos los cursos
//        } else {
//            courses = cdao.listCoursesByArea(selectedArea);  // Obtener cursos por área
//        }

        // Actualizar la tabla con los cursos obtenidos
//        DefaultTableModel model = (DefaultTableModel) mc.tableCourses.getModel();
//        model.setRowCount(0); // Limpiar la tabla
//
//        Object[] obj = new Object[9];
//        for (Courses course : courses) {
//            obj[0] = course.getInitials();
//            obj[1] = course.getCourseName();
//            obj[2] = course.getModality();
//            obj[3] = course.getArea();
//            obj[4] = course.getAmountStudents();
//            obj[5] = course.getScheduleStd();
//            obj[6] = course.getDuration();
//            obj[7] = course.getOpeningDate();
//            obj[8] = course.getEndingDate();
//            model.addRow(obj); // Añadir la fila a la tabla
//        }
//    }

    

public void loadCoursesData(JTable table, String search, String area) {
    // Crear el modelo para la tabla
    DefaultTableModel model = new DefaultTableModel(
        new String[] {
            "Sigla", "Nombre Curso", "Modalidad", "Área", 
            "Cantidad de Estudiantes", "Horario", "Duración", 
            "Fecha Inicio", "Fecha Fin"
        },
        0
    );
    table.setModel(model);

    // Realizar la consulta para obtener los datos filtrados
    List<Courses> courses = cdao.listCoursesFiltered(search, area);

    // Agregar los datos al modelo de la tabla
    for (Courses course : courses) {
        Object[] row = new Object[9];
        row[0] = course.getInitials();
        row[1] = course.getCourseName();
        row[2] = course.getModality();
        row[3] = course.getArea();
        row[4] = course.getAmountStudents();
        row[5] = course.getScheduleStd();
        row[6] = course.getDuration();
        row[7] = course.getOpeningDate();
        row[8] = course.getEndingDate();
        
        model.addRow(row);
    }
}

    public void addCourses(String name, String ini, String sch, String ope, String end,
                        String moda, String area, int quant, String dur) throws ParseException {
        
            ac.comoMod.setSelectedIndex(0);
            ac.comboArea.setSelectedIndex(0);
            ac.comboDuration.setSelectedIndex(0);

        if (name.isEmpty() || ini.isEmpty() || sch.isEmpty() || ope.isEmpty() || end.isEmpty()) {
            JOptionPane.showMessageDialog(ac, "Por favor, complete todos los campos obligatorios.");
            return;
        }
        
        if (!isSiglaValid(ini)) {
            JOptionPane.showMessageDialog(null, "La sigla debe tener el formato kk-0000 (dos letras, guión y cuatro números).");
            return;
        }
        
        if (!isValidDate(ope )) {
            JOptionPane.showMessageDialog(null, "La fecha debe tener el formato yyyy-MM-dd.");
            return;
        }
        if (!isValidDate(end )) {
            JOptionPane.showMessageDialog(null, "La fecha debe tener el formato yyyy-MM-dd.");
            return;
        }

        co.setCourseName(name);
        co.setInitials(ini);
        co.setScheduleStd(sch);
        Date date1 = format.parse(ope);
        Date date2 = format.parse(end);
        
        if (date1.after(date2)) {
            JOptionPane.showMessageDialog(null, "La fecha de inicio debe ser anterior a la fecha de cierre.");
            return;
        }
        
        if (ope.isEmpty() || end.isEmpty()) {
            JOptionPane.showMessageDialog(ac, "Las fechas de inicio y finalización son obligatorias.");
            return;
        }
        co.setOpeningDate(new java.sql.Date(date1.getTime()));  // Esto obtiene solo la fecha (sin la hora)
        co.setEndingDate(new java.sql.Date(date2.getTime()));
        co.setModality(moda);
        co.setArea(area);
        
        co.setAmountStudents(quant);
        co.setDuration(dur);
        
        int r = cdao.addCourse(co);
        if (name.isEmpty() || ini.isEmpty() || sch.isEmpty() || ope.isEmpty() || end.isEmpty()) {
            JOptionPane.showMessageDialog(ac, "Por favor, complete todos los campos.");
            return;  // No continuar si hay campos vacíos
        }
        if (r==1){
            boolean adminCourseAdded = cdao.addCourseToAdmin(ini);  

            if (adminCourseAdded) {
            JOptionPane.showMessageDialog(null, "Curso agregado exitosamente y asignado a Administradores_Cursos.");  
            } 
        }else{
            JOptionPane.showMessageDialog(ac, "Error");
        }
    }
    
    public void deleteCourse(String initials) {
        DefaultTableModel model = new DefaultTableModel();
        int confirm = JOptionPane.showConfirmDialog(null,"¿Estás seguro de que quieres eliminar este curso?", 
                                                    "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            // Solicitar contraseña
            String pass = JOptionPane.showInputDialog(null, "Ingresa tu contraseña para confirmar:");

            // Validación de la contraseña (ejemplo simple)
            if (validatePass(pass)) {
                // Llamamos al modelo para eliminar el curso
                    boolean adminDeleted = cdao.deleteAdminCourses(initials);

                if (adminDeleted) {
                    boolean deleted = cdao.deleteCourse(initials);

                    if (deleted) {
                        JOptionPane.showMessageDialog(null, "El curso y sus registros asociados fueron eliminados exitosamente.");
                        List<Courses> curs = cdao.listCoursesFiltered(null, null); 
                            for (Courses course : curs) {
                            Object[] row = new Object[9];
                            row[0] = course.getInitials();
                            row[1] = course.getCourseName();
                            row[2] = course.getModality();
                            row[3] = course.getArea();
                            row[4] = course.getAmountStudents();
                            row[5] = course.getScheduleStd();
                            row[6] = course.getDuration();
                            row[7] = course.getOpeningDate();
                            row[8] = course.getEndingDate();

                            model.addRow(row);  
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el curso.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta. El curso no se puede eliminar");
            }
        }
    }
    
    public void editCourse(String sigla, String name, String modality, String area, int capacity, String schedule, String duration, String startDate, String endDate) throws ParseException {
        try {
        if (sigla.isEmpty() || name.isEmpty() || modality.isEmpty() || area.isEmpty() || 
            schedule.isEmpty() || duration.isEmpty() || 
            startDate.isEmpty() || endDate.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return;
        }
        
        Date date1 = format.parse(startDate);
        Date date2 = format.parse(endDate);
        
        if (date1.after(date2)) {
            JOptionPane.showMessageDialog(null, "La fecha de inicio debe ser anterior a la fecha de cierre.");
            return;
        }
        
        boolean edited = cdao.updateCourse(sigla, name, modality, area, capacity, schedule, duration, date1, date2);
            if(edited){
                JOptionPane.showMessageDialog(null, "El curso fue modificado exitosamente");
            } else{
                JOptionPane.showMessageDialog(null, "Error al modificar el curso.");
            }
            } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error: " + ex.getMessage());
    }
    }

    
    public String getUserName() {
        return udao.getUserNameById();  
    }   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ac.btnAddCourse) {
            try {
                // Obtener los detalles del curso desde la vista AddCourse
                String[] courseDetails = ac.getCourseDetails();

                // Pasar los detalles a la función addCourses en el controlador
                addCourses(courseDetails[0], courseDetails[1], courseDetails[2], courseDetails[3], courseDetails[4],
                            courseDetails[5], courseDetails[6], Integer.parseInt(courseDetails[7]), courseDetails[8]);
            } catch (ParseException ex) {
                Logger.getLogger(controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (e.getSource() == mc.btnDeleteCourse) {  
        }
    }

    private boolean validatePass(String passw) {
        String rightPass = "admin123";  // Contraseña fija como ejemplo
        return passw != null && passw.equals(rightPass);
    }
    
    public boolean isSiglaValid(String sigla) {
        String regex = "^[a-zA-Z]{2}-\\d{4}$";  // Dos letras, un guión y cuatro números
        return sigla.matches(regex);
    }

     SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    public boolean isValidDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate.parse(dateStr, formatter); // Intenta convertir la fecha
            return true;
        } catch (DateTimeParseException e) {
            return false; // Retorna falso si no cumple el formato
        }
    }
    
}
