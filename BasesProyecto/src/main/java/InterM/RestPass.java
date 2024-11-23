/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterM;

import Model.ConnectionSQLdb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Marcelle F
 */
public class RestPass extends javax.swing.JPanel {

    /**
     * Creates new form RestPass
     */
    public RestPass() {
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

        UserName = new javax.swing.JLabel();
        NewPass = new javax.swing.JLabel();
        ConfiPass = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 175, 252));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        UserName.setForeground(new java.awt.Color(87, 73, 98));
        UserName.setText("Usuario");
        add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        NewPass.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        NewPass.setForeground(new java.awt.Color(87, 73, 98));
        NewPass.setText("Nueva Contraseña");
        add(NewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        ConfiPass.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        ConfiPass.setForeground(new java.awt.Color(87, 73, 98));
        ConfiPass.setText("Confirmar Constraseña");
        add(ConfiPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 230, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(87, 73, 98));
        jButton1.setText("Aceptar");
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 230, 20));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(null);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 230, -1));

        jPasswordField2.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setBorder(null);
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 230, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/gradient_1000_700.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
String username = jTextField1.getText().trim();
    String newPassword = jPasswordField1.getText().trim();
    String confirmPassword = jPasswordField2.getText().trim();

    if (username.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        return;
    }

    if (!newPassword.equals(confirmPassword)) {
        JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.");
        return;
    }

    String query = "UPDATE Usuarios SET Contrasena = ? WHERE Nombre_usuario = ?";

    try (Connection conn = new ConnectionSQLdb().getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setString(1, newPassword);
        stmt.setString(2, username);

        int rowsAffected = stmt.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Contraseña actualizada correctamente.");

            // Cerrar el panel actual
            ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Usuario no encontrado.");
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al actualizar la contraseña: " + e.getMessage());
    }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConfiPass;
    private javax.swing.JLabel NewPass;
    private javax.swing.JLabel UserName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
