package View.Views;


import controller.ListaDeTelevisores;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ModificarTelevisoresLista extends javax.swing.JPanel {
    
    private ListaDeTelevisores listaDeTelevisores;
    private DefaultTableModel tableModel;
    private Map<Integer, String> idMap;
    
    
    public ModificarTelevisoresLista(ListaDeTelevisores televisor) {
        initComponents();
        this.listaDeTelevisores=televisor;
        idMap = new HashMap<>();
        inicializarTabla();
        actualizarTabla();
        configurarBotonBorrar();
    }
    
    private void inicializarTabla() {
        String[] columnas = {"Tipo", "Precio Base", "Color", "Consumo", "Peso", "Pulgadas", "TDT"};
        tableModel = new DefaultTableModel(columnas, 0);
        jTable1.setModel(tableModel);
    }
    
    public void actualizarTabla() {
         
        tableModel.setRowCount(0);
        idMap.clear(); 
        int row = 0;
        
         for (model.Televisor televisor : listaDeTelevisores.getListaDeTelevisores()) {
            Object[] fila = {
                "Televisor",
                televisor.getPrecioBase(),
                televisor.getColor(),
                televisor.getConsumoEnergetico(),
                televisor.getPeso(),
                televisor.getPulgadas(),
                televisor.isTDT() ? "Si" : "No"
            };
            tableModel.addRow(fila);
            idMap.put(row, televisor.getId()); // Asociar la fila con el ID
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
        ModificarTelevisor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ModificarTelevisorActionPerformed(evt);
            }
        });
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundMostrarLavadoras = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        ModificarTelevisor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        BackgroundMostrarLavadoras.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        title.setText("Lista de Televisores");

        ModificarTelevisor.setBackground(new java.awt.Color(18, 90, 173));
        ModificarTelevisor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ModificarTelevisor.setForeground(new java.awt.Color(255, 255, 255));
        ModificarTelevisor.setText("Modificar");
        ModificarTelevisor.setBorderPainted(false);
        ModificarTelevisor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ModificarTelevisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarTelevisorActionPerformed(evt);
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
                        .addComponent(ModificarTelevisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(ModificarTelevisor)
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

    private void ModificarTelevisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarTelevisorActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow > -1) {
        String tipo = (String) tableModel.getValueAt(selectedRow, 0);
        String id = idMap.get(selectedRow);

        if (tipo.equals("Televisor")) {
            model.Televisor televisor = listaDeTelevisores.listarTelevisor(id);
            if (televisor != null) {
                MostrarJpanel(new ModificarTelevisor(listaDeTelevisores, televisor));
            } else {
                JOptionPane.showMessageDialog(this, "Televisor no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    }//GEN-LAST:event_ModificarTelevisorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundMostrarLavadoras;
    private javax.swing.JButton ModificarTelevisor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}