package com.senati.proyecto02.gui01;
import com.senati.proyecto02.miClase.Conexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Efrain
 */
public class FrmConsulta4 extends javax.swing.JFrame {

	
	Conexion obj=new Conexion();
	
	public FrmConsulta4() {
		initComponents();
		
	}

	void personalizarTabla(){
jTable1.getColumnModel().getColumn(0).setPreferredWidth(500);
jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);	
	}
	void verProductos(){
	DefaultTableModel modelo=new DefaultTableModel();
	modelo.addColumn("producto");
	modelo.addColumn("precio");
	modelo.addColumn("id categoria");
	
	try{
	obj.obtenerConexion();
	obj.st=obj.conectar.createStatement();
	
	obj.rs= obj.st.executeQuery("select ProductName, UnitPrice, CategoryID from Products");
	while(obj.rs.next()){
Object data[]={ obj.rs.getString(1),obj.rs.getString(2),obj.rs.getString(3)   };
modelo.addRow(data);
		
	}
	jTable1.setModel(modelo);personalizarTabla();
	obj.rs.close();
	obj.conectar.close();
		
	}catch(SQLException e){
		JOptionPane.showMessageDialog(this, e.toString(),"ver producto",0);
	}
		
	}
	
	void verProductoCategoria(int id){
		
	DefaultTableModel modelo=new DefaultTableModel();
	modelo.addColumn("producto");
	modelo.addColumn("precio");
	modelo.addColumn("id categoria");
	
	try{
	obj.obtenerConexion();
	obj.st=obj.conectar.createStatement();
	
	obj.rs=obj.st.executeQuery("select ProductName, UnitPrice, CategoryID from Products where CategoryID="+id);
	while(obj.rs.next()){
Object data[]={ obj.rs.getString(1),obj.rs.getString(2),obj.rs.getString(3)   };
modelo.addRow(data);
		
	}
	jTable1.setModel(modelo);personalizarTabla();
	obj.rs.close();
	obj.conectar.close();
	
		
	}catch(SQLException e){
		JOptionPane.showMessageDialog(this, e.toString(),"ver producto",0);
	}	
	}
	
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                txtId = new javax.swing.JTextField();
                cmconsulta = new javax.swing.JButton();
                cmbTodos = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(51, 51, 255));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("LISTADO DE LOS PRODUCTOS");

                jLabel2.setText("ID CATEGORÍA");

                cmconsulta.setText("CONSULTA");
                cmconsulta.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cmconsultaActionPerformed(evt);
                        }
                });

                cmbTodos.setText("TODOS");
                cmbTodos.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cmbTodosActionPerformed(evt);
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

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(97, 97, 97)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(43, 43, 43)
                                                        .addComponent(jLabel2)
                                                        .addGap(42, 42, 42)
                                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(53, 53, 53)
                                                        .addComponent(cmconsulta)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cmbTodos))))
                                .addContainerGap(108, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cmconsulta)
                                                .addComponent(cmbTodos)))
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(105, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void cmconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmconsultaActionPerformed
                  // TODO add your handling code here:
		int id=Integer.parseInt(txtId.getText());
		verProductoCategoria(id);
        }//GEN-LAST:event_cmconsultaActionPerformed

        private void cmbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTodosActionPerformed
                // TODO add your handling code here:
		verProductos();
        }//GEN-LAST:event_cmbTodosActionPerformed

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
			java.util.logging.Logger.getLogger(FrmConsulta4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrmConsulta4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrmConsulta4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrmConsulta4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FrmConsulta4().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton cmbTodos;
        private javax.swing.JButton cmconsulta;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTable1;
        private javax.swing.JTextField txtId;
        // End of variables declaration//GEN-END:variables
}
