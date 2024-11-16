/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.UIManager;

/**
 *
 * @author franc
 */
public class ViewHistory extends javax.swing.JPanel {

    /**
     * Creates new form ViewHistory
     */
    public ViewHistory() {
        initComponents();
    
       // renderizador personalizado para el combo
        jComboBox1.setRenderer(new CustomComboBoxRenderer());
        jComboBox2.setRenderer(new CustomComboBoxRenderer());

      
     
        // Asegurarse de que los paneles se mantengan transparentes
        if (TableView != null) {
            TableView.setBackground(new Color(195, 152, 242, 47));
            TableView.setOpaque(true);
        }
    
        
    //  PopupMenuListener para repintar TableView
    jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
        @Override
        public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent e) {
            // No es necesario hacer nada aquí al abrirse.
        }

        @Override
        public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent e) {
            // Forzar la actualización del panel cuando el JComboBox se cierra
            TableView.repaint();
        }

        @Override
        public void popupMenuCanceled(javax.swing.event.PopupMenuEvent e) {
            // Repintar en caso de que  el menú se cierra de forma inesperada
            TableView.repaint();
        }
    });

    //  JComboBox 2 li mismo que arriba
    jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
        @Override
        public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent e) {
            
        }

        @Override
        public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent e) {
           
            TableView.repaint();
        }

        @Override
        public void popupMenuCanceled(javax.swing.event.PopupMenuEvent e) {
           
            TableView.repaint();
        }
    });
    }
    
    private static class CustomComboBoxRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            if (isSelected) {
                c.setBackground(new Color(234,203,234)); 
                c.setForeground(new Color(87,73,98)); 
            } else {
                c.setBackground(new Color(195, 152, 242, 47)); 
                c.setForeground(new Color(87,73,98)); 
            }
            return c;
        } }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Table1 = new javax.swing.JPanel();
        TableView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Search2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        Table1.setBackground(new java.awt.Color(255, 255, 255));
        Table1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableView.setBackground(new java.awt.Color(195, 152, 242));
        TableView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(87, 73, 98));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(234, 203, 234));
        jTable1.setSelectionForeground(new java.awt.Color(87, 73, 98));
        jScrollPane1.setViewportView(jTable1);

        TableView.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 570, 380));

        jComboBox2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(87, 73, 98));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        TableView.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 230, -1));

        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(87, 73, 98));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        TableView.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 220, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-search-more-24.png"))); // NOI18N
        TableView.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        Search2.setBackground(new java.awt.Color(255, 255, 255));
        Search2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        Search2.setForeground(new java.awt.Color(87, 73, 98));
        Search2.setBorder(null);
        TableView.add(Search2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 570, 40));

        Table1.add(TableView, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Table1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Table1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Search2;
    private javax.swing.JPanel Table1;
    private javax.swing.JPanel TableView;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}