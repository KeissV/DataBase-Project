/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Interface.ManageStaff;
import Model.FacilitatorsDAO;
import Model.StudentsDAO;
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
}
