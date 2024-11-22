
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author wendy_6rrub
 */
public class CoursesDAO {
    
    ConnectionSQLdb csdb = new ConnectionSQLdb();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int idStd = 19000;
    
    public List<CourseBonds> listCurrentCourses(){
        List<CourseBonds> cwi = new ArrayList<>();
        
        String listcc = "SELECT \n" +
                        "    c.sigla, \n" +
                        "    c.Nombre_curso AS nombre_curso, \n" +
                        "	concat(u.Nombre, ' ', u.Apellido1, ' ', u.Apellido2),\n" +
                        "    c.horario, \n" +
                        "    c.Fecha_fin\n" +
                        "FROM \n" +
                        "    Cursos c\n" +
                        "INNER JOIN \n" +
                        "    Inscripciones i ON c.Sigla = i.Sigla\n" +
                        "INNER JOIN \n" +
                        "    Facilitadores f ON i.ID_Facilitador = f.ID_Facilitador\n" +
                        "INNER JOIN\n" +
                        "	Usuarios u ON f.Identificacion= u.Identificacion\n" +
                        "WHERE \n" +
                        "    i.ID_Estudiante = " +idStd+ " \n" +
                        "    AND i.Estado = 'Finalizado';   ";
        try{
            con = csdb.getConnection();
            ps = con.prepareStatement(listcc);
            rs = ps.executeQuery();
            while(rs.next()){
                Courses c = new Courses();
                Users u = new Users();
                c.setCourseName(rs.getString(2));
                c.setInitials(rs.getString(1));
                c.setScheduleStd(rs.getString(4));
                c.setEndingDate(rs.getDate(5));
                u.setNameUser(rs.getString(3));
                
                CourseBonds cwis = new CourseBonds(c, u);
                cwi.add(cwis);
            }
        } catch (Exception e){
            e.printStackTrace(); 
        }
        
        return cwi;
    }
    
    public List<CourseBonds> listCoursesExpedient(){
        List<CourseBonds> cwi = new ArrayList<>();
        
        String listcc = "SELECT \n" +
                        "    c.sigla, \n" +
                        "    c.Nombre_curso, \n" +
                        "	concat(u.Nombre, ' ', u.Apellido1, ' ', u.Apellido2),\n" +
                        "    c.Modalidad, \n" +
                        "	i.Estado,\n" +
                        "    i.Fecha_Fin\n" +
                        "\n" +
                        "FROM \n" +
                        "    Cursos c\n" +
                        "INNER JOIN \n" +
                        "    Inscripciones i ON c.Sigla = i.Sigla\n" +
                        "INNER JOIN \n" +
                        "    Facilitadores f ON i.ID_Facilitador = f.ID_Facilitador\n" +
                        "INNER JOIN\n" +
                        "	Usuarios u ON f.Identificacion= u.Identificacion\n" +
                        "WHERE \n" +
                        "    i.ID_Estudiante = " +idStd+ "\n" +
                        "    AND i.Estado = 'Finalizado';   ";
        try{
            con = csdb.getConnection();
            ps = con.prepareStatement(listcc);
            rs = ps.executeQuery();
            while(rs.next()){
                Courses c = new Courses();
                Users u = new Users();
                Inscriptions i = new Inscriptions();
                c.setCourseName(rs.getString(2));
                c.setInitials(rs.getString(1));
                c.setModality(rs.getString(4));
                i.setStatus(rs.getString(5));
                c.setEndingDate(rs.getDate(6));
                u.setNameUser(rs.getString(3));
                
                CourseBonds cui = new CourseBonds(c, u, i);
                cwi.add(cui);
            }
        } catch (Exception e){
            e.printStackTrace(); 
        }
        
        return cwi;
    }
    
