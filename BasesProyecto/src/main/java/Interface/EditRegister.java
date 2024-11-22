/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;

import Controller.controller;
import Model.ConnectionSQLdb;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Marcelle F
 */




public class EditRegister extends javax.swing.JPanel {

    /**
     * Creates new form EditRegister
     */
public EditRegister() {
    initComponents();

    // Configurar campos como no editables inicialmente
    Name.setEditable(true);
    Age.setEditable(true);
    Birthdate.setEditable(false);
    Canton.setEditable(true);
    District.setEditable(true);
    Email.setEditable(true);
    Gender.setEditable(false);
    Id.setEditable(false);
    Lastname1.setEditable(true);
    Lastname2.setEditable(true);
    Password.setEditable(true);
    Province.setEditable(true);
    Rol.setEditable(false);
    Tel1.setEditable(true);
    Tel2.setEditable(true);
    UserName.setEditable(true);
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
        profilepanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Lastname2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Gender = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Tel2 = new javax.swing.JTextField();
        Tel1 = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        District = new javax.swing.JTextField();
        Province = new javax.swing.JTextField();
        Canton = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Lastname1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Rol = new javax.swing.JTextField();
        Birthdate = new javax.swing.JTextField();
        BtnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 242, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profilepanel.setBackground(new java.awt.Color(255, 242, 255));
        profilepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Apellido2");
        profilepanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        Lastname2.setEditable(false);
        Lastname2.setBackground(new java.awt.Color(255, 255, 255));
        Lastname2.setBorder(null);
        Lastname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lastname2ActionPerformed(evt);
            }
        });
        profilepanel.add(Lastname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, 30));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nombre de Usuario:");
        profilepanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        UserName.setEditable(false);
        UserName.setBackground(new java.awt.Color(255, 255, 255));
        UserName.setBorder(null);
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });
        profilepanel.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 150, 30));

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Identificación");
        profilepanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Género:");
        profilepanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Fecha de nacimiento");
        profilepanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        Email.setEditable(false);
        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setBorder(null);
        profilepanel.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 150, 30));

        Gender.setEditable(false);
        Gender.setBackground(new java.awt.Color(255, 255, 255));
        Gender.setBorder(null);
        profilepanel.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 100, 30));

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Telefono1");
        profilepanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Telefono2");
        profilepanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        Tel2.setEditable(false);
        Tel2.setBackground(new java.awt.Color(255, 255, 255));
        Tel2.setBorder(null);
        profilepanel.add(Tel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 100, 30));

        Tel1.setEditable(false);
        Tel1.setBackground(new java.awt.Color(255, 255, 255));
        Tel1.setBorder(null);
        profilepanel.add(Tel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 170, 30));

        Age.setEditable(false);
        Age.setBackground(new java.awt.Color(255, 255, 255));
        Age.setBorder(null);
        profilepanel.add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 150, 30));

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Correo");
        profilepanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        Password.setEditable(false);
        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setBorder(null);
        profilepanel.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 170, 30));

        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Edad");
        profilepanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Distrito");
        profilepanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Provincia");
        profilepanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Cantón");
        profilepanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        District.setEditable(false);
        District.setBackground(new java.awt.Color(255, 255, 255));
        District.setBorder(null);
        profilepanel.add(District, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 100, 30));

        Province.setEditable(false);
        Province.setBackground(new java.awt.Color(255, 255, 255));
        Province.setBorder(null);
        profilepanel.add(Province, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, 30));

        Canton.setEditable(false);
        Canton.setBackground(new java.awt.Color(255, 255, 255));
        Canton.setBorder(null);
        profilepanel.add(Canton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 170, 30));

        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Contraseña");
        profilepanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        Id.setEditable(false);
        Id.setBackground(new java.awt.Color(255, 255, 255));
        Id.setBorder(null);
        profilepanel.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 170, 30));

        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Nombre");
        profilepanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        Name.setEditable(false);
        Name.setBackground(new java.awt.Color(255, 255, 255));
        Name.setBorder(null);
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        profilepanel.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, 30));

        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Apellido1");
        profilepanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        Lastname1.setEditable(false);
        Lastname1.setBackground(new java.awt.Color(255, 255, 255));
        Lastname1.setBorder(null);
        profilepanel.add(Lastname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, 30));

        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Rol");
        profilepanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        Rol.setEditable(false);
        Rol.setBackground(new java.awt.Color(255, 255, 255));
        Rol.setBorder(null);
        Rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RolActionPerformed(evt);
            }
        });
        profilepanel.add(Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 100, 30));

        Birthdate.setEditable(false);
        Birthdate.setBackground(new java.awt.Color(255, 255, 255));
        Birthdate.setBorder(null);
        profilepanel.add(Birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 150, 30));

        BtnSave.setText("Guardar");
        BtnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });
        profilepanel.add(BtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 420, 70, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Editar Registro");
        profilepanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jPanel1.add(profilepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Lastname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lastname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lastname2ActionPerformed

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    private void RolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RolActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
    try {
        // Obtener los valores del formulario
        String na = Name.getText();
        String age = Age.getText();
        String bir = Birthdate.getText();
        String can = Canton.getText();
        String dis = District.getText();
        String em = Email.getText();
        String gen = Gender.getText();
        String id = Id.getText();
        String ln1 = Lastname1.getText();
        String ln2 = Lastname2.getText();
        String pa = Password.getText();
        String pr = Province.getText();
        String ro = Rol.getText();
        String t1 = Tel1.getText();
        String t2 = Tel2.getText();
        String un = UserName.getText();

        // Conectar a la base de datos y ejecutar la actualización
        String updateQuery = "UPDATE Usuarios SET Nombre = ?, Apellido1 = ?, Apellido2 = ?, Rol = ?, " +
                "Nombre_usuario = ?, Telefono_principal = ?, Teléfono_secundario = ?, Correo = ?, " +
                "Contrasena = ?, Provincia = ?, Canton = ?, Distrito = ?, Genero = ?, Fecha_nacimiento = ?, Edad = ? " +
                "WHERE Identificacion = ?";

        try (Connection conn = new ConnectionSQLdb().getConnection();
             PreparedStatement stmt = conn.prepareStatement(updateQuery)) {

            // Establecer los valores en el PreparedStatement
            stmt.setString(1, na);
            stmt.setString(2, ln1);
            stmt.setString(3, ln2);
            stmt.setString(4, ro);
            stmt.setString(5, un);
            stmt.setString(6, t1);
            stmt.setString(7, t2);
            stmt.setString(8, em);
            stmt.setString(9, pa);
            stmt.setString(10, pr);
            stmt.setString(11, can);
            stmt.setString(12, dis);
            stmt.setString(13, gen);
            stmt.setString(14, bir); // Asegúrate de que el formato sea correcto (yyyy-MM-dd)
            stmt.setInt(15, Integer.parseInt(age));
            stmt.setString(16, id);

            // Ejecutar la actualización
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Registro actualizado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar el registro.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al guardar los cambios: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
 SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

public void loadCourseDataToForm(String na, String age, String bir, 
        String can, String dis, String em, String gen, String id, String ln1,
        String ln2, String pa, String pr, String ro, String t1, String t2, String un) {

    Name.setText(na);
    Age.setText(age);
    Birthdate.setText(bir);
    Canton.setText(can);
    District.setText(dis);
    Email.setText(em);
    Gender.setText(gen);
    Id.setText(id);
    Lastname1.setText(ln1); 
    Lastname2.setText(ln2);
    Password.setText(pa);
    Province.setText(pr);
    Rol.setText(ro);
    Tel1.setText(t1);
    Tel2.setText(t2);
    UserName.setText(un);
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JTextField Birthdate;
    private javax.swing.JButton BtnSave;
    private javax.swing.JTextField Canton;
    private javax.swing.JTextField District;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Gender;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Lastname1;
    private javax.swing.JTextField Lastname2;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Password;
    private javax.swing.JTextField Province;
    private javax.swing.JTextField Rol;
    private javax.swing.JTextField Tel1;
    private javax.swing.JTextField Tel2;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel profilepanel;
    // End of variables declaration//GEN-END:variables
}