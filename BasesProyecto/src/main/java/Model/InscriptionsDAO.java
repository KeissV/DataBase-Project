
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author wendy_6rrub
 */
public class InscriptionsDAO {
    
    ConnectionSQLdb csdb = new ConnectionSQLdb();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int idadmin = 10017;
    
    
public List<Inscriptions> listInscripFiltered(String search) throws SQLException {
    List<Inscriptions> listI = new ArrayList<>();
    
    String quer = "SELECT " +
                  "i.Codigo_inscripcion, " +
                  "i.ID_Estudiante, " +
                  "i.Sigla, " +
                  "i.ID_Facilitador " +
                  "FROM Inscripciones i " +
                  "INNER JOIN Estudiantes e ON i.ID_Estudiante = e.ID_Estudiante " +
                  "INNER JOIN Usuarios u1 ON e.Identificacion = u1.Identificacion " +
                  "INNER JOIN Cursos c ON i.Sigla = c.Sigla " +
                  "INNER JOIN Facilitadores f ON i.ID_Facilitador = f.ID_Facilitador " +
                  "INNER JOIN Usuarios u2 ON f.Identificacion = u2.Identificacion ";

    if (search != null && !search.isEmpty()) {
        quer += "WHERE i.Codigo_inscripcion LIKE ? OR " +
                 "i.ID_Estudiante LIKE ? OR " +
                 "i.Sigla LIKE ? OR " +
                 "i.ID_Facilitador LIKE ?";
    }

    try (Connection con = csdb.getConnection(); 
         PreparedStatement ps = con.prepareStatement(quer)) {

        if (search != null && !search.isEmpty()) {
            for (int i = 1; i <= 4; i++) {
                ps.setString(i, "%" + search + "%");
            }
        }
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Inscriptions i = new Inscriptions();
            i.setIDinscrip(rs.getString(1));
            i.setIdStudent(rs.getInt(2));
            i.setInitials(rs.getString(3));
            i.setIdInstructor(rs.getInt(4));

            listI.add(i);
        }
    }

    return listI;
}

public String getNextInscriptionId() {
    String sqlMaxId = "SELECT MAX(Codigo_inscripcion) FROM Inscripciones";  
    String nextId = "D00001";  

    try (Connection con = csdb.getConnection(); 
         Statement stmt = con.createStatement(); 
         ResultSet rs = stmt.executeQuery(sqlMaxId)) {

        if (rs.next()) {
            String lastId = rs.getString(1);
            if (lastId != null && lastId.startsWith("D")) {
                String numericPart = lastId.substring(1);  
                int numericValue = Integer.parseInt(numericPart); 
                numericValue++;  

                nextId = "D" + String.format("%05d", numericValue);
            }
        }
    } catch (SQLException e) {
        System.err.println("Error al obtener el siguiente ID de inscripción: " + e.getMessage());
    }
    
    return nextId;
}

public int addInscription(Inscriptions i) {
    int maxStudents = getMaxStudents(i.getInitials()); 
    int registeredStudents = getRegisteredStudents(i.getInitials()); 

    
    if (maxStudents - registeredStudents <= 0) {
        JOptionPane.showMessageDialog(null, "El curso está lleno. No se puede añadir más inscripciones.");
        return 0; 
    }
    
    String sqlInsert = "INSERT INTO Inscripciones(Codigo_inscripcion, Fecha_matricula, Estado, ID_Facilitador, ID_Estudiante, Sigla, Fecha_Inicio, Fecha_Fin) " +
                       "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
    int rowsAffected = 0;
 
    try (Connection con = csdb.getConnection(); 
         PreparedStatement ps = con.prepareStatement(sqlInsert)) {

        ps.setString(1, i.getIDinscrip());  
        ps.setDate(2, (java.sql.Date) i.getRegisterDate());
        ps.setString(3, i.getStatus());
        ps.setInt(4, i.getIdInstructor());
        ps.setInt(5, i.getIdStudent());
        ps.setString(6, i.getInitials());
        ps.setDate(7, (java.sql.Date) i.getOpeningDate());
        ps.setDate(8, (java.sql.Date) i.getEndingDate());

        rowsAffected = ps.executeUpdate();
    } catch (SQLException e) {
        System.err.println("Error al agregar la inscripción: " + e.getMessage());
    }

    return rowsAffected; 
}


public int getMaxStudents(String sigla) {
    String sql = "SELECT Cantidad_estudiantes FROM Cursos WHERE Sigla = ?";
    int maxStudents = -1; 

    try (Connection con = csdb.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, sigla);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            maxStudents = rs.getInt("Cantidad_estudiantes");
        }
    } catch (SQLException e) {
        System.err.println("Error al obtener la cantidad máxima de estudiantes: " + e.getMessage());
    }

    return maxStudents;
}


