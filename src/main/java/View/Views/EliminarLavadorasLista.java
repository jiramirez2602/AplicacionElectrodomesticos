package View.Views;


import model.Lavadora;
import controller.ListaDeLavadoras;
import controller.ListaDeTelevisores;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import model.Televisor;
import javax.swing.table.DefaultTableModel;


public class EliminarLavadorasLista extends javax.swing.JPanel {
    
    private ListaDeLavadoras listaDeLavadoras;
    private DefaultTableModel tableModel;
    private Map<Integer, String> idMap;
    
    
    public EliminarLavadorasLista(ListaDeLavadoras lavadora) {
        initComponents();
        this.listaDeLavadoras=lavadora;
        idMap = new HashMap<>();
        inicializarTabla();
        actualizarTabla(jTable1);
    }
    
    private void inicializarTabla() {
        String[] columnas = {"Tipo", "Precio Base", "Color", "Consumo", "Peso", "Carga"};
        tableModel = new DefaultTableModel(columnas, 0);
        jTable1.setModel(tableModel);
    }
    
    public void actualizarTabla(JTable table) {
         
        tableModel.setRowCount(0);
        idMap.clear(); 
        int row = 0;
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        
        for (int i = 0; i < tableModel.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        
        
         for (Lavadora lavadora : listaDeLavadoras.getListaDeLavadoras()) {
            Object[] fila = {
                "Lavadora",
                lavadora.getPrecioBase(),
                lavadora.getColor(),
                lavadora.getConsumoEnergetico(),
                lavadora.getPeso(),
                lavadora.getCarga() + " kg"
            };
            tableModel.addRow(fila);
            idMap.put(row, lavadora.getId()); // Asociar la fila con el ID
            row++;
        }
    }
    
    private void MostrarJpanel(JPanel p){
        p.setSize(1082,630);   
        p.setLocation(0,0);
        BackgroundMostrarLavadoras.removeAll();
        BackgroundMostrarLavadoras.add(p,BorderLayout.CENTER);
        BackgroundMostrarLavadoras.revalidate();
        BackgroundMostrarLavadoras.repaint();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundMostrarLavadoras = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        BackgroundMostrarLavadoras.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        title.setText("Lista de Lavadoras");

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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(18, 90, 173));
        jPanel1.setPreferredSize(new java.awt.Dimension(78, 32));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Borrar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundMostrarLavadorasLayout = new javax.swing.GroupLayout(BackgroundMostrarLavadoras);
        BackgroundMostrarLavadoras.setLayout(BackgroundMostrarLavadorasLayout);
        BackgroundMostrarLavadorasLayout.setHorizontalGroup(
            BackgroundMostrarLavadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundMostrarLavadorasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundMostrarLavadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundMostrarLavadorasLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(699, 699, 699))
                    .addGroup(BackgroundMostrarLavadorasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE))
                .addGap(61, 61, 61))
        );
        BackgroundMostrarLavadorasLayout.setVerticalGroup(
            BackgroundMostrarLavadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundMostrarLavadorasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundMostrarLavadoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundMostrarLavadoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jPanel1.setBackground(new Color(18,77,173));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jPanel1.setBackground(new Color(18,90,173));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow > -1) {
            String tipo = (String) tableModel.getValueAt(selectedRow, 0);
            String id = idMap.get(selectedRow);

            boolean eliminado = false;
            if (tipo.equals("Lavadora")) {
                eliminado = listaDeLavadoras.eliminarLavadora(id);
            }

            if (eliminado) {
                actualizarTabla(jTable1);
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar el electrodoméstico", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un electrodoméstico para borrar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundMostrarLavadoras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}