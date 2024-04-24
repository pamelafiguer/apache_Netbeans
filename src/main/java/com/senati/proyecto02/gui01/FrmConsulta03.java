/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.senati.proyecto02.gui01;

import com.senati.proyecto02.miClase.Conexion;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Efrain
 */
public class FrmConsulta03 extends javax.swing.JFrame {
	
	Conexion obj=new Conexion();

	
	
	
	
	
	
	public FrmConsulta03() {
		initComponents();
		cargarDatos();primero();
	}

		@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                txtProducto = new javax.swing.JTextField();
                txtID = new javax.swing.JTextField();
                txtPrecio = new javax.swing.JTextField();
                jPanel1 = new javax.swing.JPanel();
                cmdUltimo = new javax.swing.JButton();
                cmdAnterior = new javax.swing.JButton();
                cmdSiguiente = new javax.swing.JButton();
                cmdPrimero = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 102, 255));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("LISTADO DE LOS PRODUCTOS");

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel2.setText("ID");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel3.setText("PRECIO");

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel4.setText("PRODUCTO");

                jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MOVIMIENTOS DEL CURSOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(51, 0, 255))); // NOI18N

                cmdUltimo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                cmdUltimo.setText(">|");
                cmdUltimo.setToolTipText("Ultimo Registro");
                cmdUltimo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cmdUltimoActionPerformed(evt);
                        }
                });

                cmdAnterior.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                cmdAnterior.setText(">");
                cmdAnterior.setToolTipText("Registro Anterior");
                cmdAnterior.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cmdAnteriorActionPerformed(evt);
                        }
                });

                cmdSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                cmdSiguiente.setText("<");
                cmdSiguiente.setToolTipText("Siguiente Registro");
                cmdSiguiente.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cmdSiguienteActionPerformed(evt);
                        }
                });

                cmdPrimero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                cmdPrimero.setText("|<");
                cmdPrimero.setToolTipText("Primer Registro");
                cmdPrimero.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cmdPrimeroActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cmdPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmdSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(cmdAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cmdUltimo)
                                        .addComponent(cmdAnterior)
                                        .addComponent(cmdSiguiente)
                                        .addComponent(cmdPrimero))
                                .addContainerGap(40, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(102, 102, 102)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addGap(24, 24, 24)))
                                                .addGap(41, 41, 41)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(88, 88, 88)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(67, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(35, 35, 35))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel3))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(28, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void cmdPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrimeroActionPerformed
                // TODO add your handling code here:
		primero();
        }//GEN-LAST:event_cmdPrimeroActionPerformed

        private void cmdSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSiguienteActionPerformed
                // TODO add your handling code here:
		siguiente();
        }//GEN-LAST:event_cmdSiguienteActionPerformed

        private void cmdAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAnteriorActionPerformed
                // TODO add your handling code here:
		anterior();
        }//GEN-LAST:event_cmdAnteriorActionPerformed

        private void cmdUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUltimoActionPerformed
                // TODO add your handling code here:
		ultimo();
        }//GEN-LAST:event_cmdUltimoActionPerformed

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
			java.util.logging.Logger.getLogger(FrmConsulta03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrmConsulta03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrmConsulta03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrmConsulta03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FrmConsulta03().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton cmdAnterior;
        private javax.swing.JButton cmdPrimero;
        private javax.swing.JButton cmdSiguiente;
        private javax.swing.JButton cmdUltimo;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JTextField txtID;
        private javax.swing.JTextField txtPrecio;
        private javax.swing.JTextField txtProducto;
        // End of variables declaration//GEN-END:variables



void mostrarRegistro(){
	try{
	txtID.setText(obj.rs.getString(1));
	txtProducto.setText(obj.rs.getString(2));
	txtPrecio.setText(obj.rs.getString(3));
		
	}catch(SQLException e){
		JOptionPane.showMessageDialog(this, e.toString(),"Mostrar",0);
	}
}

	
void cargarDatos(){
	try{
	obj.obtenerConexion();
obj.st=obj.conectar.createStatement(obj.rs.TYPE_SCROLL_SENSITIVE,obj.rs.CONCUR_READ_ONLY);
		obj.rs=obj.st.executeQuery("select ProductID,ProductName, UnitPrice from Products");
		
		
		
	}catch(SQLException e){
		JOptionPane.showMessageDialog(this, e.toString(),"Cargar",0);
	}
}


void primero(){
	
	try{
	if(obj.rs.first())
		mostrarRegistro();
		
	}catch(SQLException e){
		JOptionPane.showMessageDialog(this, e.toString(),"Primero",0);
	}
}

void siguiente(){
	
	try{
	if(obj.rs.next())
		mostrarRegistro();
		
	}catch(SQLException e){
		JOptionPane.showMessageDialog(this, e.toString(),"Siguiente",0);
	}
}

void anterior(){
	
	try{
	if(obj.rs.previous())
		mostrarRegistro();
		
	}catch(SQLException e){
		JOptionPane.showMessageDialog(this, e.toString(),"Anterior",0);
	}
}

void ultimo(){
	
	try{
	if(obj.rs.last())
		mostrarRegistro();
		
	}catch(SQLException e){
		JOptionPane.showMessageDialog(this, e.toString(),"Ultimo",0);
	}
}

}
