/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.ConnectionSQLdb;
import Model.ConnectionSQLdb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author franc
 */
public class FacilitatorsDAO {


    ConnectionSQLdb csdb = new ConnectionSQLdb();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List<Object[]> getFacilitatorsData() {
        List<Object[]> facilitatorsList = new ArrayList<>();
        String sql = "SELECT " +
                     "    f.ID_Facilitador, " +
                     "    u.Identificacion, " +
                     "    u.Nombre, " +
                     "    u.Apellido1, " +
                     "    u.Apellido2, " +
                     "    u.Telefono_principal, " +
                     "    u.Correo, " +
                     "    f.Area_Especializacion, " +
                     "    COUNT(cf.Sigla) AS Cantidad_Cursos, " +
                     "    STRING_AGG(c.Nombre_Curso, ', ') AS Cursos " +
                     "FROM " +
                     "    Facilitadores f " +
                     "INNER JOIN Usuarios u ON f.Identificacion = u.Identificacion " +
                     "LEFT JOIN Cursos_Facilitadores cf ON f.ID_Facilitador = cf.ID_Facilitador " +
                     "LEFT JOIN Cursos c ON cf.Sigla = c.Sigla " +
                     "GROUP BY " +
                     "    f.ID_Facilitador, u.Identificacion, u.Nombre, u.Apellido1, u.Apellido2, u.Telefono_principal, u.Correo, f.Area_Especializacion";

        try {
            con = csdb.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[10];
                row[0] = rs.getInt("ID_Facilitador");
                row[1] = rs.getString("Identificacion");
                row[2] = rs.getString("Nombre");
                row[3] = rs.getString("Apellido1");
                row[4] = rs.getString("Apellido2");
                row[5] = rs.getString("Telefono_principal");
                row[6] = rs.getString("Correo");
                row[7] = rs.getString("Area_Especializacion");
                row[8] = rs.getInt("Cantidad_Cursos");
                row[9] = rs.getString("Cursos");
                facilitatorsList.add(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return facilitatorsList;
    }
}




