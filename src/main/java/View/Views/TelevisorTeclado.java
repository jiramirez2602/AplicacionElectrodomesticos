/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Views;

import controller.ListaDeLavadoras;
import controller.ListaDeTelevisores;
import javax.swing.JOptionPane;
import model.Televisor;

/**
 *
 * @author derno
 */
public class TelevisorTeclado extends javax.swing.JPanel {

    
    private ListaDeTelevisores listaDeTelevisores;
    public TelevisorTeclado(ListaDeTelevisores tv) {
        this.listaDeTelevisores=tv;
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

        BackgroundTelevisorTeclado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        apPLbl2 = new javax.swing.JLabel();
        CrearTelevisor = new javax.swing.JButton();
        nameLbl1 = new javax.swing.JLabel();
        PrecioLabel = new javax.swing.JTextField();
        apPLbl1 = new javax.swing.JLabel();
        PulgadasLabel = new javax.swing.JTextField();
        apMLbl1 = new javax.swing.JLabel();
        nameLbl2 = new javax.swing.JLabel();
        PesoLabel = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        ComboBoxColor = new javax.swing.JComboBox<>();
        ComboBoxConsumo = new javax.swing.JComboBox<>();
        nameLbl3 = new javax.swing.JLabel();
        ComboBoxTDT = new javax.swing.JComboBox<>();

        BackgroundTelevisorTeclado.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Crear televisor por teclado");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Por favor, ingrese los datos para poder crear el Televisor: ");

        apPLbl2.setText("Peso");

        CrearTelevisor.setBackground(new java.awt.Color(18, 90, 173));
        CrearTelevisor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CrearTelevisor.setForeground(new java.awt.Color(255, 255, 255));
        CrearTelevisor.setText("Crear");
        CrearTelevisor.setBorderPainted(false);
        CrearTelevisor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CrearTelevisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearTelevisorActionPerformed(evt);
            }
        });

        nameLbl1.setText("Precio Base");

        apPLbl1.setText("Color");

        apMLbl1.setText("Consumo Energetico");

        nameLbl2.setText("Pulgadas");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        ComboBoxColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanco", "Negro", "Azul", "Rojo ", "Gris", " " }));

        ComboBoxConsumo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));

        nameLbl3.setText("TDT");

        ComboBoxTDT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        javax.swing.GroupLayout BackgroundTelevisorTecladoLayout = new javax.swing.GroupLayout(BackgroundTelevisorTeclado);
        BackgroundTelevisorTeclado.setLayout(BackgroundTelevisorTecladoLayout);
        BackgroundTelevisorTecladoLayout.setHorizontalGroup(
            BackgroundTelevisorTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundTelevisorTecladoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(BackgroundTelevisorTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundTelevisorTecladoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1004, 1004, 1004))
                    .addGroup(BackgroundTelevisorTecladoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(554, 554, 554))
                    .addGroup(BackgroundTelevisorTecladoLayout.createSequentialGroup()
                        .addGroup(BackgroundTelevisorTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrecioLabel)
                            .addComponent(nameLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apPLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apMLbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(BackgroundTelevisorTecladoLayout.createSequentialGroup()
                                .addGroup(BackgroundTelevisorTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboBoxConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundTelevisorTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apPLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(BackgroundTelevisorTecladoLayout.createSequentialGroup()
                                .addGroup(BackgroundTelevisorTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BackgroundTelevisorTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nameLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ComboBoxTDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PulgadasLabel)
                                        .addComponent(CrearTelevisor, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                                    .addComponent(PesoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        BackgroundTelevisorTecladoLayout.setVerticalGroup(
            BackgroundTelevisorTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundTelevisorTecladoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(BackgroundTelevisorTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundTelevisorTecladoLayout.createSequentialGroup()
                        .addComponent(nameLbl1)
                        .addGap(15, 15, 15)
                        .addComponent(PrecioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(apPLbl1)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(apMLbl1)
                        .addGap(15, 15, 15)
                        .addComponent(ComboBoxConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BackgroundTelevisorTecladoLayout.createSequentialGroup()
                        .addComponent(apPLbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PesoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(nameLbl2)
                        .addGap(15, 15, 15)
                        .addComponent(PulgadasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(nameLbl3)
                        .addGap(15, 15, 15)
                        .addComponent(ComboBoxTDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(CrearTelevisor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(163, Short.MAX_VALUE))
                    .addGroup(BackgroundTelevisorTecladoLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(118, 118, 118))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundTelevisorTeclado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundTelevisorTeclado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CrearTelevisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearTelevisorActionPerformed
        String valorPrecio = PrecioLabel.getText();
        String valorPeso = PesoLabel.getText();
        String valorPulgadas = PulgadasLabel.getText();
        String valorTDT = ComboBoxTDT.getSelectedItem().toString();
        String valorColor = ComboBoxColor.getSelectedItem().toString();
        String valorConsumo = ComboBoxConsumo.getSelectedItem().toString();

        boolean resultado = listaDeTelevisores.crearTelevisor(valorPrecio, valorColor, valorConsumo, valorPeso, valorPulgadas, valorTDT);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Televisor registrado con éxito.", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar el televisor. Verifique los datos ingresados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CrearTelevisorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundTelevisorTeclado;
    private javax.swing.JComboBox<String> ComboBoxColor;
    private javax.swing.JComboBox<String> ComboBoxConsumo;
    private javax.swing.JComboBox<String> ComboBoxTDT;
    private javax.swing.JButton CrearTelevisor;
    private javax.swing.JTextField PesoLabel;
    private javax.swing.JTextField PrecioLabel;
    private javax.swing.JTextField PulgadasLabel;
    private javax.swing.JLabel apMLbl1;
    private javax.swing.JLabel apPLbl1;
    private javax.swing.JLabel apPLbl2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLbl1;
    private javax.swing.JLabel nameLbl2;
    private javax.swing.JLabel nameLbl3;
    // End of variables declaration//GEN-END:variables
}
