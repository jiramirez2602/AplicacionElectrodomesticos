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
        actualizarTabla();
        configurarBotonBorrar();
    }
    
    private void inicializarTabla() {
        String[] columnas = {"Tipo", "Precio Base", "Color", "Consumo", "Peso", "Especificación Extra", "Precio final"};
        tableModel = new DefaultTableModel(columnas, 0);
        jTable1.setModel(tableModel);
    }
    
    public void actualizarTabla() {
         
        tableModel.setRowCount(0);
        idMap.clear(); 
        int row = 0;
        
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
            idMap.put(row, televisor.getId()); // Asociar la fila con el ID
            row++;
        }

         for (Lavadora lavadora : listaDeLavadoras.getListaDeLavadoras()) {
            Object[] fila = {
                "Lavadora",
                lavadora.getPrecioBase(),
                lavadora.getColor(),
                lavadora.getConsumoEnergetico(),
                lavadora.getPeso(),
                lavadora.getCarga() + " kg",
                lavadora.precioFinal()
            };
            tableModel.addRow(fila);
            idMap.put(row, lavadora.getId()); // Asociar la fila con el ID
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
     
    private void configurarBotonBorrar() {
        BorrarElectrodomestico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                BorrarElectrodomesticoActionPerformed(evt);
            }
        });
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundMostrarElectrodomesticos = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        ElectrodomesticoBusqueda = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        BorrarElectrodomestico = new javax.swing.JButton();
        EditarElectrodomestico = new javax.swing.JButton();
        CrearElectrodomestico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        BackgroundMostrarElectrodomesticos.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Lista de Electrodomesticos");

        searchButton.setBackground(new java.awt.Color(18, 90, 173));
        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Buscar");
        searchButton.setBorderPainted(false);
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(BackgroundMostrarElectrodomesticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundMostrarElectrodomesticosLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(699, 699, 699))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundMostrarElectrodomesticosLayout.createSequentialGroup()
                        .addGroup(BackgroundMostrarElectrodomesticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BackgroundMostrarElectrodomesticosLayout.createSequentialGroup()
                                .addGap(427, 427, 427)
                                .addComponent(CrearElectrodomestico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EditarElectrodomestico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BorrarElectrodomestico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(BackgroundMostrarElectrodomesticosLayout.createSequentialGroup()
                                .addComponent(ElectrodomesticoBusqueda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton)))
                        .addGap(50, 50, 50))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundMostrarElectrodomesticosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        BackgroundMostrarElectrodomesticosLayout.setVerticalGroup(
            BackgroundMostrarElectrodomesticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundMostrarElectrodomesticosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundMostrarElectrodomesticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ElectrodomesticoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void BorrarElectrodomesticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarElectrodomesticoActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow > -1) {
            String tipo = (String) tableModel.getValueAt(selectedRow, 0);
            String id = idMap.get(selectedRow); // Obtener el ID del mapa usando la fila seleccionada

            boolean eliminado = false;
            if (tipo.equals("Televisor")) {
                eliminado = eliminarTelevisor(id);
            } else if (tipo.equals("Lavadora")) {
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

    public boolean eliminarTelevisor(String id) {
        Televisor televisor = listaDeTelevisores.listarTelevisor(id);
        if (televisor != null) {
            listaDeTelevisores.getListaDeTelevisores().remove(televisor);
            return true;
        }
        return false;
    }

    public boolean eliminarLavadora(String id) {
        Lavadora lavadora = listaDeLavadoras.listarLavadora(id);
        if (lavadora != null) {
            listaDeLavadoras.getListaDeLavadoras().remove(lavadora);
            return true;
        }
        return false;
    }//GEN-LAST:event_BorrarElectrodomesticoActionPerformed

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

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
    }//GEN-LAST:event_searchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundMostrarElectrodomesticos;
    private javax.swing.JButton BorrarElectrodomestico;
    private javax.swing.JButton CrearElectrodomestico;
    private javax.swing.JButton EditarElectrodomestico;
    private javax.swing.JTextField ElectrodomesticoBusqueda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}