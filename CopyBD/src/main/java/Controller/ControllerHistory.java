/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Interface.ViewHistory;
import Model.HistoryDAO;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author franc
 */
public class ControllerHistory {

     private ViewHistory view;
    private HistoryDAO historyDAO;

    public ControllerHistory(ViewHistory view) {
        this.view = view;
        this.historyDAO = new HistoryDAO();
    }

    public void loadHistoryData(JTable table, String searchTerm, String course) {
        DefaultTableModel model = new DefaultTableModel(
            new String[] {
                "ID Estudiante", "Identificación", "Nombre", "Apellido1", "Apellido2", 
                "Necesidad Especial", "Sigla", "Nombre Curso", "Modalidad", 
                "Área Especialización", "Horarios", "Fecha Inicio", "Fecha Fin"
            }, 
            0
        );
        table.setModel(model);

        List<Object[]> data = historyDAO.getHistoryData(searchTerm, course);

        for (Object[] row : data) {
            model.addRow(row);
        }
    }

    public void loadCourses(javax.swing.JComboBox<String> comboBox) {
        List<String> courses = historyDAO.getAllCourses();
        comboBox.removeAllItems();
        comboBox.addItem("Todos");
        for (String course : courses) {
            comboBox.addItem(course);
        }
    }
}
