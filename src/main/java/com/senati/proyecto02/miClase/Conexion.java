/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto02.miClase;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Efrain
 */
public class Conexion {


public Connection conectar=null;
public ResultSet rs=null;
public Statement st=null;
public PreparedStatement pst=null;

String usuario="xpame";
String password="1234";
String puerto="1433";
String BDD="Northwind";
String ip="localhost";





public Connection obtenerConexion(){
try{
	
conectar = DriverManager.getConnection( String.format("jdbc:sqlserver://%s:%s;database=%s;user=%s;password=%s;encrypt=false", ip, puerto, BDD, usuario, password ));

					
	
//	JOptionPane.showMessageDialog(null,"se conecto correctamente");
	
}catch(SQLException xc){
	JOptionPane.showMessageDialog(null,"no se conecto, error," + xc.toString());
}

	return conectar;
}
}

	

