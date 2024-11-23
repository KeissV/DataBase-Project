/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.Component;
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

    public List<Object[]> getFacilitatorsData(String searchTerm) {
        List<Object[]> facilitatorsList = new ArrayList<>();
        String sql = "SELECT "
                + "    f.ID_Facilitador, "
                + "    u.Identificacion, "
                + "    u.Nombre, "
                + "    u.Apellido1, "
                + "    u.Apellido2, "
                + "    u.Telefono_principal, "
                + "    u.Correo, "
                + "    f.Area_Especializacion, "
                + "    COUNT(cf.Sigla) AS Cantidad_Cursos, "
                + "    STRING_AGG(c.Nombre_Curso, ', ') AS Cursos "
                + "FROM Facilitadores f "
                + "INNER JOIN Usuarios u ON f.Identificacion = u.Identificacion "
                + "LEFT JOIN Cursos_Facilitadores cf ON f.ID_Facilitador = cf.ID_Facilitador "
                + "LEFT JOIN Cursos c ON cf.Sigla = c.Sigla ";

        boolean hasSearchTerm = searchTerm != null && !searchTerm.trim().isEmpty();
        if (hasSearchTerm) {
            sql += "WHERE (f.ID_Facilitador LIKE ? OR u.Identificacion LIKE ? OR u.Nombre LIKE ? OR u.Apellido1 LIKE ? OR u.Apellido2 LIKE ?) ";
        }

        sql += "GROUP BY f.ID_Facilitador, u.Identificacion, u.Nombre, u.Apellido1, u.Apellido2, "
                + "u.Telefono_principal, u.Correo, f.Area_Especializacion";

        try {
            con = csdb.getConnection();
            ps = con.prepareStatement(sql);

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

        return facilitatorsList;
    }

    public boolean deleteFacilitator(int facilitatorId) {
        String sqlDeleteAdminFacilitadores = "DELETE FROM Administradores_Facilitadores WHERE ID_Facilitador = ?";
        String sqlDeleteAdminInscripciones = "DELETE FROM Administradores_Inscripciones WHERE Codigo_inscripcion IN (SELECT Codigo_inscripcion FROM Inscripciones WHERE ID_Facilitador = ?)";
        String sqlDeleteInscripciones = "DELETE FROM Inscripciones WHERE ID_Facilitador = ?";
        String sqlDeleteCursosFacilitadores = "DELETE FROM Cursos_Facilitadores WHERE ID_Facilitador = ?";
        String sqlDeleteFacilitador = "DELETE FROM Facilitadores WHERE ID_Facilitador = ?";
        String sqlDeleteUsuario = "DELETE FROM Usuarios WHERE Identificacion = (SELECT Identificacion FROM Facilitadores WHERE ID_Facilitador = ?)";

        try {
            con = csdb.getConnection();
            con.setAutoCommit(false); 

            ps = con.prepareStatement(sqlDeleteAdminFacilitadores);
            ps.setInt(1, facilitatorId);
            ps.executeUpdate();
            System.out.println("Relaciones en Administradores_Facilitadores eliminadas.");

            ps = con.prepareStatement(sqlDeleteAdminInscripciones);
            ps.setInt(1, facilitatorId);
            ps.executeUpdate();
            System.out.println("Relaciones en Administradores_Inscripciones eliminadas.");

            ps = con.prepareStatement(sqlDeleteInscripciones);
            ps.setInt(1, facilitatorId);
            ps.executeUpdate();
            System.out.println("Inscripciones eliminadas.");

            ps = con.prepareStatement(sqlDeleteCursosFacilitadores);
            ps.setInt(1, facilitatorId);
            ps.executeUpdate();
            System.out.println("Relaciones en Cursos_Facilitadores eliminadas.");

            ps = con.prepareStatement(sqlDeleteFacilitador);
            ps.setInt(1, facilitatorId);
            ps.executeUpdate();
            System.out.println("Facilitador eliminado.");

            ps = con.prepareStatement(sqlDeleteUsuario);
            ps.setInt(1, facilitatorId);
            ps.executeUpdate();
            System.out.println("Usuario eliminado.");

            con.commit(); 
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Component view = null;
            javax.swing.JOptionPane.showMessageDialog(view, "Ocurrió un error al eliminar el registro: " + e.getMessage());
            try {
                con.rollback(); 
            } catch (Exception rollbackEx) {
                rollbackEx.printStackTrace();
            }
            return false;
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