public int getRegisteredStudents(String sigla) {
    String sql = "SELECT COUNT(*) as total FROM Inscripciones WHERE Sigla = ? AND Estado = 'Cursando'";
    int registeredStudents = 0;

    try (Connection con = csdb.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, sigla);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            registeredStudents = rs.getInt("total");
        }
    } catch (SQLException e) {
        System.err.println("Error al contar los estudiantes inscritos: " + e.getMessage());
    }

    return registeredStudents;
}

public boolean addToAdministradoresInscripciones(String inscriptionId) {
    String sql = "insert into Administradores_Inscripciones(Codigo_inscripcion, ID_Administrador) values(?, ?)";
    
    try (Connection con = csdb.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setString(1, inscriptionId); 
        ps.setInt(2, idadmin); 
        
        int rowsAffected = ps.executeUpdate();
        
        return rowsAffected > 0; 
    } catch (SQLException e) {
        System.err.println("Error al agregar a Administradores_Inscripciones: " + e.getMessage());
    }
    return false; 
}

public boolean addToCursosFacilitadores(String courseId, int facilitatorId) {
    String sql = "insert into Cursos_Facilitadores(Sigla,ID_Facilitador) values(?, ?)";
    
    try (Connection con = csdb.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setString(1, courseId); 
        ps.setInt(2, facilitatorId); 
        
        int rowsAffected = ps.executeUpdate();
        
        return rowsAffected > 0; 
    } catch (SQLException e) {
        System.err.println("Error al agregar a cursos_facilitadores: " + e.getMessage());
    }
    return false; 
}

public boolean checkIfExistsInCursosFacilitadores(String courseId, int facilitatorId) {
    String sql = "SELECT COUNT(*) FROM Cursos_Facilitadores WHERE Sigla = ? AND ID_Facilitador = ?";
    try (Connection con = csdb.getConnection(); 
         PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setString(1, courseId);
        ps.setInt(2, facilitatorId);
        
        ResultSet rs = ps.executeQuery();
        if (rs.next() && rs.getInt(1) > 0) {
            return true; 
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false; 
}

    public boolean deleteInscriprion(String inscr) {
        try {
            con = csdb.getConnection();
            String query = "DELETE FROM Inscripciones WHERE Codigo_inscripcion = ?";  
            
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, inscr);  

            int rowAffected = stmt.executeUpdate();  
            return rowAffected > 0;  
        } catch (SQLException e) {
            e.printStackTrace();
            return false;  
        }
    }


public boolean isStudentExist(int studentId) {
    String sql = "SELECT 1 FROM Estudiantes WHERE ID_Estudiante = ?";
    try (Connection con = csdb.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setInt(1, studentId);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next() && rs.getInt(1) > 0) {
                return true; 
            }
        }
    } catch (SQLException e) {
        System.err.println("Error al verificar estudiante: " + e.getMessage());
    }
    return false;
}

public boolean isFacilitatorExist(int facilitatorId) {
    String sql = "SELECT 1 FROM Facilitadores WHERE ID_Facilitador = ?";
    try (Connection con = csdb.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setInt(1, facilitatorId);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next() && rs.getInt(1) > 0) {
                return true; 
            }
        }
    } catch (SQLException e) {
        System.err.println("Error al verificar facilitador: " + e.getMessage());
    }
    return false; 
}

public boolean isCourseExist(String courseSigla) {
    String sql = "SELECT 1 FROM Cursos WHERE Sigla = ?";
    try (Connection con = csdb.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setString(1, courseSigla);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next() && rs.getInt(1) > 0) {
                return true; 
            }
        }
    } catch (SQLException e) {
        System.err.println("Error al verificar curso: " + e.getMessage());
    }
    return false; 
}

    public Date[] getCourseDatesBySigla(String sigla) {
        Date[] dates = new Date[2];  
        String sql = "SELECT Fecha_inicio, Fecha_fin FROM Cursos WHERE Sigla = ?";  
        
        try (Connection con = csdb.getConnection(); 
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, sigla); 
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    // Obtener las fechas de inicio y fin
                    dates[0] = rs.getDate("Fecha_inicio");
                    dates[1] = rs.getDate("Fecha_fin");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        
        return dates;  
    }
    
    public boolean isAlreadyEnrolled(int studentId, String courseSigla) {
    String query = "SELECT COUNT(*) FROM Inscripciones WHERE ID_Estudiante = ? AND Sigla = ?";
    
    try (Connection conn = csdb.getConnection(); 
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setInt(1, studentId);
        stmt.setString(2, courseSigla);
        
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);
            return count > 0; 
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false; 
}

}


