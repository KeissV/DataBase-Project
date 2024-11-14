package Class;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author franc
 */
public class Admistrator extends javax.swing.JFrame {

    /**
     * Creates new form Admistrator
     */
    public Admistrator() {
        initComponents();
        configureLabels();
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
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        profile = new javax.swing.JLabel();
        RegisterPeople = new javax.swing.JLabel();
        ManageStaff = new javax.swing.JLabel();
        ManageCourses = new javax.swing.JLabel();
        ManageRegistrations = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        RegisterPeople1 = new javax.swing.JLabel();
        ManageStaff1 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(206, 206, 255));

        jPanel3.setBackground(new java.awt.Color(137, 103, 214));

        jPanel2.setBackground(new java.awt.Color(154, 176, 243));

        profile.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        profile.setForeground(new java.awt.Color(255, 255, 255));
        profile.setText("Perfil");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profile)
                .addGap(88, 88, 88))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(profile)
                .addGap(40, 40, 40))
        );

        RegisterPeople.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        RegisterPeople.setForeground(new java.awt.Color(255, 255, 255));
        RegisterPeople.setText("Registrar Personas");
        RegisterPeople.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterPeopleMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegisterPeopleMousePressed(evt);
            }
        });

        ManageStaff.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ManageStaff.setForeground(new java.awt.Color(255, 255, 255));
        ManageStaff.setText("Gestionar Personal");

        ManageCourses.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ManageCourses.setForeground(new java.awt.Color(255, 255, 255));
        ManageCourses.setText("Gestionar Cursos");

        ManageRegistrations.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ManageRegistrations.setForeground(new java.awt.Color(255, 255, 255));
        ManageRegistrations.setText("Gestionar Inscripciones");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(RegisterPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(ManageStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(ManageCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(ManageRegistrations)
                .addGap(87, 87, 87))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterPeople)
                    .addComponent(ManageStaff)
                    .addComponent(ManageCourses)
                    .addComponent(ManageRegistrations))
                .addGap(21, 21, 21))
        );

        jPanel4.setBackground(new java.awt.Color(137, 103, 214));

        RegisterPeople1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        RegisterPeople1.setForeground(new java.awt.Color(255, 255, 255));
        RegisterPeople1.setText("Registrar Personas");
        RegisterPeople1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterPeople1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegisterPeople1MousePressed(evt);
            }
        });

        ManageStaff1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ManageStaff1.setForeground(new java.awt.Color(255, 255, 255));
        ManageStaff1.setText("Gestionar Personal");

        Exit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Salir");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(RegisterPeople1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(ManageStaff1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RegisterPeople1)
                        .addComponent(ManageStaff1)))
                .addGap(21, 21, 21))
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Historial de Estudiantes");
        jLabel1.setFocusCycleRoot(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(351, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(356, 356, 356))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 424, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterPeopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterPeopleMouseClicked
       new Login().setVisible(true);
    }//GEN-LAST:event_RegisterPeopleMouseClicked

    private void RegisterPeopleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterPeopleMousePressed
    
    }//GEN-LAST:event_RegisterPeopleMousePressed

    private void RegisterPeople1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterPeople1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterPeople1MouseClicked

    private void RegisterPeople1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterPeople1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterPeople1MousePressed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        new Login().setVisible(true);
    }//GEN-LAST:event_ExitMouseClicked
private void configureLabels() {
    Color originalColor = new Color(137, 103, 214);
    Color originalColor2 = new Color(154,176,243);
        
        // Configurar los JLabel para que se comporten como botones y resalten
        configureLabel(RegisterPeople, originalColor, new Color(154,176,243));
        configureLabel(ManageStaff, originalColor, new Color(154,176,243));
        configureLabel(ManageCourses, originalColor, new Color(154,176,243));
        configureLabel(ManageRegistrations, originalColor, new Color(154,176,243));
        configureLabel(Exit, originalColor, new Color(154,176,243));
        configureLabel(profile, originalColor2, new Color(206,206,255));

    }

    private void configureLabel(JLabel label, Color originalColor, Color clickColor) {
        label.setOpaque(true); 
        label.setBackground(originalColor); 

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setCursor(new Cursor(Cursor.HAND_CURSOR));
                label.setBackground(clickColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setBackground(originalColor); 
            }

            @Override
            public void mousePressed(MouseEvent e) {
                label.setBackground(clickColor);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setBackground(originalColor); 
            }
            
            
        });
    }
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
            java.util.logging.Logger.getLogger(Admistrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admistrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admistrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admistrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admistrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel ManageCourses;
    private javax.swing.JLabel ManageRegistrations;
    private javax.swing.JLabel ManageStaff;
    private javax.swing.JLabel ManageStaff1;
    private javax.swing.JLabel RegisterPeople;
    private javax.swing.JLabel RegisterPeople1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel profile;
    // End of variables declaration//GEN-END:variables
}
