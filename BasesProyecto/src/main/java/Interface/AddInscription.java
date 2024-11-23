/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;

import Controller.ControllerInscriptions;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author wendy_6rrub
 */
public class AddInscription extends javax.swing.JPanel {

    /**
     * Creates new form AddInscription
     */
    public AddInscription() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodeI = new javax.swing.JTextField();
        txtIdF = new javax.swing.JTextField();
        txtIdS = new javax.swing.JTextField();
        txtSigla = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        btnAddInscrip = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nueva Inscripción");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        txtCodeI.setEditable(false);
        txtCodeI.setBackground(new java.awt.Color(204, 255, 255));
        txtCodeI.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtCodeI.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtCodeI, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 134, -1));

        txtIdF.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtIdF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdFActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 134, -1));

        txtIdS.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jPanel1.add(txtIdS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 166, 134, -1));

        txtSigla.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jPanel1.add(txtSigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 216, 134, -1));

        txtDate.setEditable(false);
        txtDate.setBackground(new java.awt.Color(204, 255, 255));
        txtDate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtDate.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 266, 134, -1));

        btnAddInscrip.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnAddInscrip.setText("Agregar");
        btnAddInscrip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddInscripMouseClicked(evt);
            }
        });
        btnAddInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddInscripActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddInscrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 327, 109, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Código:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("ID Facilitador:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 20));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("ID Estudiante:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 20));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Sigla curso:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 20));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Fecha matrícula:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddInscripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddInscripActionPerformed

    private void txtIdFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdFActionPerformed

    private void btnAddInscripMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddInscripMouseClicked
        ControllerInscriptions cin = new ControllerInscriptions();
        
        String idCour= txtSigla.getText();
        String idIns= txtCodeI.getText();
        String idStd= txtIdS.getText();
        String idFac= txtIdF.getText();
        String date = txtDate.getText();
        
        if(idCour == null || idIns == null || idStd == null || idFac == null || date == null){
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos obligatorios.");
            return;
        }
        
        int idS = Integer.parseInt(idStd);
        int idF = Integer.parseInt(idFac);
        
        try {
            cin.addInscriptions(idIns, idCour, idS, idF, date);
        } catch (ParseException ex) {
            Logger.getLogger(AddInscription.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddInscripMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddInscrip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtCodeI;
    public javax.swing.JTextField txtDate;
    public javax.swing.JTextField txtIdF;
    public javax.swing.JTextField txtIdS;
    public javax.swing.JTextField txtSigla;
    // End of variables declaration//GEN-END:variables
}
