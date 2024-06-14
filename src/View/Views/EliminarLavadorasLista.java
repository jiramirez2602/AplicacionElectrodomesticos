package View.Views;


import model.Lavadora;
import controller.ListaDeLavadoras;
import controller.ListaDeTelevisores;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
        actualizarTabla();
        configurarBotonBorrar();
    }
    
    private void inicializarTabla() {
        String[] columnas = {"Tipo", "Precio Base", "Color", "Consumo", "Peso", "Carga"};
        tableModel = new DefaultTableModel(columnas, 0);
        jTable1.setModel(tableModel);
    }
    
    public void actualizarTabla() {
         
        tableModel.setRowCount(0);
        idMap.clear(); 
        int row = 0;
        
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
     
    private void configurarBotonBorrar() {
        BorrarELavadora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                BorrarELavadoraActionPerformed(evt);
            }
        });
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundMostrarLavadoras = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        BorrarELavadora = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        BackgroundMostrarLavadoras.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        title.setText("Lista de Lavadoras");

        BorrarELavadora.setBackground(new java.awt.Color(18, 90, 173));
        BorrarELavadora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BorrarELavadora.setForeground(new java.awt.Color(255, 255, 255));
        BorrarELavadora.setText("Borrar");
        BorrarELavadora.setBorderPainted(false);
        BorrarELavadora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BorrarELavadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarELavadoraActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout BackgroundMostrarLavadorasLayout = new javax.swing.GroupLayout(BackgroundMostrarLavadoras);
        BackgroundMostrarLavadoras.setLayout(BackgroundMostrarLavadorasLayout);
        BackgroundMostrarLavadorasLayout.setHorizontalGroup(
            BackgroundMostrarLavadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundMostrarLavadorasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(BackgroundMostrarLavadorasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundMostrarLavadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundMostrarLavadorasLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(699, 699, 699))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundMostrarLavadorasLayout.createSequentialGroup()
                        .addComponent(BorrarELavadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53))))
        );
        BackgroundMostrarLavadorasLayout.setVerticalGroup(
            BackgroundMostrarLavadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundMostrarLavadorasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(BorrarELavadora)
                .addGap(52, 52, 52))
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

    private void BorrarELavadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarELavadoraActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow > -1) {
            String tipo = (String) tableModel.getValueAt(selectedRow, 0);
            String id = idMap.get(selectedRow); // Obtener el ID del mapa usando la fila seleccionada

            boolean eliminado = false;
            if (tipo.equals("Lavadora")) {
                eliminado = eliminarLavadora(id);
            }

            if (eliminado) {
                actualizarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar el electrodoméstico", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un electrodoméstico para borrar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean eliminarLavadora(String id) {
        Lavadora lavadora = listaDeLavadoras.listarLavadora(id);
        if (lavadora != null) {
            listaDeLavadoras.getListaDeLavadoras().remove(lavadora);
            return true;
        }
        return false;
    }//GEN-LAST:event_BorrarELavadoraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundMostrarLavadoras;
    private javax.swing.JButton BorrarELavadora;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}