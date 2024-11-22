
package Interface;

import Controller.ControllerInscriptions;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author wendy_6rrub
 */
public class ManageInscriptions extends javax.swing.JPanel {
    ControllerInscriptions con = new ControllerInscriptions();

    /** Creates new form ManageInscriptions */
    public ManageInscriptions() {
        initComponents();
        
        if (TableView != null) {
            TableView.setBackground(new Color(234,203,234, 75));
            TableView.setOpaque(true);
        }
        
    }
        public void ShowPanel(javax.swing.JPanel p) {
            p.setSize(320, 380); 
            p.setLocation(0, 0);
            Content4.removeAll();
            Content4.add(p, BorderLayout.CENTER);
            Content4.revalidate();
            Content4.repaint();
        }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Table1 = new javax.swing.JPanel();
        TableView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableIns = new javax.swing.JTable();
        Search2 = new javax.swing.JTextField();
        btnDeleteIns = new javax.swing.JButton();
        btnAddIns = new javax.swing.JButton();
        Content4 = new javax.swing.JPanel();
        lblSearch = new javax.swing.JButton();

        Table1.setBackground(new java.awt.Color(255, 255, 255));
        Table1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableView.setBackground(new java.awt.Color(248, 222, 255));
        TableView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableIns.setBackground(new java.awt.Color(255, 255, 255));
        tableIns.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        tableIns.setForeground(new java.awt.Color(87, 73, 98));
        tableIns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Estudiante", "Curso", "Facilitador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableIns.setSelectionBackground(new java.awt.Color(234, 203, 234));
        tableIns.setSelectionForeground(new java.awt.Color(87, 73, 98));
        jScrollPane1.setViewportView(tableIns);
        if (tableIns.getColumnModel().getColumnCount() > 0) {
            tableIns.getColumnModel().getColumn(0).setPreferredWidth(8);
            tableIns.getColumnModel().getColumn(1).setPreferredWidth(15);
            tableIns.getColumnModel().getColumn(2).setPreferredWidth(15);
            tableIns.getColumnModel().getColumn(3).setPreferredWidth(15);
        }

        TableView.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 270, 380));

        Search2.setBackground(new java.awt.Color(255, 255, 255));
        Search2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        Search2.setForeground(new java.awt.Color(87, 73, 98));
        Search2.setBorder(null);
        TableView.add(Search2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 510, 40));

        btnDeleteIns.setText("Eliminar");
        btnDeleteIns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteInsMouseClicked(evt);
            }
        });
        TableView.add(btnDeleteIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 140, 50));

        btnAddIns.setText("Nueva Inscripción");
        btnAddIns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddInsMouseClicked(evt);
            }
        });
        TableView.add(btnAddIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 140, 50));

        Content4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Content4Layout = new javax.swing.GroupLayout(Content4);
        Content4.setLayout(Content4Layout);
        Content4Layout.setHorizontalGroup(
            Content4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        Content4Layout.setVerticalGroup(
            Content4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        TableView.add(Content4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 320, 380));

        lblSearch.setBackground(new java.awt.Color(204, 204, 255));
        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-search-more-24.png"))); // NOI18N
        lblSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchMouseClicked(evt);
            }
        });
        lblSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblSearchActionPerformed(evt);
            }
        });
        TableView.add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        Table1.add(TableView, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 660, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Table1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Table1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSearchActionPerformed

    private void btnAddInsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddInsMouseClicked
        AddInscription ai = new AddInscription();
        ShowPanel(ai);
        
        String id=con.getNextInscriptionId();
        ai.txtCodeI.setText(id);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate currentDate = LocalDate.now(); 
        String dateString = currentDate.format(formatter);
        ai.txtDate.setText(dateString);
    }//GEN-LAST:event_btnAddInsMouseClicked

    private void lblSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchMouseClicked
        try {
            con.loadInscripData(tableIns, Search2.getText());
        } catch (SQLException ex) {
            Logger.getLogger(ManageInscriptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblSearchMouseClicked

    private void btnDeleteInsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteInsMouseClicked
            int selectedRow = tableIns.getSelectedRow(); 
    
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione un curso.");
        return;
    }else{
        
        String code = (String) tableIns.getValueAt(selectedRow, 0);
        con.deleteInscrip(code);
        }
    }//GEN-LAST:event_btnDeleteInsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Content4;
    public javax.swing.JTextField Search2;
    private javax.swing.JPanel Table1;
    private javax.swing.JPanel TableView;
    public javax.swing.JButton btnAddIns;
    public javax.swing.JButton btnDeleteIns;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton lblSearch;
    public javax.swing.JTable tableIns;
    // End of variables declaration//GEN-END:variables

}
