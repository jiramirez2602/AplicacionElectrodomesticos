/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Views;

import controller.ListaDeLavadoras;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author derno
 */
public class CrearLavadora extends javax.swing.JPanel {

    private ListaDeLavadoras lavadoras;
    public CrearLavadora(ListaDeLavadoras lavadora) {
        this.lavadoras=lavadora;
        initComponents();
    }
    
    
       private void MostrarJpanel(JPanel p){
        p.setSize(1082,630);   
        p.setLocation(0,0);
        BackgroundCrearLavadora.removeAll();
        BackgroundCrearLavadora.add(p,BorderLayout.CENTER);
        BackgroundCrearLavadora.revalidate();
        BackgroundCrearLavadora.repaint();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundCrearLavadora = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        CrearLavadoraTeclado = new javax.swing.JButton();
        CrearLavadoraPrecioPeso = new javax.swing.JButton();
        CrearLavadoraDefecto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        BackgroundCrearLavadora.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundCrearLavadora.setPreferredSize(new java.awt.Dimension(1082, 630));

        jPanel2.setBackground(new java.awt.Color(21, 101, 192));

        CrearLavadoraTeclado.setBackground(new java.awt.Color(21, 101, 192));
        CrearLavadoraTeclado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CrearLavadoraTeclado.setForeground(new java.awt.Color(255, 255, 255));
        CrearLavadoraTeclado.setText("Crear por teclado");
        CrearLavadoraTeclado.setBorder(null);
        CrearLavadoraTeclado.setBorderPainted(false);
        CrearLavadoraTeclado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CrearLavadoraTeclado.setIconTextGap(13);
        CrearLavadoraTeclado.setInheritsPopupMenu(true);
        CrearLavadoraTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearLavadoraTecladoActionPerformed(evt);
            }
        });

        CrearLavadoraPrecioPeso.setBackground(new java.awt.Color(21, 101, 192));
        CrearLavadoraPrecioPeso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CrearLavadoraPrecioPeso.setForeground(new java.awt.Color(255, 255, 255));
        CrearLavadoraPrecioPeso.setText("Crear con precio y peso");
        CrearLavadoraPrecioPeso.setBorder(null);
        CrearLavadoraPrecioPeso.setBorderPainted(false);
        CrearLavadoraPrecioPeso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CrearLavadoraPrecioPeso.setIconTextGap(13);
        CrearLavadoraPrecioPeso.setInheritsPopupMenu(true);
        CrearLavadoraPrecioPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearLavadoraPrecioPesoActionPerformed(evt);
            }
        });

        CrearLavadoraDefecto.setBackground(new java.awt.Color(21, 101, 192));
        CrearLavadoraDefecto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CrearLavadoraDefecto.setForeground(new java.awt.Color(255, 255, 255));
        CrearLavadoraDefecto.setText("Crear por defecto");
        CrearLavadoraDefecto.setBorder(null);
        CrearLavadoraDefecto.setBorderPainted(false);
        CrearLavadoraDefecto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CrearLavadoraDefecto.setIconTextGap(13);
        CrearLavadoraDefecto.setInheritsPopupMenu(true);
        CrearLavadoraDefecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearLavadoraDefectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CrearLavadoraTeclado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(CrearLavadoraPrecioPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(CrearLavadoraDefecto, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CrearLavadoraTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(CrearLavadoraPrecioPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(CrearLavadoraDefecto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lavadora(3).png"))); // NOI18N

        javax.swing.GroupLayout BackgroundCrearLavadoraLayout = new javax.swing.GroupLayout(BackgroundCrearLavadora);
        BackgroundCrearLavadora.setLayout(BackgroundCrearLavadoraLayout);
        BackgroundCrearLavadoraLayout.setHorizontalGroup(
            BackgroundCrearLavadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearLavadoraLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200)
                .addComponent(jLabel2)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        BackgroundCrearLavadoraLayout.setVerticalGroup(
            BackgroundCrearLavadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearLavadoraLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(BackgroundCrearLavadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCrearLavadora, javax.swing.GroupLayout.DEFAULT_SIZE, 1195, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCrearLavadora, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CrearLavadoraTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearLavadoraTecladoActionPerformed
        MostrarJpanel (new LavadoraTeclado(lavadoras));
    }//GEN-LAST:event_CrearLavadoraTecladoActionPerformed

    private void CrearLavadoraPrecioPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearLavadoraPrecioPesoActionPerformed
        MostrarJpanel (new LavadoraPrecioPeso(lavadoras));
    }//GEN-LAST:event_CrearLavadoraPrecioPesoActionPerformed

    private void CrearLavadoraDefectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearLavadoraDefectoActionPerformed
        boolean resultado = lavadoras.crearLavadora();
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Lavadora registrada con éxito.", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_CrearLavadoraDefectoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundCrearLavadora;
    private javax.swing.JButton CrearLavadoraDefecto;
    private javax.swing.JButton CrearLavadoraPrecioPeso;
    private javax.swing.JButton CrearLavadoraTeclado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
