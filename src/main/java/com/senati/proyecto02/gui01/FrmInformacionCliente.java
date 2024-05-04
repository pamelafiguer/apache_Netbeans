/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.senati.proyecto02.gui01;



import com.senati.proyecto02.miClase.Conexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author PAMELA FIGUEROA
 */
public class FrmInformacionCliente extends javax.swing.JFrame {

    Conexion obj = new Conexion();
    
    public FrmInformacionCliente() {
        initComponents();
        txtCodigo.setEnabled(false);
        cmbBuscar.setEnabled(true);
        listareEmpleador();
        cargarPais();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cboPais = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtFN = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cmbGuardar = new javax.swing.JButton();
        cmbActualizar = new javax.swing.JButton();
        cmbEliminar = new javax.swing.JButton();
        cmbBuscar = new javax.swing.JButton();
        cmbLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVista = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion del Empleador", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("NOMBRES ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("APELLIDOS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("CIUDAD");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        cboPais.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cboPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPaisActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("ID");

        label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label.setText("PAIS");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("DIRECCION");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("F.NACIMIENTO");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGap(19, 19, 19))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFN, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 444, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addComponent(cboPais, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label)
                            .addComponent(cboPais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Eventos"));
        jPanel2.setToolTipText("");

        cmbGuardar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmbGuardar.setText("GUARDAR");
        cmbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGuardarActionPerformed(evt);
            }
        });

        cmbActualizar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmbActualizar.setText("ACTUALIZAR");
        cmbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbActualizarActionPerformed(evt);
            }
        });

        cmbEliminar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmbEliminar.setText("ELIMINAR");
        cmbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEliminarActionPerformed(evt);
            }
        });

        cmbBuscar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmbBuscar.setText("BUSCAR");
        cmbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBuscarActionPerformed(evt);
            }
        });

        cmbLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmbLimpiar.setText("Limpiar");
        cmbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbGuardar)
                    .addComponent(cmbLimpiar)
                    .addComponent(cmbActualizar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbEliminar)
                            .addComponent(cmbBuscar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbEliminar)
                .addGap(18, 18, 18)
                .addComponent(cmbBuscar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tbVista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbVista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVistaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbVista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbVistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVistaMouseClicked
        // TODO add your handling code here:
          int y;
        
        try{
            y=tbVista.getSelectedRow();
           
                 if (y == -1){
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila.");
            } else {
               

                //String ayuda = tabla.getValueAt(filaseleccionada, num_columna).toString()); 
                txtCodigo .setText((String) tbVista.getValueAt(y, 0));
                txtNombre.setText((String) tbVista.getValueAt(y, 1 ));
                txtApellido.setText((String) tbVista.getValueAt(y, 2));
                txtFN.setText((String) tbVista.getValueAt(y, 3));
                txtDireccion.setText((String) tbVista.getValueAt(y, 4));
                txtCiudad.setText((String) tbVista.getValueAt(y, 5));
                 cboPais.setSelectedItem(tbVista.getValueAt(y, 6));
                
  
                           }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }        
            
    }//GEN-LAST:event_tbVistaMouseClicked

    private void cmbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBuscarActionPerformed
        // TODO add your handling code here:
         int cod=Integer.parseInt(JOptionPane.showInputDialog("Escribe el codigo"));
        txtCodigo.setText("" + cod);
        BuscarEmpleador(cod);
        cmbActualizar.setEnabled(true);
          cmbEliminar.setEnabled(true);
          cmbBuscar.setEnabled(false);
        
    }//GEN-LAST:event_cmbBuscarActionPerformed

    private void cmbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGuardarActionPerformed
        // TODO add your handling code here:
        
        GuardarEmpleador();
        listareEmpleador();
        cmbBuscar.setEnabled(true);
        cmbLimpiar.setEnabled(true);
        cmbGuardar.setEnabled(true);
    }//GEN-LAST:event_cmbGuardarActionPerformed

    private void cmbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEliminarActionPerformed
        // TODO add your handling code here:
        int xcod=Integer.parseInt(txtCodigo.getText());
        txtCodigo.setText(" " + xcod);
        
        EliminarEmpleador(xcod);
        listareEmpleador();
        limpiar();
        
    }//GEN-LAST:event_cmbEliminarActionPerformed

    private void cmbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbActualizarActionPerformed
        // TODO add your handling code here:
         int cod = Integer.parseInt(txtCodigo.getText());
             String nombre = txtNombre.getText();
             String apellido = txtApellido.getText();
             String fechaN = txtFN.getText();
             String Direccion = txtDireccion.getText();
             String ciudad = txtCiudad.getText();
             String pais = cboPais.getSelectedItem().toString();
        actualizarEmpleadores(cod, nombre, apellido, fechaN, Direccion,ciudad, pais);
        listareEmpleador();
        cmbGuardar.setEnabled(false);
                cmbEliminar.setEnabled(false);
                cmbBuscar.setEnabled(true);
                cmbLimpiar.setEnabled(true);
                limpiar();
       
    }//GEN-LAST:event_cmbActualizarActionPerformed

    private void cmbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
        
        cmbEliminar.setEnabled(false);
        cmbBuscar.setEnabled(true);
        cmbActualizar.setEnabled(true);
    }//GEN-LAST:event_cmbLimpiarActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        // TODO add your handling code here:
        cmbGuardar.setEnabled(true);
        cmbBuscar.setEnabled(false);
        cmbLimpiar.setEnabled(false);
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void cboPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPaisActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmInformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInformacionCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboPais;
    private javax.swing.JButton cmbActualizar;
    private javax.swing.JButton cmbBuscar;
    private javax.swing.JButton cmbEliminar;
    private javax.swing.JButton cmbGuardar;
    private javax.swing.JButton cmbLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JTable tbVista;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFN;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
