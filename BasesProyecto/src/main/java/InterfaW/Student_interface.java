
package InterfaW;

import Controller.controller;
import java.awt.event.ActionEvent;

/**
 *
 * @author wendy_6rrub
 */
public class Student_interface extends javax.swing.JFrame{
    controller controller = new controller();
    CurrentCourses cc = new CurrentCourses();
    StudentExpedient se = new StudentExpedient();
    
    
    public Student_interface() {
        initComponents();
        
        setLocationRelativeTo(null); 
        controller.list(cc.tableCurrent);
        controller.listExpedient(se.tableExpe);
        
        ShowPanel(cc);
        
        String userName = controller.getUserName();

        cc.lblStudentName.setText("¡Hola, " + userName + "!");
        lblProfilepanel.setText(userName);
        
    }

    // Método para alternar entre paneles
    public void ShowPanel(javax.swing.JPanel p) {
        p.setSize(Content3.getWidth(), Content3.getHeight()); 
        p.setLocation(0, 0); 

        Content3.removeAll(); 
        Content3.add(p); 
        Content3.revalidate(); 
        Content3.repaint(); 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        Content3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnCurrentCourses = new javax.swing.JButton();
        btnSchedule = new javax.swing.JButton();
        btnExpedient = new javax.swing.JButton();
        lblProfilepanel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Content3.setBackground(new java.awt.Color(255, 255, 255));
        Content3.setPreferredSize(new java.awt.Dimension(709, 604));

        javax.swing.GroupLayout Content3Layout = new javax.swing.GroupLayout(Content3);
        Content3.setLayout(Content3Layout);
        Content3Layout.setHorizontalGroup(
            Content3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        Content3Layout.setVerticalGroup(
            Content3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(Content3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 660, 510));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        btnCurrentCourses.setBackground(new java.awt.Color(255, 255, 255));
        btnCurrentCourses.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        btnCurrentCourses.setForeground(new java.awt.Color(0, 102, 0));
        btnCurrentCourses.setText("Cursando");
        btnCurrentCourses.setToolTipText("");
        btnCurrentCourses.setBorder(null);
        btnCurrentCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCurrentCoursesMouseClicked(evt);
            }
        });
        btnCurrentCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurrentCoursesActionPerformed(evt);
            }
        });

        btnSchedule.setBackground(new java.awt.Color(255, 255, 255));
        btnSchedule.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        btnSchedule.setForeground(new java.awt.Color(0, 102, 0));
        btnSchedule.setText("Horario");
        btnSchedule.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnScheduleMouseClicked(evt);
            }
        });
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });

        btnExpedient.setBackground(new java.awt.Color(255, 255, 255));
        btnExpedient.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        btnExpedient.setForeground(new java.awt.Color(0, 102, 0));
        btnExpedient.setText("Historial");
        btnExpedient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnExpedient.setBorderPainted(false);
        btnExpedient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExpedientMouseClicked(evt);
            }
        });

        lblProfilepanel.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        lblProfilepanel.setForeground(new java.awt.Color(76, 30, 124));
        lblProfilepanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-user-48 (1).png"))); // NOI18N
        lblProfilepanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProfilepanelMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LOGOOO.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-logout-24.png"))); // NOI18N
        jLabel5.setText("Cerrar Sesión");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addComponent(btnExpedient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCurrentCourses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblProfilepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblProfilepanel)
                .addGap(33, 33, 33)
                .addComponent(btnCurrentCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExpedient, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(43, 43, 43)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 200, 510));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/green.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCurrentCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurrentCoursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCurrentCoursesActionPerformed

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleActionPerformed
        StudentSchedule ss = new StudentSchedule();
        ShowPanel(ss);
    }//GEN-LAST:event_btnScheduleActionPerformed

    private void btnScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScheduleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnScheduleMouseClicked

    private void btnExpedientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpedientMouseClicked
        
        ShowPanel(se);
    }//GEN-LAST:event_btnExpedientMouseClicked

    private void btnCurrentCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCurrentCoursesMouseClicked

        ShowPanel(cc); 
    }//GEN-LAST:event_btnCurrentCoursesMouseClicked

    private void lblProfilepanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProfilepanelMouseClicked
        Profile pr = new Profile();
        pr.setVisible(true);
        pr.setLocationRelativeTo(null); 
        
    }//GEN-LAST:event_lblProfilepanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content3;
    private javax.swing.JButton btnCurrentCourses;
    private javax.swing.JButton btnExpedient;
    private javax.swing.JButton btnSchedule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblProfilepanel;
    // End of variables declaration//GEN-END:variables



}
