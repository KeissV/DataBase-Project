/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Interface.ManageStaff;
import Model.FacilitatorsDAO;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author franc
 */


public final class ControllerFacilitators {
    

 private ManageStaff view;
    private FacilitatorsDAO dao;

    public ControllerFacilitators(ManageStaff view) {
        this.view = view;
        this.dao = new FacilitatorsDAO();
        loadFacilitatorsData(view.TeacStu);
    }

    public void loadFacilitatorsData(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de cargar datos
        List<Object[]> data = dao.getFacilitatorsData();

        for (Object[] row : data) {
            model.addRow(row);
        }
    }
}





