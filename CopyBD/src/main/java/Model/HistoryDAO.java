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
public class HistoryDAO {

    ConnectionSQLdb csdb = new ConnectionSQLdb();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List<Object[]> getHistoryData(String searchTerm, String course) {
        List<Object[]> historyList = new ArrayList<>();
        String sql = "SELECT "
                + "    e.ID_Estudiante, "
                + "    u.Identificacion, "
                + "    u.Nombre, "
                + "    u.Apellido1, "
                + "    u.Apellido2, "
                + "    e.Necesidad_Especial, "
                + "    i.Sigla, "
                + "    c.Nombre_Curso, "
                + "    c.Modalidad, "
                + "    c.Area_especializacion, "
                + "    STRING_AGG(c.Horario, ', ') AS Horarios, "
                + "    c.Fecha_inicio, "
                + "    c.Fecha_fin "
                + "FROM Estudiantes e "
                + "INNER JOIN Usuarios u ON e.Identificacion = u.Identificacion "
                + "LEFT JOIN Inscripciones i ON e.ID_Estudiante = i.ID_Estudiante "
                + "LEFT JOIN Cursos c ON i.Sigla = c.Sigla ";

        // Filtrar por términos de búsqueda y/o curso si se proporcionan
        boolean hasSearchTerm = searchTerm != null && !searchTerm.isEmpty();
        boolean hasCourse = course != null && !course.isEmpty() && !course.equals("Todos");

        if (hasSearchTerm || hasCourse) {
            sql += "WHERE ";
            if (hasSearchTerm) {
                sql += "(e.ID_Estudiante LIKE ? OR u.Identificacion LIKE ? OR u.Nombre LIKE ? OR u.Apellido1 LIKE ? OR u.Apellido2 LIKE ?) ";
            }
            if (hasSearchTerm && hasCourse) {
                sql += "AND ";
            }
            if (hasCourse) {
                sql += "c.Nombre_Curso = ? ";
            }
        }

        sql += "GROUP BY e.ID_Estudiante, u.Identificacion, u.Nombre, u.Apellido1, u.Apellido2, "
                + "e.Necesidad_Especial, i.Sigla, c.Nombre_Curso, c.Modalidad, c.Area_especializacion, "
                + "c.Fecha_inicio, c.Fecha_fin";

        try {
            con = csdb.getConnection();
            ps = con.prepareStatement(sql);

            int paramIndex = 1;
            if (hasSearchTerm) {
                String searchPattern = "%" + searchTerm + "%";
                ps.setString(paramIndex++, searchPattern);
                ps.setString(paramIndex++, searchPattern);
                ps.setString(paramIndex++, searchPattern);
                ps.setString(paramIndex++, searchPattern);
                ps.setString(paramIndex++, searchPattern);
            }
            if (hasCourse) {
                ps.setString(paramIndex, course);
            }

            rs = ps.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[13];
                row[0] = rs.getInt("ID_Estudiante");
                row[1] = rs.getString("Identificacion");
                row[2] = rs.getString("Nombre");
                row[3] = rs.getString("Apellido1");
                row[4] = rs.getString("Apellido2");
                row[5] = rs.getString("Necesidad_Especial");
                row[6] = rs.getString("Sigla");
                row[7] = rs.getString("Nombre_Curso");
                row[8] = rs.getString("Modalidad");
                row[9] = rs.getString("Area_especializacion");
                row[10] = rs.getString("Horarios");
                row[11] = rs.getDate("Fecha_inicio");
                row[12] = rs.getDate("Fecha_fin");
                historyList.add(row);
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

        return historyList;
    }

    public List<String> getAllCourses() {
        List<String> coursesList = new ArrayList<>();
        String sql = "SELECT DISTINCT Nombre_Curso FROM Cursos";

        try {
            con = csdb.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                coursesList.add(rs.getString("Nombre_Curso"));
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

        return coursesList;
    }
}
