/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;

import java.awt.Color;

/**
 *
 * @author franc
 */
public class ManageStaff extends javax.swing.JPanel {

    /**
     * Creates new form ManageStaff
     */
    public ManageStaff() {
        initComponents();
        
         if (PanelMS != null) {
        //panel trasparente 
        PanelMS.setBackground(new Color(195,152,242, 47)); // Morado con 70 de opacidad 
        PanelMS.setOpaque(true); 
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

        PanelM = new javax.swing.JPanel();
        PanelMS = new javax.swing.JPanel();
        Search = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Erase = new javax.swing.JLabel();
        Modify = new javax.swing.JLabel();
        Teachers = new javax.swing.JLabel();
        Students = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelM.setBackground(new java.awt.Color(255, 255, 255));
        PanelM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMS.setBackground(new java.awt.Color(195, 152, 242));
        PanelMS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-search-more-24.png"))); // NOI18N
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        PanelMS.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 30, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(87, 73, 98));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        PanelMS.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 560, 40));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(87, 73, 98));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(234, 203, 234));
        jTable1.setSelectionForeground(new java.awt.Color(87, 73, 98));
        jScrollPane1.setViewportView(jTable1);

        PanelMS.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 111, 570, 440));

        Erase.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        Erase.setForeground(new java.awt.Color(87, 73, 98));
        Erase.setText("Eliminar");
        Erase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EraseMouseClicked(evt);
            }
        });
        PanelMS.add(Erase, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 60, 20));

        Modify.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        Modify.setForeground(new java.awt.Color(87, 73, 98));
        Modify.setText("Modificar");
        Modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModifyMouseClicked(evt);
            }
        });
        PanelMS.add(Modify, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, 70, 20));

        Teachers.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        Teachers.setForeground(new java.awt.Color(87, 73, 98));
        Teachers.setText("Profesores");
        Teachers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TeachersMouseClicked(evt);
            }
        });
        PanelMS.add(Teachers, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 20));

        Students.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        Students.setForeground(new java.awt.Color(87, 73, 98));
        Students.setText("Estudiantes");
        Students.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentsMouseClicked(evt);
            }
        });
        PanelMS.add(Students, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, 20));

        PanelM.add(PanelMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 670, 600));

        add(PanelM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchMouseClicked

    private void ModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ModifyMouseClicked

    private void EraseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EraseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EraseMouseClicked

    private void TeachersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeachersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TeachersMouseClicked

    private void StudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Erase;
    private javax.swing.JLabel Modify;
    private javax.swing.JPanel PanelM;
    private javax.swing.JPanel PanelMS;
    private javax.swing.JLabel Search;
    private javax.swing.JLabel Students;
    private javax.swing.JLabel Teachers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
