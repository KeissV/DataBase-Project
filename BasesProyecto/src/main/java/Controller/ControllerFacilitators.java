/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Interface.ManageStaff;
import Model.ConnectionSQLdb;
import Model.FacilitatorsDAO;
import Model.StudentsDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author franc
 */
public final class ControllerFacilitators {

    private ManageStaff view;
    private FacilitatorsDAO facilitatorsDAO;
    private StudentsDAO studentsDAO;

    public ControllerFacilitators(ManageStaff view) {
        this.view = view;
        this.facilitatorsDAO = new FacilitatorsDAO();
        this.studentsDAO = new StudentsDAO();
    }

    public void loadTeachersData(JTable table, String searchTerm) {
        DefaultTableModel model = new DefaultTableModel(
                new String[]{
                    "ID Facilitador", "Identificación", "Nombre", "Apellido1", "Apellido2",
                    "Teléfono", "Correo", "Especialización", "Cantidad Cursos", "Cursos"
                },
                0
        );
        table.setModel(model);

        List<Object[]> data = facilitatorsDAO.getFacilitatorsData(searchTerm);

        for (Object[] row : data) {
            model.addRow(row);
        }
    }

    public void loadStudentsData(JTable table, String searchTerm) {
        DefaultTableModel model = new DefaultTableModel(
                new String[]{
                    "ID Estudiante", "Identificación", "Nombre", "Apellido1", "Apellido2",
                    "Necesidad Especial", "Cursos", "Cantidad Cursos",
                    "Teléfono", "Correo", "Género"
                },
                0
        );
        table.setModel(model);

        List<Object[]> data = studentsDAO.getStudentsData(searchTerm);

        for (Object[] row : data) {
            model.addRow(row);
        }

    }

    public void deleteRecord(String id, JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String tableType = model.getColumnName(0).equals("ID Estudiante") ? "Estudiante" : "Facilitador";

        boolean success;
        if (tableType.equals("Estudiante")) {
            success = studentsDAO.deleteStudent(Integer.parseInt(id));
        } else {
            success = facilitatorsDAO.deleteFacilitator(Integer.parseInt(id));
        }

        if (success) {
            javax.swing.JOptionPane.showMessageDialog(view, "El registro se eliminó con éxito.");
            if (tableType.equals("Estudiante")) {
                loadStudentsData(table, "");
            } else {
                loadTeachersData(table, "");
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(view, "Ocurrió un error al eliminar el registro. Verifique las dependencias.");
        }
    }

    public void updateStudentData(int idEstudiante, String nombre, String apellido1, String apellido2,
            String telefono1, String telefono2, String provincia, String canton,
            String distrito, String genero, String necesidadEspecial, String estadoCivil) {

        if (!validateInputs(nombre, apellido1, apellido2, telefono1, telefono2, provincia, canton, distrito, genero, "")) {
            return;
        }

        ConnectionSQLdb csdb = new ConnectionSQLdb();
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = csdb.getConnection();


            String sqlUsuario = "UPDATE Usuarios SET Nombre = ?, Apellido1 = ?, Apellido2 = ?, "
                    + "Telefono_principal = ?, Teléfono_secundario = ?, Provincia = ?, "
                    + "Canton = ?, Distrito = ?, Genero = ? "
                    + "WHERE Identificacion = (SELECT Identificacion FROM Estudiantes WHERE ID_Estudiante = ?)";
            ps = con.prepareStatement(sqlUsuario);
            ps.setString(1, nombre);
            ps.setString(2, apellido1);
            ps.setString(3, apellido2);
            ps.setString(4, telefono1);
            ps.setString(5, telefono2);
            ps.setString(6, provincia);
            ps.setString(7, canton);
            ps.setString(8, distrito);
            ps.setString(9, genero);
            ps.setInt(10, idEstudiante);
            ps.executeUpdate();


            String sqlEstudiante = "UPDATE Estudiantes SET Necesidad_Especial = ?, Estado_Civil = ? WHERE ID_Estudiante = ?";
            ps = con.prepareStatement(sqlEstudiante);
            ps.setString(1, necesidadEspecial);
            ps.setString(2, estadoCivil);
            ps.setInt(3, idEstudiante);
            ps.executeUpdate();

            javax.swing.JOptionPane.showMessageDialog(view, "Datos actualizados correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(view, "Error al actualizar los datos: " + e.getMessage());
        } finally {
            try {
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
    }

  
    private boolean validateInputs(String nombre, String apellido1, String apellido2, String telefono1, String telefono2, String provincia, String canton, String distrito, String genero, String fechaNacimiento) {
        if (nombre.isEmpty() || apellido1.isEmpty() || apellido2.isEmpty() || telefono1.isEmpty() || provincia.isEmpty() || canton.isEmpty() || distrito.isEmpty() || genero.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(view, "Debe de llenar los campos obligatorios.");
            return false;
        }
        if (telefono1.length() != 8 || (telefono2.length() != 0 && telefono2.length() != 8)) {
            javax.swing.JOptionPane.showMessageDialog(view, "El número de teléfono debe tener 8 dígitos.");
            return false;
        }
        return true;
    }

    public void updateStudentData(int idEstudiante, String text, String text0, String text1, String text2, String text3, String text4, String text5, String text6, String text7, String text8, String text9, String toString, int edad) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

