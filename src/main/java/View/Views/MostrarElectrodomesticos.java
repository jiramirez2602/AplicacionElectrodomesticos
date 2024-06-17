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
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import model.Televisor;
import javax.swing.table.DefaultTableModel;


public class MostrarElectrodomesticos extends javax.swing.JPanel {
    
    private ListaDeTelevisores  listaDeTelevisores;
    private ListaDeLavadoras listaDeLavadoras;
    private DefaultTableModel tableModel;
    private Map<Integer, String> idMap;
    
    
    public MostrarElectrodomesticos(ListaDeLavadoras lavadora,ListaDeTelevisores tv) {
        initComponents();
        this.listaDeLavadoras=lavadora;
        this.listaDeTelevisores=tv;
        idMap = new HashMap<>();
        inicializarTabla();
        actualizarTabla(jTable1);
    }
    
    private void inicializarTabla() {
        String[] columnas = {"Tipo", "Precio Base", "Color", "Consumo", "Peso", "Especificación Extra", "Precio final"};
        tableModel = new DefaultTableModel(columnas, 0);
        jTable1.setModel(tableModel);
    }
    
        public void actualizarTabla(JTable table) {
        // Limpiar el modelo de la tabla y el mapa de IDs
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);
        int row = 0;

        // Configurar el renderer para centrar el contenido de las celdas
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Aplicar el renderer a cada columna de la tabla
        for (int i = 0; i < tableModel.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        // Iterar sobre los televisores y añadir filas a la tabla
        for (Televisor televisor : listaDeTelevisores.getListaDeTelevisores()) {
            Object[] fila = {
                "Televisor",
                televisor.getPrecioBase(),
                televisor.getColor(),
                televisor.getConsumoEnergetico(),
                televisor.getPeso(),
                televisor.getPulgadas() + " pulgadas",
                televisor.precioFinal()
            };
            tableModel.addRow(fila);
            idMap.put(row, televisor.getId());
            row++;
        }

        // Iterar sobre las lavadoras y añadir filas a la tabla
        for (Lavadora lavadora : listaDeLavadoras.getListaDeLavadoras()) {
            Object[] fila = {
                "Lavadora",
                lavadora.getPrecioBase(),
                lavadora.getColor(),
                lavadora.getConsumoEnergetico(),
                lavadora.getPeso(),
                lavadora.getCarga() + " kg de carga",
                lavadora.precioFinal()
            };
            tableModel.addRow(fila);
            idMap.put(row, lavadora.getId()); 
            row++;
        }
    }
    
    private void MostrarJpanel(JPanel p){
        p.setSize(1082,630);   
        p.setLocation(0,0);
        BackgroundMostrarElectrodomesticos.removeAll();
        BackgroundMostrarElectrodomesticos.add(p,BorderLayout.CENTER);
        BackgroundMostrarElectrodomesticos.revalidate();
        BackgroundMostrarElectrodomesticos.repaint();
    }
     
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundMostrarElectrodomesticos = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        BorrarElectrodomestico = new javax.swing.JButton();
        EditarElectrodomestico = new javax.swing.JButton();
        CrearElectrodomestico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        BackgroundMostrarElectrodomesticos.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        title.setText("Lista de Electrodomésticos");

