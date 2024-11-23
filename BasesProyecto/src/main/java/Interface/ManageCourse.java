
package Interface;

import Controller.controller;
import Model.Courses;
import java.awt.Color;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wendy_6rrub
 */
public class ManageCourse extends javax.swing.JPanel {
    public String selectedArea;
//        controller controller = new controller();
// private boolean isSearching = false;  // Variable de control

    public ManageCourse() {
        initComponents();
        
        if (panelCourses != null) {
            panelCourses.setBackground(new Color(234, 203, 234, 75));
            panelCourses.setOpaque(true);
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

        jPanel1 = new javax.swing.JPanel();
        panelCourses = new javax.swing.JPanel();
        searchC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCourses = new javax.swing.JTable();
        btnAddCourses = new javax.swing.JButton();
        btnEditCourse = new javax.swing.JButton();
        btnDeleteCourse = new javax.swing.JButton();
        comboCourses = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelCourses.setBackground(new java.awt.Color(255, 211, 255));
        panelCourses.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchC.setBackground(new java.awt.Color(255, 255, 255));
        searchC.setBorder(null);
        searchC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCActionPerformed(evt);
            }
        });
        panelCourses.add(searchC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 520, 40));

        tableCourses.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        tableCourses.setForeground(new java.awt.Color(87, 73, 98));
        tableCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sigla", "Curso", "Modalidad", "Area", "Cant. estudiantes", "Horario", "Duración", "Fecha inicio", "Fecha fin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCourses.setSelectionBackground(new java.awt.Color(234, 203, 234));
        tableCourses.setSelectionForeground(new java.awt.Color(87, 73, 98));
        jScrollPane1.setViewportView(tableCourses);

        panelCourses.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 590, 390));

        btnAddCourses.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnAddCourses.setText("Agregar");
        btnAddCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCoursesMouseClicked(evt);
            }
        });
        btnAddCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCoursesActionPerformed(evt);
            }
        });
        panelCourses.add(btnAddCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 90, -1));

        btnEditCourse.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnEditCourse.setText("Editar");
        btnEditCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditCourseMouseClicked(evt);
            }
        });
        panelCourses.add(btnEditCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 90, -1));

        btnDeleteCourse.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnDeleteCourse.setText("Eliminar");
        btnDeleteCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteCourseMouseClicked(evt);
            }
        });
        panelCourses.add(btnDeleteCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 120, 90, -1));

        comboCourses.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        comboCourses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Arte", "Actividad física", "Salud y Bienestar", "Tecnología", "Medio ambiente" }));
        comboCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCoursesActionPerformed(evt);
            }
        });
        panelCourses.add(comboCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 120, -1));

        btnSearch.setBackground(new java.awt.Color(204, 204, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-search-more-24.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        panelCourses.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panelCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panelCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchCActionPerformed

    private void btnAddCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCoursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddCoursesActionPerformed

    private void comboCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCoursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCoursesActionPerformed

    private void btnAddCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCoursesMouseClicked
        AddCourse ac = new AddCourse();
        ac.setVisible(true);
    }//GEN-LAST:event_btnAddCoursesMouseClicked

    private void btnEditCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditCourseMouseClicked
        EditCourses ec = new EditCourses();
        controller cont = new controller();
        
        int selectedRow = tableCourses.getSelectedRow(); 
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione un curso.");
        return;
    }
        String courseId = (String) tableCourses.getValueAt(selectedRow, 0);
        String name = (String) tableCourses.getValueAt(selectedRow, 1);
        String moda = (String) tableCourses.getValueAt(selectedRow, 2);
        String area = (String) tableCourses.getValueAt(selectedRow, 3);
        int cant = (int) tableCourses.getValueAt(selectedRow, 4);
        String sch = (String) tableCourses.getValueAt(selectedRow, 5);
        String dur = (String) tableCourses.getValueAt(selectedRow, 6);
        Date dateO = (Date) tableCourses.getValueAt(selectedRow, 7);
        Date dateE = (Date) tableCourses.getValueAt(selectedRow, 8);
        
        String dateOString = formatDateToString(dateO);
        String dateEString = formatDateToString(dateE);
        ec.loadCourseDataToForm(courseId, name, moda, area, cant, sch, dur, dateOString, dateEString);
        ec.setVisible(true);
    }//GEN-LAST:event_btnEditCourseMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteCourseMouseClicked
            controller cont = new controller();
            int selectedRow = tableCourses.getSelectedRow(); 
    
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione un curso.");
        return;
    }

    // Obtenemos el ID del curso desde la primera columna (índice 0)
    String courseId = (String) tableCourses.getValueAt(selectedRow, 0);
        cont.deleteCourse(courseId);
    
    }//GEN-LAST:event_btnDeleteCourseMouseClicked

        //convierte las fechas en string para poder manejarlas
        public String formatDateToString(Date date) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
            return sdf.format(date);
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddCourses;
    public javax.swing.JButton btnDeleteCourse;
    public javax.swing.JButton btnEditCourse;
    public javax.swing.JButton btnSearch;
    public javax.swing.JComboBox<String> comboCourses;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCourses;
    private javax.swing.JTextField searchC;
    public javax.swing.JTable tableCourses;
    // End of variables declaration//GEN-END:variables
}
