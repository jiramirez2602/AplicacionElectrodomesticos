/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Views;

import controller.ListaDeLavadoras;
import controller.ListaDeTelevisores;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author derno
 */
public class MostrarEstadistica extends javax.swing.JPanel {

    private ListaDeTelevisores  listaDeTelevisores;
    private ListaDeLavadoras listaDeLavadoras;
    
    
    public MostrarEstadistica(ListaDeLavadoras lavadora,ListaDeTelevisores tv) {
        initComponents();
        this.listaDeLavadoras = lavadora;
        this.listaDeTelevisores = tv;
//        mostrarGrafica();
    }
    

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundEstadistica = new javax.swing.JPanel();
        Estadistica = new javax.swing.JPanel();

        BackgroundEstadistica.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout EstadisticaLayout = new javax.swing.GroupLayout(Estadistica);
        Estadistica.setLayout(EstadisticaLayout);
        EstadisticaLayout.setHorizontalGroup(
            EstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 982, Short.MAX_VALUE)
        );
        EstadisticaLayout.setVerticalGroup(
            EstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundEstadisticaLayout = new javax.swing.GroupLayout(BackgroundEstadistica);
        BackgroundEstadistica.setLayout(BackgroundEstadisticaLayout);
        BackgroundEstadisticaLayout.setHorizontalGroup(
            BackgroundEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundEstadisticaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Estadistica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        BackgroundEstadisticaLayout.setVerticalGroup(
            BackgroundEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundEstadisticaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Estadistica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundEstadistica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundEstadistica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundEstadistica;
    private javax.swing.JPanel Estadistica;
    // End of variables declaration//GEN-END:variables
}