        BorrarElectrodomestico.setBackground(new java.awt.Color(18, 90, 173));
        BorrarElectrodomestico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BorrarElectrodomestico.setForeground(new java.awt.Color(255, 255, 255));
        BorrarElectrodomestico.setText("Borrar");
        BorrarElectrodomestico.setBorderPainted(false);
        BorrarElectrodomestico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BorrarElectrodomestico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarElectrodomesticoActionPerformed(evt);
            }
        });

        EditarElectrodomestico.setBackground(new java.awt.Color(18, 90, 173));
        EditarElectrodomestico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EditarElectrodomestico.setForeground(new java.awt.Color(255, 255, 255));
        EditarElectrodomestico.setText("Editar");
        EditarElectrodomestico.setBorderPainted(false);
        EditarElectrodomestico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EditarElectrodomestico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarElectrodomesticoActionPerformed(evt);
            }
        });

        CrearElectrodomestico.setBackground(new java.awt.Color(18, 90, 173));
        CrearElectrodomestico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CrearElectrodomestico.setForeground(new java.awt.Color(255, 255, 255));
        CrearElectrodomestico.setText("Nuevo");
        CrearElectrodomestico.setBorderPainted(false);
        CrearElectrodomestico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CrearElectrodomestico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearElectrodomesticoActionPerformed(evt);
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

        javax.swing.GroupLayout BackgroundMostrarElectrodomesticosLayout = new javax.swing.GroupLayout(BackgroundMostrarElectrodomesticos);
        BackgroundMostrarElectrodomesticos.setLayout(BackgroundMostrarElectrodomesticosLayout);
        BackgroundMostrarElectrodomesticosLayout.setHorizontalGroup(
            BackgroundMostrarElectrodomesticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundMostrarElectrodomesticosLayout.createSequentialGroup()
                .addGap(433, 433, 433)
                .addComponent(CrearElectrodomestico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EditarElectrodomestico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BorrarElectrodomestico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundMostrarElectrodomesticosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(BackgroundMostrarElectrodomesticosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundMostrarElectrodomesticosLayout.setVerticalGroup(
            BackgroundMostrarElectrodomesticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundMostrarElectrodomesticosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(BackgroundMostrarElectrodomesticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BorrarElectrodomestico)
                    .addComponent(EditarElectrodomestico)
                    .addComponent(CrearElectrodomestico))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundMostrarElectrodomesticos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundMostrarElectrodomesticos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CrearElectrodomesticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearElectrodomesticoActionPerformed
       String[] options = {"Televisor", "Lavadora"};
       String tipo = (String) JOptionPane.showInputDialog(this, "Seleccione el tipo de electrodoméstico a crear", "Crear Electrodoméstico", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (tipo != null) {
            if (tipo.equals("Televisor")) {
                MostrarJpanel(new CrearTelevisor(listaDeTelevisores));
            } else if (tipo.equals("Lavadora")) {
                MostrarJpanel(new CrearLavadora(listaDeLavadoras));
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de electrodoméstico para crear", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CrearElectrodomesticoActionPerformed

    private void EditarElectrodomesticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarElectrodomesticoActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow > -1) {
        String tipo = (String) tableModel.getValueAt(selectedRow, 0);
        String id = idMap.get(selectedRow);

        if (tipo.equals("Televisor")) {
            Televisor televisor = listaDeTelevisores.listarTelevisor(id);
            if (televisor != null) {
                MostrarJpanel(new ModificarTelevisor(listaDeTelevisores, televisor));
            } else {
                JOptionPane.showMessageDialog(this, "Televisor no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (tipo.equals("Lavadora")) {
            Lavadora lavadora = listaDeLavadoras.listarLavadora(id);
            if (lavadora != null) {
                MostrarJpanel(new ModificarLavadora(listaDeLavadoras, lavadora));
            } else {
                JOptionPane.showMessageDialog(this, "Lavadora no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un electrodoméstico para modificar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EditarElectrodomesticoActionPerformed

    private void BorrarElectrodomesticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarElectrodomesticoActionPerformed
       BorrarElectrodomestico.setEnabled(false); 
       
        int selectedRow = jTable1.getSelectedRow();

        
        if (selectedRow > -1) {
            String id = idMap.get(selectedRow);
            String tipo = (String) jTable1.getValueAt(selectedRow, 0);

            boolean eliminado = false;
            if ("Lavadora".equals(tipo)) {
                eliminado = listaDeLavadoras.eliminarLavadora(id);
            } else if ("Televisor".equals(tipo)) {
                eliminado = listaDeTelevisores.eliminarTelevisor(id);
            }

            if (eliminado) {
                // Actualizar la tabla si se eliminó correctamente
                actualizarTabla(jTable1);
                JOptionPane.showMessageDialog(this, tipo + " eliminada correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar " + tipo, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un electrodoméstico para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }

        BorrarElectrodomestico.setEnabled(true); 
    }//GEN-LAST:event_BorrarElectrodomesticoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundMostrarElectrodomesticos;
    private javax.swing.JButton BorrarElectrodomestico;
    private javax.swing.JButton CrearElectrodomestico;
    private javax.swing.JButton EditarElectrodomestico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}