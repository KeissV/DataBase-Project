
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
    
    public List<CourseWithInstructor> listCurrentCourses(){
        List<CourseWithInstructor> cwi = new ArrayList<>();
        
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
                        "    i.ID_Estudiante = 19000 \n" +
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
                c.setEndingDate(rs.getString(5));
                u.setNameUser(rs.getString(3));
                
                CourseWithInstructor cwis = new CourseWithInstructor(c, u);
                cwi.add(cwis);
            }
        } catch (Exception e){
            
        }
        
        return cwi;
    }
    
}
