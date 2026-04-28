package view;
import controller.EmpleadoController;
import javax.swing.table.DefaultTableModel;
import model.Empleado;

    
public class EmpleadoVista extends javax.swing.JFrame {
private final EmpleadoController controlador = new EmpleadoController();
private final DefaultTableModel modeloTabla = new DefaultTableModel(new Object[]{"ID", "Nombre", "Apellido", "Puesto", "Salario"}, 0);
   
   
    public EmpleadoVista() {
          
    initComponents();
    jEmpleado.setModel(modeloTabla);
    cargarEmpleados();

    jEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            int fila = jEmpleado.getSelectedRow();

            txtNombre.setText(modeloTabla.getValueAt(fila, 1).toString());
            txtapellido.setText(modeloTabla.getValueAt(fila, 2).toString());
            txtpuesto.setText(modeloTabla.getValueAt(fila, 3).toString());
            txtSalario.setText(modeloTabla.getValueAt(fila, 4).toString());
        }
    });
}
    
         

    @SuppressWarnings("unchec"
            + "ked")

    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(EmpleadoVista.class.getName());

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblsalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btnactualizar = new javax.swing.JButton();
        lblConsultar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();
        lblapellido = new javax.swing.JLabel();
        txtpuesto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblpuesto = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        ButtonInsertar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEmpleado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblsalario.setText("Salario:");

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(this::btnactualizarActionPerformed);

        lblConsultar.setText("Consultar");
        lblConsultar.addActionListener(this::lblConsultarActionPerformed);

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(this::btneliminarActionPerformed);

        lblnombre.setText("Nombre:");

        lblapellido.setText("Apellido:");

        txtNombre.addActionListener(this::txtNombreActionPerformed);

        lblpuesto.setText("Puesto:");

        txtapellido.addActionListener(this::txtapellidoActionPerformed);

        ButtonInsertar.setText("Insertar");
        ButtonInsertar.addActionListener(this::ButtonInsertarActionPerformed);

        jEmpleado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jEmpleado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonInsertar)
                        .addGap(18, 18, 18)
                        .addComponent(btnactualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addComponent(lblnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtSalario))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpuesto)
                    .addComponent(txtpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblapellido)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsalario)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConsultar)
                    .addComponent(ButtonInsertar)
                    .addComponent(btnactualizar)
                    .addComponent(btneliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
                                                                                
    try {
        int fila = jEmpleado.getSelectedRow();

        if (fila < 0) {
            javax.swing.JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla");
            return;
        }

        int id = Integer.parseInt(modeloTabla.getValueAt(fila, 0).toString());

        controlador.actualizarEmpleado(
            id,
            txtNombre.getText(),
            txtapellido.getText(),
            txtpuesto.getText(),
            Double.parseDouble(txtSalario.getText())
        );

        cargarEmpleados();
        javax.swing.JOptionPane.showMessageDialog(null, "Empleado actualizado");

    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(null, "El salario debe ser un número");
    }

               
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void lblConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblConsultarActionPerformed
                                           
    cargarEmpleados();
 
    }//GEN-LAST:event_lblConsultarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
                                                                                
    int fila = jEmpleado.getSelectedRow();

    if (fila < 0) {
        javax.swing.JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla");
        return;
    }

    int id = Integer.parseInt(modeloTabla.getValueAt(fila, 0).toString());

    controlador.eliminarEmpleado(id);

    cargarEmpleados();
    javax.swing.JOptionPane.showMessageDialog(null, "Empleado eliminado");

    
   
       
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed
    private void cargarEmpleados() {
        modeloTabla.setRowCount(0);
        for (Empleado emp : controlador.obtenerEmpleado()){
            modeloTabla.addRow(new Object[]{emp.getId(),
                                            emp.getNombre(),
                                            emp.getApellido(),
                                            emp.getPuesto(),
                                            emp.getSalario()});
                    
        }
    }

    private void ButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInsertarActionPerformed
                                                                                                                                          
    try {
        if (txtNombre.getText().isEmpty() || txtapellido.getText().isEmpty() ||
            txtpuesto.getText().isEmpty() || txtSalario.getText().isEmpty()) {
            
            javax.swing.JOptionPane.showMessageDialog(null, "Llene todos los campos");
            return;
        }

        controlador.agregarEmpleado(
            txtNombre.getText(),
            txtapellido.getText(),
            txtpuesto.getText(),
            Double.parseDouble(txtSalario.getText())
        );

        cargarEmpleados();
        javax.swing.JOptionPane.showMessageDialog(null, "Empleado insertado");

    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(null, "El salario debe ser un número");
    
    
    }

    }//GEN-LAST:event_ButtonInsertarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new EmpleadoVista().setVisible(true));
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonInsertar;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JTable jEmpleado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lblConsultar;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblpuesto;
    private javax.swing.JLabel lblsalario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtpuesto;
    // End of variables declaration//GEN-END:variables

}  
    


