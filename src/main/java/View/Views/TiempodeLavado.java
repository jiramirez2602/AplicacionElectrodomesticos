/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Views;

import controller.ListaDeLavadoras;
import javax.swing.JOptionPane;

/**
 *
 * @author derno
 */
public class TiempodeLavado extends javax.swing.JPanel {

    
    private ListaDeLavadoras listaDeLavadoras;
    
    public TiempodeLavado(ListaDeLavadoras lavadora) {
        this.listaDeLavadoras=lavadora;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundTiempoLavado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CalcularTiempoLavado = new javax.swing.JButton();
        nameLbl1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nameLbl4 = new javax.swing.JLabel();
        ComboBoxAgua = new javax.swing.JComboBox<>();
        ComboBoxLavado = new javax.swing.JComboBox<>();

        BackgroundTiempoLavado.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Calcular tiempo de lavado");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Por favor, ingrese los datos para poder calcular el tiempo de lavado: ");

        CalcularTiempoLavado.setBackground(new java.awt.Color(18, 90, 173));
        CalcularTiempoLavado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CalcularTiempoLavado.setForeground(new java.awt.Color(255, 255, 255));
        CalcularTiempoLavado.setText("Calcular");
        CalcularTiempoLavado.setBorderPainted(false);
        CalcularTiempoLavado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CalcularTiempoLavado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularTiempoLavadoActionPerformed(evt);
            }
        });

        nameLbl1.setText("Nivel de Agua");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        nameLbl4.setText("Tipo de Lavado");

        ComboBoxAgua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Rapido", "Pesado" }));

        ComboBoxLavado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bajo", "Medio", "Alto" }));

        javax.swing.GroupLayout BackgroundTiempoLavadoLayout = new javax.swing.GroupLayout(BackgroundTiempoLavado);
        BackgroundTiempoLavado.setLayout(BackgroundTiempoLavadoLayout);
        BackgroundTiempoLavadoLayout.setHorizontalGroup(
            BackgroundTiempoLavadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundTiempoLavadoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(BackgroundTiempoLavadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundTiempoLavadoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1004, 1004, 1004))
                    .addGroup(BackgroundTiempoLavadoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(554, 554, 554))
                    .addGroup(BackgroundTiempoLavadoLayout.createSequentialGroup()
                        .addGroup(BackgroundTiempoLavadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameLbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(BackgroundTiempoLavadoLayout.createSequentialGroup()
                                .addComponent(CalcularTiempoLavado, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(256, 256, 256))
                            .addGroup(BackgroundTiempoLavadoLayout.createSequentialGroup()
                                .addGroup(BackgroundTiempoLavadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboBoxAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxLavado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        BackgroundTiempoLavadoLayout.setVerticalGroup(
            BackgroundTiempoLavadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundTiempoLavadoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundTiempoLavadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundTiempoLavadoLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                        .addGap(178, 178, 178))
                    .addGroup(BackgroundTiempoLavadoLayout.createSequentialGroup()
                        .addComponent(nameLbl1)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBoxAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(nameLbl4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxLavado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(CalcularTiempoLavado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundTiempoLavado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundTiempoLavado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularTiempoLavadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularTiempoLavadoActionPerformed
        String valorAgua = ComboBoxAgua.getSelectedItem().toString();
        String valorLavado = ComboBoxLavado.getSelectedItem().toString();
        String resultado = listaDeLavadoras.verificarTiempoLavadoController(valorAgua, valorLavado);
        JOptionPane.showMessageDialog(this, resultado, "Resultado del Tiempo de Lavado", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_CalcularTiempoLavadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundTiempoLavado;
    private javax.swing.JButton CalcularTiempoLavado;
    private javax.swing.JComboBox<String> ComboBoxAgua;
    private javax.swing.JComboBox<String> ComboBoxLavado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLbl1;
    private javax.swing.JLabel nameLbl4;
    // End of variables declaration//GEN-END:variables
}
