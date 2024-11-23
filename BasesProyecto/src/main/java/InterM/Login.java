/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterM;

import InterM.InterFacilitators;
import InterM.RestPass;
import InterfaW.Student_interface;
import Interface.AdmistratorInterface;
import Model.ConnectionSQLdb;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelle F
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
          if (Panel != null) {
        //panel trasparente 
        Panel.setBackground(new Color(255, 255, 255, 100)); // Blanco con 100 de opacidad 
        Panel.setOpaque(true); }
       
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        RestPass = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        LblContrasenia = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        Password.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Password.setBorder(null);
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        btnEntrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(87, 73, 98));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(null);
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        RestPass.setBackground(new java.awt.Color(204, 0, 0));
        RestPass.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        RestPass.setForeground(new java.awt.Color(87, 73, 98));
        RestPass.setText("       ¿Olvidó su contraseña?");
        RestPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestPassMouseClicked(evt);
            }
        });

        LblUsuario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(87, 73, 98));
        LblUsuario.setText("Usuario:");

        LblContrasenia.setBackground(new java.awt.Color(195, 141, 249));
        LblContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        LblContrasenia.setForeground(new java.awt.Color(87, 73, 98));
        LblContrasenia.setText("Contraseña:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-online-group-studying-96 (1).png"))); // NOI18N

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblContrasenia)
                            .addComponent(LblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(txtUsuario)
                            .addComponent(Password))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(RestPass, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Password))
                .addGap(41, 41, 41)
                .addComponent(btnEntrar)
                .addGap(30, 30, 30)
                .addComponent(RestPass)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel2.add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 540, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/gradient_1000_700.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        String enteredUser = txtUsuario.getText().trim();
        String enteredPassword = new String(Password.getPassword());

        ConnectionSQLdb connectionSQLdb = new ConnectionSQLdb();
        Connection conn = null;

        String query = "SELECT Contrasena, Rol FROM Usuarios WHERE Nombre_usuario = ?";
        try {
            conn = connectionSQLdb.getConnection();

            if (conn != null) {
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, enteredUser);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    String dbPassword = rs.getString("Contrasena");
                    String dbRol = rs.getString("Rol");

                    if (dbPassword.equals(enteredPassword)) {
                        if ("Facilitador".equalsIgnoreCase(dbRol)) {
                            JOptionPane.showMessageDialog(this, "Login exitoso como Facilitador");
                            InterFacilitators interFacilitators = new InterFacilitators(enteredUser);
                            JFrame frame = new JFrame("Interfaz de Facilitadores");
                            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            frame.setContentPane(interFacilitators);
                            frame.setSize(990, 760);
                            frame.setLocationRelativeTo(null);
                            frame.setVisible(true);
                            dispose();
                        }

                        if ("Administrador".equalsIgnoreCase(dbRol)) {
                            JOptionPane.showMessageDialog(this, "Login exitoso como Administrador");

                                // Crear y mostrar directamente la interfaz de administrador
                                AdmistratorInterface adminInterface = new AdmistratorInterface();
                                adminInterface.setVisible(true);

                                dispose(); // Cerrar la ventana de login

                        } else if ("Estudiante".equalsIgnoreCase(dbRol)) {
                            JOptionPane.showMessageDialog(this, "Login exitoso como Estudiante");

                            // Redirigir directamente a Student_interface
                            Student_interface studentInterface = new Student_interface();
                            studentInterface.setVisible(true); // Mostrar ventana
                            dispose(); // Cerrar ventana de login
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Usuario no encontrado");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en la conexión: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al cerrar la conexión: " + e.getMessage());
            }
        }

    }//GEN-LAST:event_btnEntrarMouseClicked

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void RestPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestPassMouseClicked
        JFrame resetFrame = new JFrame("Restablecer Contraseña");
    RestPass resetPanel = new RestPass();
    resetFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    resetFrame.getContentPane().add(resetPanel);
    resetFrame.setSize(400, 300);
    resetFrame.setLocationRelativeTo(null);
    resetFrame.setVisible(true);
    }//GEN-LAST:event_RestPassMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblContrasenia;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JPanel Panel;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel RestPass;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
