/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author franc
 */
public class StudentsDAO {

    ConnectionSQLdb csdb = new ConnectionSQLdb();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List<Object[]> getStudentsData(String searchTerm) {
        List<Object[]> studentsList = new ArrayList<>();
        String sql = "SELECT "
                + "    e.ID_Estudiante, "
                + "    u.Identificacion, "
                + "    u.Nombre, "
                + "    u.Apellido1, "
                + "    u.Apellido2, "
                + "    e.Necesidad_Especial, "
                + "    STRING_AGG(c.Nombre_Curso, ', ') AS Cursos, "
                + "    COUNT(i.Codigo_inscripcion) AS Cantidad_Cursos, "
                + "    u.Telefono_principal, "
                + "    u.Correo, "
                + "    u.Genero "
                + "FROM Estudiantes e "
                + "INNER JOIN Usuarios u ON e.Identificacion = u.Identificacion "
                + "LEFT JOIN Inscripciones i ON e.ID_Estudiante = i.ID_Estudiante "
                + "LEFT JOIN Cursos c ON i.Sigla = c.Sigla ";

        // Condiciones de filtro dinámico
        boolean hasSearchTerm = searchTerm != null && !searchTerm.trim().isEmpty();
        if (hasSearchTerm) {
            sql += "WHERE (e.ID_Estudiante LIKE ? OR u.Identificacion LIKE ? OR u.Nombre LIKE ? OR u.Apellido1 LIKE ? OR u.Apellido2 LIKE ?) ";
        }

        sql += "GROUP BY e.ID_Estudiante, u.Identificacion, u.Nombre, u.Apellido1, u.Apellido2, "
                + "e.Necesidad_Especial, u.Telefono_principal, u.Correo, u.Genero";

        try {
            con = csdb.getConnection();
            ps = con.prepareStatement(sql);

            // Configurar parámetros
            if (hasSearchTerm) {
                String searchPattern = "%" + searchTerm.trim() + "%";
                ps.setString(1, searchPattern);
                ps.setString(2, searchPattern);
                ps.setString(3, searchPattern);
                ps.setString(4, searchPattern);
                ps.setString(5, searchPattern);
            }

            rs = ps.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[11];
                row[0] = rs.getInt("ID_Estudiante");
                row[1] = rs.getString("Identificacion");
                row[2] = rs.getString("Nombre");
                row[3] = rs.getString("Apellido1");
                row[4] = rs.getString("Apellido2");
                row[5] = rs.getString("Necesidad_Especial");
                row[6] = rs.getString("Cursos");
                row[7] = rs.getInt("Cantidad_Cursos");
                row[8] = rs.getString("Telefono_principal");
                row[9] = rs.getString("Correo");
                row[10] = rs.getString("Genero");
                studentsList.add(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return studentsList;
    }
}
