
package InterfaW;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author wendy_6rrub
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public Profile() {
        initComponents();
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public void ShowPanel(javax.swing.JPanel p) {
        p.setSize(660, 60); 
        p.setLocation(0, 0);
        Content4.removeAll();
        Content4.add(p, BorderLayout.CENTER);
        Content4.revalidate();
        Content4.repaint();
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        Content4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTel2 = new javax.swing.JTextField();
        txtTel1 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtDistrict = new javax.swing.JTextField();
        txtProvince = new javax.swing.JTextField();
        txtCanton = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        profilepanel.setBackground(new java.awt.Color(216, 226, 219));
        profilepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/7853767_kashifarif_user_profile_person_account_icon.png"))); // NOI18N
        profilepanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 130, 140));

        jButton1.setText("EDITAR PERFIL");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        profilepanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 130, -1));

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Mi Perfil");
        profilepanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 120, -1));

        jLabel3.setText("NOMBRE COMPLETO:");
        profilepanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        profilepanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 250, 30));

        jLabel4.setText("ROL:");
        profilepanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        profilepanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 100, 30));

        Content4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout Content4Layout = new javax.swing.GroupLayout(Content4);
        Content4.setLayout(Content4Layout);
        Content4Layout.setHorizontalGroup(
            Content4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        Content4Layout.setVerticalGroup(
            Content4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        profilepanel.add(Content4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 660, 60));

        jLabel5.setText("IDENTIFICACIÓN:");
        profilepanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLabel6.setText("GÉNERO:");
        profilepanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        jLabel7.setText("FECHA DE NACIMIENTO:");
        profilepanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(null);
        profilepanel.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 170, 30));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(null);
        profilepanel.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 170, 30));

        jLabel8.setText("TELEFONO 1:");
        profilepanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        jLabel9.setText("TELEFONO 2:");
        profilepanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        txtTel2.setEditable(false);
        txtTel2.setBackground(new java.awt.Color(255, 255, 255));
        txtTel2.setBorder(null);
        profilepanel.add(txtTel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 170, 30));

        txtTel1.setEditable(false);
        txtTel1.setBackground(new java.awt.Color(255, 255, 255));
        txtTel1.setBorder(null);
        profilepanel.add(txtTel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 170, 30));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setBorder(null);
        profilepanel.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 170, 30));

        jLabel10.setText("CORREO:");
        profilepanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        profilepanel.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 310, 30));

        jLabel11.setText("DIRECCIÓN:");
        profilepanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        jLabel12.setText("Distrito:");
        profilepanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, -1));

        jLabel13.setText("Provincia:");
        profilepanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        jLabel14.setText("Cantón:");
        profilepanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        txtDistrict.setEditable(false);
        txtDistrict.setBackground(new java.awt.Color(255, 255, 255));
        txtDistrict.setBorder(null);
        profilepanel.add(txtDistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 220, 20));

        txtProvince.setEditable(false);
        txtProvince.setBackground(new java.awt.Color(255, 255, 255));
        txtProvince.setBorder(null);
        profilepanel.add(txtProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 220, 20));

        txtCanton.setEditable(false);
        txtCanton.setBackground(new java.awt.Color(255, 255, 255));
        txtCanton.setBorder(null);
        profilepanel.add(txtCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 220, 20));

        jLabel15.setText("@usuario");
        profilepanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel16.setText("CAMPO ESPECIAL:");
        profilepanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(255, 255, 255));
        jTextField12.setBorder(null);
        profilepanel.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profilepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profilepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        SaveProfile sv = new SaveProfile();
        ShowPanel(sv);
        
        boolean editable = txtTel1.isEditable();
        txtTel1.setEditable(!editable);
        txtTel2.setEditable(!editable);
    }//GEN-LAST:event_jButton1MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    public javax.swing.JPanel profilepanel;
    private javax.swing.JTextField txtCanton;
    private javax.swing.JTextField txtDistrict;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtProvince;
    private javax.swing.JTextField txtTel1;
    private javax.swing.JTextField txtTel2;
    // End of variables declaration//GEN-END:variables
}