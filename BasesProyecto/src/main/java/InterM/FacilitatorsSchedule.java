/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterM;

import Model.ConnectionSQLdb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcelle F
 */
public class FacilitatorsSchedule extends javax.swing.JPanel {

    /**
     * Creates new form FacilitatorsSchedule
     */
public FacilitatorsSchedule() {
    initComponents();
    loadScheduleData(); 
}
public void loadScheduleData() {
    DefaultTableModel model = (DefaultTableModel) TblSchedule.getModel();
    model.setRowCount(0); 

    String query = "SELECT Horario, Nombre_curso, Sigla FROM Cursos"; 

    try (Connection conn = new ConnectionSQLdb().getConnection();
         PreparedStatement stmt = conn.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("Horario"),
                rs.getString("Nombre_curso"),
                rs.getString("Sigla")
            });
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage());
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCourses = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblSchedule = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelCourses.setBackground(new java.awt.Color(220, 241, 253));
        panelCourses.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TblSchedule.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        TblSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Horario", "Nombre_curso", "Sigla"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblSchedule.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane1.setViewportView(TblSchedule);

        panelCourses.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 520, 350));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("Horario");
        panelCourses.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(panelCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TblSchedule;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCourses;
    // End of variables declaration//GEN-END:variables
}
