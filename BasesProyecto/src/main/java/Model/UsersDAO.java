
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author wendy_6rrub
 */
public class UsersDAO {
    
    ConnectionSQLdb csdb = new ConnectionSQLdb();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public String getUserNameById() {
        String userName = null;

        String query = "select Nombre from Usuarios u\n" +
                        "inner join Estudiantes e on u.Identificacion = e.Identificacion\n" +
                        "where ID_Estudiante = 19000";

        try (Connection con = csdb.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

           // ps.setInt(1, userId);  // Set the user ID in the query
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                userName = rs.getString(1); 
            }

        } catch (SQLException e) {
            e.printStackTrace();  
        }

        return userName;
    }
}

    
