/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Controller.controller;
import java.awt.Color;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author wendy_6rrub
 */
public class EditCourses extends javax.swing.JFrame {

    /**
     * Creates new form EditCourses
     */
    public EditCourses() {
        initComponents();
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
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
        btnEditCourse = new javax.swing.JButton();
        txtIni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cmbMod = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbArea = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbDur = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtSch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEnd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtOpe = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbQuan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 242, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Editar Curso");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        btnEditCourse.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnEditCourse.setText("Editar");
        btnEditCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditCourseMouseClicked(evt);
            }
        });
        jPanel1.add(btnEditCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 435, 96, -1));

        txtIni.setEditable(false);
        txtIni.setBackground(new java.awt.Color(204, 204, 204));
        txtIni.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 91, 103, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Sigla");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 95, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Nombre del curso");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, 20));

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 210, -1));

        cmbMod.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        cmbMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presencial", "Bimodal", "Virtual" }));
        jPanel1.add(cmbMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 110, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Modalidad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Area de especialización");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        cmbArea.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        cmbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arte", "Actividad física", "Salud y Bienestar", "Tecnología", "Medio ambiente" }));
        jPanel1.add(cmbArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 120, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Duración ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        cmbDur.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        cmbDur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 mes", "2 meses", "3 meses", "4 meses", "5 meses", "6 meses", "7 meses", "8 meses" }));
        jPanel1.add(cmbDur, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Horario [Días - horas]");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        txtSch.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtSch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 360, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Fecha de inicio");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        txtEnd.setBackground(new java.awt.Color(255, 255, 255));
        txtEnd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEndFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEndFocusLost(evt);
            }
        });
        jPanel1.add(txtEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 130, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Fecha finalización");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        txtOpe.setBackground(new java.awt.Color(255, 255, 255));
        txtOpe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOpeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOpeFocusLost(evt);
            }
        });
        jPanel1.add(txtOpe, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 130, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Cantidad estudiantes");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        cmbQuan.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        cmbQuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30" }));
        jPanel1.add(cmbQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOpeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOpeFocusGained
        if (txtOpe.getText().equals("yyyy-MM-dd")){
            txtOpe.setText("");
            txtOpe.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtOpeFocusGained

    private void txtOpeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOpeFocusLost
        if (txtOpe.getText().equals("")) {
            txtOpe.setText("yyyy-MM-dd");
            txtOpe.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtOpeFocusLost

    private void txtEndFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEndFocusGained
        if (txtEnd.getText().equals("yyyy-MM-dd")){
            txtEnd.setText("");
            txtEnd.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtEndFocusGained

    private void txtEndFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEndFocusLost
        if (txtEnd.getText().equals("")) {
            txtEnd.setText("yyyy-MM-dd");
            txtEnd.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtEndFocusLost

    private void btnEditCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditCourseMouseClicked
        controller control = new controller();
            String ini =txtIni.getText();
            String name = txtName.getText();
            String mod = (String) cmbMod.getSelectedItem();
            String area = (String) cmbArea.getSelectedItem();
            String quan = (String) cmbQuan.getSelectedItem();
            int qua = Integer.parseInt(quan);
            String sch = txtSch.getText();
            String ope = txtOpe.getText();
            String end = txtEnd.getText();
            String dur = (String) cmbDur.getSelectedItem(); 

        try {
            control.editCourse(ini, name, mod, area, qua, sch, dur, ope, end);
        } catch (ParseException ex) {
            Logger.getLogger(AddCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditCourseMouseClicked

public void loadCourseDataToForm(String sigla, String name, String mo, String area, int quan, String sch, String dur, String startDate, String endDate) {
    txtIni.setText(sigla); 
    txtIni.setEditable(false);

    txtName.setText(name);
    cmbMod.setSelectedItem(mo);
    cmbArea.setSelectedItem(area);
    cmbQuan.setSelectedItem(quan);
    txtSch.setText(sch);
    txtOpe.setText(startDate);
    txtEnd.setText(endDate);
    cmbDur.setSelectedItem(dur); 
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditCourse;
    private javax.swing.JComboBox<String> cmbArea;
    private javax.swing.JComboBox<String> cmbDur;
    private javax.swing.JComboBox<String> cmbMod;
    private javax.swing.JComboBox<String> cmbQuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtIni;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOpe;
    private javax.swing.JTextField txtSch;
    // End of variables declaration//GEN-END:variables
}
