/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Views;

import controller.ListaDeLavadoras;
import controller.ListaDeTelevisores;
import java.awt.BorderLayout;
import java.awt.Dimension;
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
        mostrarGrafica();
    }
    
   private void mostrarGrafica(){
        int N1 = listaDeLavadoras.obtenerCantidadDeLavadoras();
        int N2 = listaDeTelevisores.obtenerCantidadDeTelevisores();
        System.out.println(N1);
        
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
        datos.setValue(N1, "Electrodomestico", "Lavadoras");
        datos.setValue(N2, "Electrodomestico", "Televisores");
        
        JFreeChart grafico = ChartFactory.createBarChart(
        "Cantiadad de Electrodomesticos",
        "Electrodomesticos",
        "Cantidad",
        datos,
        PlotOrientation.VERTICAL,
        true,
        true,
        false
        );
        
        ChartPanel panel = new ChartPanel(grafico);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(1006,558));
        Estadistica.setLayout(new BorderLayout());
        Estadistica.add(panel,BorderLayout.NORTH);
        Estadistica.revalidate();
        Estadistica.repaint();
        
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
            .addGap(0, 1006, Short.MAX_VALUE)
        );
        EstadisticaLayout.setVerticalGroup(
            EstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundEstadisticaLayout = new javax.swing.GroupLayout(BackgroundEstadistica);
        BackgroundEstadistica.setLayout(BackgroundEstadisticaLayout);
        BackgroundEstadisticaLayout.setHorizontalGroup(
            BackgroundEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundEstadisticaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Estadistica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        BackgroundEstadisticaLayout.setVerticalGroup(
            BackgroundEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundEstadisticaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Estadistica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
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
