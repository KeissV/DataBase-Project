/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;

import Model.ConnectionSQLdb;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Marcelle F
 */
public class Register extends javax.swing.JPanel {

    /**
     * Creates new form Registro
     */
 public Register() {
    initComponents();

    Name.setEditable(true);
    Lastname1.setEditable(true);
    Lastname2.setEditable(true);
    Province.setEditable(true);
    Canton.setEditable(true);
    District.setEditable(true);
    Email.setEditable(true);
    Password.setEditable(true);
    Tel1.setEditable(true);
    Tel2.setEditable(true);
    Gender.setEditable(true);
    Id.setEditable(true);
    UserName.setEditable(true);
    Rol.setEditable(true);
    Birthdate.setEditable(true);
    Age.setEditable(true);
    
    Email.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        @Override
        public void insertUpdate(javax.swing.event.DocumentEvent e) {
            validateEmail();
        }

        @Override
        public void removeUpdate(javax.swing.event.DocumentEvent e) {
            validateEmail();
        }

        @Override
        public void changedUpdate(javax.swing.event.DocumentEvent e) {
            validateEmail();
        }

        private void validateEmail() {
            if (!Email.getText().contains("@")) {
                Email.setBackground(Color.PINK);
            } else {
                Email.setBackground(Color.WHITE); 
            }
        }
    });
}

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profilepanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        District = new javax.swing.JTextField();
        Province = new javax.swing.JTextField();
        Canton = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Lastname1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Rol = new javax.swing.JTextField();
        Birthdate = new javax.swing.JTextField();
        BtnRegister = new javax.swing.JButton();

        profilepanel.setBackground(new java.awt.Color(255, 242, 255));
        profilepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Registro");
        profilepanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 120, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("APELLIDO2:");
        profilepanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        Lastname2.setEditable(false);
        Lastname2.setBackground(new java.awt.Color(255, 255, 255));
        Lastname2.setBorder(null);
        Lastname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lastname2ActionPerformed(evt);
            }
        });
        profilepanel.add(Lastname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel4.setText("NOMBRE USUARIO:");
        profilepanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        UserName.setEditable(false);
        UserName.setBackground(new java.awt.Color(255, 255, 255));
        UserName.setBorder(null);
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });
        profilepanel.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 170, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel5.setText("IDENTIFICACIÓN:");
        profilepanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel6.setText("GÉNERO:");
        profilepanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel7.setText("FECHA DE NACIMIENTO:");
        profilepanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        Email.setEditable(false);
        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setBorder(null);
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        profilepanel.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 170, 30));

        Gender.setEditable(false);
        Gender.setBackground(new java.awt.Color(255, 255, 255));
        Gender.setBorder(null);
        Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderActionPerformed(evt);
            }
        });
        profilepanel.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 100, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel8.setText("TELEFONO 1:");
        profilepanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel9.setText("TELEFONO 2:");
        profilepanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        Tel2.setEditable(false);
        Tel2.setBackground(new java.awt.Color(255, 255, 255));
        Tel2.setBorder(null);
        Tel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tel2ActionPerformed(evt);
            }
        });
        profilepanel.add(Tel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 100, 30));

        Tel1.setEditable(false);
        Tel1.setBackground(new java.awt.Color(255, 255, 255));
        Tel1.setBorder(null);
        Tel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tel1ActionPerformed(evt);
            }
        });
        profilepanel.add(Tel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 170, 30));

        Age.setEditable(false);
        Age.setBackground(new java.awt.Color(255, 255, 255));
        Age.setBorder(null);
        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });
        profilepanel.add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 170, 30));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel10.setText("CORREO:");
        profilepanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        Password.setEditable(false);
        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setBorder(null);
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        profilepanel.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 170, 30));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel11.setText("EDAD:");
        profilepanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel12.setText("DISTRITO:");
        profilepanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel13.setText("PROVINCIA:");
        profilepanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel14.setText("CANTÓN:");
        profilepanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        District.setEditable(false);
        District.setBackground(new java.awt.Color(255, 255, 255));
        District.setBorder(null);
        District.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistrictActionPerformed(evt);
            }
        });
        profilepanel.add(District, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 100, 30));

        Province.setEditable(false);
        Province.setBackground(new java.awt.Color(255, 255, 255));
        Province.setBorder(null);
        Province.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProvinceActionPerformed(evt);
            }
        });
        profilepanel.add(Province, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 100, 30));

        Canton.setEditable(false);
        Canton.setBackground(new java.awt.Color(255, 255, 255));
        Canton.setBorder(null);
        Canton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantonActionPerformed(evt);
            }
        });
        profilepanel.add(Canton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 170, 30));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel16.setText("CONTRASEÑA");
        profilepanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        Id.setEditable(false);
        Id.setBackground(new java.awt.Color(255, 255, 255));
        Id.setBorder(null);
        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });
        profilepanel.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 170, 30));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel15.setText("NOMBRE:");
        profilepanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        Name.setEditable(false);
        Name.setBackground(new java.awt.Color(255, 255, 255));
        Name.setBorder(null);
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        profilepanel.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 100, 30));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel17.setText("APELLIDO:");
        profilepanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        Lastname1.setEditable(false);
        Lastname1.setBackground(new java.awt.Color(255, 255, 255));
        Lastname1.setBorder(null);
        Lastname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lastname1ActionPerformed(evt);
            }
        });
        profilepanel.add(Lastname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 100, 30));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel18.setText("ROL:");
        profilepanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        Rol.setEditable(false);
        Rol.setBackground(new java.awt.Color(255, 255, 255));
        Rol.setBorder(null);
        Rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RolActionPerformed(evt);
            }
        });
        profilepanel.add(Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 100, 30));

        Birthdate.setEditable(false);
        Birthdate.setBackground(new java.awt.Color(255, 255, 255));
        Birthdate.setBorder(null);
        Birthdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BirthdateActionPerformed(evt);
            }
        });
        profilepanel.add(Birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 170, 30));

        BtnRegister.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        BtnRegister.setText("Registrar");
        BtnRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegisterActionPerformed(evt);
            }
        });
        profilepanel.add(BtnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(profilepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profilepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegisterActionPerformed
                                            
    if (Id.getText().length() != 9) {
        JOptionPane.showMessageDialog(this, "La identificación debe tener exactamente 9 caracteres.");
        return;
    }
    
    if (!Email.getText().contains("@")) {
        JOptionPane.showMessageDialog(this, "El correo debe contener un '@'.");
        return;
    }

    try {
        int age = Integer.parseInt(Age.getText());
        if (age < 0 || age > 120) {
            JOptionPane.showMessageDialog(this, "La edad debe estar entre 0 y 120 años.");
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "La edad debe ser un número.");
        return;
    }

    if (Tel1.getText().length() < 8 || Tel2.getText().length() < 8) {
        JOptionPane.showMessageDialog(this, "Los números de teléfono deben tener al menos 8 caracteres.");
        return;
    }

    if (Name.getText().isEmpty() || Lastname1.getText().isEmpty() || Lastname2.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Los campos de nombre y apellidos no pueden estar vacíos.");
        return;
    }

    if (Password.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "La contraseña no puede estar vacía.");
        return;
    }

    guardarDatos();
 SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_BtnRegisterActionPerformed

    private void guardarDatos() {
    String query = "INSERT INTO Usuarios (Identificacion, Nombre, Apellido1, Apellido2, Rol, Nombre_usuario, " +
                   "Telefono_principal, Teléfono_secundario, Correo, Contrasena, Provincia, " +
                   "Canton, Distrito, Genero, Fecha_nacimiento, Edad) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = new ConnectionSQLdb().getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setString(1, Id.getText());
        stmt.setString(2, Name.getText());
        stmt.setString(3, Lastname1.getText());
        stmt.setString(4, Lastname2.getText());
        stmt.setString(5, Rol.getText());
        stmt.setString(6, UserName.getText());
        stmt.setString(7, Tel1.getText());
        stmt.setString(8, Tel2.getText());
        stmt.setString(9, Email.getText());
        stmt.setString(10, Password.getText());
        stmt.setString(11, Province.getText());
        stmt.setString(12, Canton.getText());
        stmt.setString(13, District.getText());
        stmt.setString(14, Gender.getText());
        stmt.setString(15, Birthdate.getText());
        stmt.setInt(16, Integer.parseInt(Age.getText()));

        stmt.executeUpdate();

        JOptionPane.showMessageDialog(this, "Registro exitoso.");
        limpiarCampos();

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al registrar: " + e.getMessage());
    }
}
    
    private void limpiarCampos() {
    Name.setText("");
    Age.setText("");
    Birthdate.setText("");
    Canton.setText("");
    District.setText("");
    Email.setText("");
    Gender.setText("");
    Id.setText("");
    Lastname1.setText("");
    Lastname2.setText("");
    Password.setText("");
    Province.setText("");
    Rol.setText("");
    Tel1.setText("");
    Tel2.setText("");
    UserName.setText("");
}


    
    private void RolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RolActionPerformed

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    private void Lastname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lastname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lastname2ActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void Lastname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lastname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lastname1ActionPerformed

    private void ProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProvinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProvinceActionPerformed

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdActionPerformed

    private void Tel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tel1ActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void CantonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantonActionPerformed

    private void Tel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tel2ActionPerformed

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderActionPerformed

    private void DistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistrictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DistrictActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void BirthdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BirthdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BirthdateActionPerformed

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JTextField Birthdate;
    private javax.swing.JButton BtnRegister;
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel profilepanel;
    // End of variables declaration//GEN-END:variables
}
