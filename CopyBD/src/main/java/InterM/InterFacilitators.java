/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterM;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterFacilitators extends JPanel {

    public InterFacilitators(String username) {
        initComponents();
        NameUser.setText(username); // Mostrar el nombre del usuario en el panel
    }



        
    /**
     * Creates new form InterFacilitadores
     */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        ProfileUser = new javax.swing.JLabel();
        NameUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Cursos = new javax.swing.JLabel();
        HorCursos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        Content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Exit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(87, 73, 98));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-logout-24.png"))); // NOI18N
        Exit.setText("Cerrar Sesion ");
        Exit.setToolTipText("");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        ProfileUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-user-48 (1).png"))); // NOI18N
        ProfileUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileUserMouseClicked(evt);
            }
        });

        NameUser.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        NameUser.setForeground(new java.awt.Color(87, 73, 98));
        NameUser.setText("     Nombre Usuario");
        NameUser.setToolTipText("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LOGOOO.png"))); // NOI18N

        Cursos.setBackground(new java.awt.Color(255, 255, 255));
        Cursos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Cursos.setForeground(new java.awt.Color(87, 73, 98));
        Cursos.setText("Cursos");
        Cursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CursosMouseClicked(evt);
            }
        });

        HorCursos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        HorCursos.setForeground(new java.awt.Color(87, 73, 98));
        HorCursos.setText("Horario de Cursos");
        HorCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HorCursosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(ProfileUser))
                            .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))
                    .addComponent(HorCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ProfileUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameUser)
                .addGap(50, 50, 50)
                .addComponent(Cursos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HorCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 90, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 100, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        JFrame loginFrame = new Login();
    loginFrame.setLocationRelativeTo(null); // Centrar la ventana
    loginFrame.setVisible(true); // Mostrar el Login

    // Cerrar la ventana actual que contiene este panel
    ((JFrame) javax.swing.SwingUtilities.getWindowAncestor(this)).dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void ProfileUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileUserMouseClicked

    }//GEN-LAST:event_ProfileUserMouseClicked

    private void CursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CursosMouseClicked
                                  
       Courses coursesPanel = new Courses();
    
    // Reemplazar el contenido del panel Content
    Content.removeAll();
    Content.setLayout(new BorderLayout()); // Asegurar que se use un BorderLayout
    Content.add(coursesPanel, BorderLayout.CENTER);
    Content.revalidate(); // Actualizar el contenido
    Content.repaint(); // Refrescar el diseño

    }//GEN-LAST:event_CursosMouseClicked

    private void HorCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HorCursosMouseClicked
  
    }//GEN-LAST:event_HorCursosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JLabel Cursos;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel HorCursos;
    private javax.swing.JLabel NameUser;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel ProfileUser;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}