void limpiar(){
	txtNombre.setText(null);
	txtCodigo.setText(null);
        txtApellido.setText(null);
        txtFN.setText(null);
        txtCiudad.setText(null);
        txtDireccion.setText(null);
	txtNombre.requestFocus();
}



void mensaje(String men){
	JOptionPane.showMessageDialog(this, men);
}
    
    
    
void listareEmpleador(){
	DefaultTableModel modelo=new DefaultTableModel();
	modelo.addColumn("Codigo");
	modelo.addColumn("Nombres");
	modelo.addColumn("Apellidos");
	modelo.addColumn("F.NACIMIENTO");
        modelo.addColumn("DIRECCION");
	modelo.addColumn("CIUDAD");
	modelo.addColumn("PAIS");

	try{
	obj.obtenerConexion();
	obj.pst=obj.conectar.prepareStatement("select EmployeeID, FirstName, LastName,BirthDate, Address, City, Country from Employees;");
	obj.rs=obj.pst.executeQuery();
	while(obj.rs.next()){
		
		Object datos[]=new Object[7];
		for(int i=0;i<7;i++){
			datos[i]=obj.rs.getString(i+1);
			
		}
		modelo.addRow(datos);
		
           }
	tbVista.setModel(modelo);
	obj.rs.close();
	obj.conectar.close();
	
	}catch(SQLException e){
		e.getMessage();
	}
	
}

 
 
 
 
  void cargarPais() {
    
    try{
        obj.obtenerConexion();
        obj.pst=obj.conectar.prepareStatement("select distinct Country from Employees;");
        obj.rs=obj.pst.executeQuery();
        while(obj.rs.next())
            cboPais.addItem(obj.rs.getString(1));
        obj.rs.close();
        obj.conectar.close();
  
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e.toString()); 
    }
    
    
}
   
 void BuscarEmpleador(int cod) {
     try{
        obj.obtenerConexion();
        obj.pst = obj.conectar.prepareStatement("select EmployeeID, LastName, FirstName, BirthDate, Address, City, Country from Employees where EmployeeID = ?;");
        obj.pst.setInt(1, cod);
        obj.rs = obj.pst.executeQuery();
        if(obj.rs.next()) {
            txtCodigo.setText(obj.rs.getString("EmployeeID"));
            txtNombre.setText(obj.rs.getString("FirstName"));
            txtApellido.setText(obj.rs.getString("LastName"));
            txtFN.setText(obj.rs.getString("BirthDate"));
            txtCiudad.setText(obj.rs.getString("City"));
            txtDireccion.setText(obj.rs.getString("Address"));
            String Pais = obj.rs.getString("Country");
            cboPais.setSelectedItem(Pais);
        }else{
            mensaje("El id No existe");
            limpiar();
        }
        obj.rs.close();
        obj.conectar.close();
        cboPais.revalidate();
        cboPais.revalidate();
        
    }catch(SQLException e){
        mensaje(e.toString());
    }
      
     
     
 }

 void GuardarEmpleador(){

     
     int y= JOptionPane.showConfirmDialog(null, "Guardar Registro Nuevo", "Guardar",0);
     
     if(y==0){
         try{
             obj.obtenerConexion();
             String nombre = txtNombre.getText();
             String apellido = txtApellido.getText();
             String Nacimiento = txtFN.getText();
             String direccion = txtDireccion.getText();
             String ciudad = txtCiudad.getText(); 
            String pais = cboPais.getSelectedItem().toString();
            
            
            String xGuardar = "INSERT INTO Employees ( FirstName,LastName, BirthDate, Address, City, Country)VALUES";
            xGuardar+="('"+nombre+" ','" + apellido +"','"+ Nacimiento+"','" + direccion+ "','" + ciudad+  "','" + pais+ "')";
            obj.st=obj.conectar.createStatement();
            obj.st.executeUpdate(xGuardar);
             mensaje("Registro guardado correctamente");
             listareEmpleador();
             limpiar();
            
            
            
           
  
     }catch(SQLException e){
             System.out.print(e.toString());
     }
      
     }else{
         mensaje("no se guardo el registro reciente");
         limpiar();
         
     }
 } 
 void EliminarEmpleador(int xcod){
     
	
	try{
		obj.obtenerConexion();
		
               obj.pst=obj.conectar.prepareStatement("DELETE FROM Employees WHERE EmployeeID = ?;");
               obj.pst.setInt(1, xcod);
               obj.pst.executeUpdate();
               mensaje("Datos eliminados");
               obj.conectar.close();

	}catch(SQLException x){
		System.out.print(x.toString());
	}
        
        
        
 }
 
 void actualizarEmpleadores(int cod, String nombre, String Apellido, String FechaN, String Ciudad, String Direccion, String Pais) {
        try {
            obj.obtenerConexion();
            PreparedStatement statement = obj.conectar.prepareStatement
            ("update Employees set LastName=?, FirstName=?, BirthDate=?, Address=?, City=?, Country=? where EmployeeID=?");
            
            statement.setString(1, Apellido);
            statement.setString(2, nombre);
            statement.setString(3, FechaN);
            statement.setString(4, Ciudad);
            statement.setString(5, Direccion);
            statement.setString(6, Pais); 
            statement.setInt(7, cod);
            statement.executeUpdate();

            mensaje("Datos del Producto actualizados correctamente.");
            listareEmpleador();

            statement.close();
            obj.conectar.close();
        }catch (SQLException xx) {
            mensaje("Error al actualizar los datos del Producto: "+xx.toString());
        }
    }
     
     
     
	
}
 
   
 

 
 
 
 
 
 
 
 
 