    public List<Courses> listCourses(){
        String quer="select * from Cursos;";
        List<Courses> listC = new ArrayList<>();
        
        try{
            con = csdb.getConnection();
            ps = con.prepareStatement(quer);
            rs = ps.executeQuery();
            while(rs.next()){
                Courses c = new Courses();
                c.setInitials(rs.getString(1));
                c.setCourseName(rs.getString(2));
                c.setModality(rs.getString(3));
                c.setArea(rs.getString(4));
                c.setAmountStudents(rs.getInt(5));
                c.setScheduleStd(rs.getString(6));
                c.setDuration(rs.getString(7));
                c.setOpeningDate(rs.getDate(8));
                c.setEndingDate(rs.getDate(9));
                listC.add(c);
            }}catch (Exception e){
            e.printStackTrace();
        }
        
        return listC;
    }
    
    
    public List<Courses> listCoursesFiltered(String search, String area) {
    String quer = "SELECT * FROM Cursos c ";  // Consulta base
    List<Courses> listC = new ArrayList<>();

    boolean hasSearchTerm = search != null && !search.isEmpty();
    boolean hasCourse = area != null && !area.isEmpty() && !area.equals("Todos");

    // Agregar condiciones WHERE y AND de manera correcta
    if (hasSearchTerm || hasCourse) {
        quer += "WHERE ";  // Solo una vez

        // Si hay término de búsqueda, agregamos la condición
        if (hasSearchTerm) {
            quer += "(c.Nombre_curso LIKE ? OR c.Modalidad LIKE ? OR c.Sigla LIKE ? OR c.Horario LIKE ?) ";
        }

        // Si tenemos tanto búsqueda como área, usamos AND
        if (hasSearchTerm && hasCourse) {
            quer += "AND ";
        }

        // Si hay filtro de área, agregamos la condición
        if (hasCourse) {
            quer += "c.Area_especializacion = ? ";
        }
    }
    
    try {
        con = csdb.getConnection();
        ps = con.prepareStatement(quer);
        
        int paramIndex = 1;
            if (hasSearchTerm) {
                String searchPattern = "%" + search + "%";
                ps.setString(paramIndex++, searchPattern);
                ps.setString(paramIndex++, searchPattern);
                ps.setString(paramIndex++, searchPattern);
                ps.setString(paramIndex++, searchPattern);
                ps.setString(paramIndex++, searchPattern);
            }
            if (hasCourse) {
                ps.setString(paramIndex, area);
            }
            
        rs = ps.executeQuery();

        while (rs.next()) {
            Courses c = new Courses();
            c.setInitials(rs.getString(1));
            c.setCourseName(rs.getString(2));
            c.setModality(rs.getString(3));
            c.setArea(rs.getString(4));
            c.setAmountStudents(rs.getInt(5));
            c.setScheduleStd(rs.getString(6));
            c.setDuration(rs.getString(7));
            c.setOpeningDate(rs.getDate(8));
            c.setEndingDate(rs.getDate(9));
            listC.add(c);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    return listC;
}
    
    public int addCourse(Courses c) {
    String sql = "INSERT INTO Cursos(Sigla, Nombre_curso, Modalidad, Area_especializacion, Cantidad_estudiantes, Horario, Duracion, Fecha_inicio, Fecha_fin) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    int rowsAffected = 0; // Para almacenar el resultado

    try {
        // Obtener conexión
        con = csdb.getConnection();
        ps = con.prepareStatement(sql);

        // Configurar parámetros
        ps.setString(1, c.getInitials());
        ps.setString(2, c.getCourseName());
        ps.setString(3, c.getModality());
        ps.setString(4, c.getArea());
        ps.setInt(5, c.getAmountStudents());
        ps.setString(6, c.getScheduleStd());
        ps.setString(7, c.getDuration());
        ps.setDate(8, c.getOpeningDate());
        ps.setDate(9, c.getEndingDate());

        rowsAffected = ps.executeUpdate();
    } catch (SQLException e) {
        System.err.println("Error al agregar el curso: " + e.getMessage());
    } 

    return rowsAffected; // Retorna 1 si se agregó correctamente, 0 si no
}
    
    public boolean addCourseToAdmin(String sigla) {
        
        int idadmin = 10017; // Este es un ID fijo, puedes cambiarlo si lo deseas

    String query = "insert into Administradores_Cursos(ID_Administrador,Sigla)\n" +
                    "values(?, ?)";

    try (PreparedStatement stmt = con.prepareStatement(query)) {
    con = csdb.getConnection();
    ps = con.prepareStatement(query);
        stmt.setInt(1, idadmin);  
        stmt.setString(2, sigla); 
        
        int rowAffected = stmt.executeUpdate();  
        return rowAffected > 0;  // Retorna true si se agregó correctamente
    } catch (SQLException e) {
        System.out.println("Error al agregar el curso a Administradores_Cursos: " + e.getMessage());
        return false;
    } finally {
        // Cerrar recursos para evitar fugas
        try {
            if (ps != null) ps.close();
            if (con != null && !con.isClosed()) con.close();  // Verificamos si la conexión está cerrada antes de cerrarla
        } catch (SQLException e) {
            System.err.println("Error al cerrar recursos: " + e.getMessage());
        }
    }
}

    
    public boolean deleteCourse(String initi) {
        try {
            con = csdb.getConnection();
            String query = "DELETE FROM Cursos WHERE Sigla = ?";  
            
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, initi);  

            int rowAffected = stmt.executeUpdate();  
            return rowAffected > 0;  
        } catch (SQLException e) {
            e.printStackTrace();
            return false; 
        }
    }

    public boolean deleteAdminCourses(String init) {
       String query = "DELETE FROM Administradores_Cursos WHERE Sigla = ?";
       try (Connection con = csdb.getConnection(); 
            PreparedStatement stmt = con.prepareStatement(query)) {

           stmt.setString(1, init);  
           int rowsAffected = stmt.executeUpdate();  
           return rowsAffected > 0;  

       } catch (SQLException e) {
           System.out.println("Error al eliminar registros de Administradores_Cursos: " + e.getMessage());
           return false;
       }
   }
 
    public boolean updateCourse(String sigla, String name, String modality, String area, int capacity, String schedule, String duration, Date startDate, Date endDate) {
    String query = "UPDATE Cursos set Nombre_curso = ?, Modalidad = ?, Area_especializacion = ?, Cantidad_estudiantes = ?, Horario = ?, Duracion = ?, Fecha_inicio = ?, Fecha_fin = ? where Sigla = ?";
        try (Connection con = csdb.getConnection(); 
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setString(2, modality);
            ps.setString(3, area);
            ps.setInt(4, capacity);
            ps.setString(5, schedule);
            ps.setString(6, duration);
            ps.setDate(7, new java.sql.Date(startDate.getTime()));
            ps.setDate(8, new java.sql.Date(endDate.getTime()));
            ps.setString(9, sigla);

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0; 
        } catch (SQLException e) {
            System.err.println("Error al actualizar el curso: " + e.getMessage());
            return false; 
        }
    }




    
}
