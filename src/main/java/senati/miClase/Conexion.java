/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package senati.miClase;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PAMELA FIGUEROA
 */
public class Conexion {
    
    public Connection conectar=null;
    public ResultSet rs=null;
    public Statement st=null;
    
    String usuario="xpame";
    String password="1234";
    String puerto="1433";
    String BDD="Northwind";
    String ip="192.168.114.168";
    
    public Connection obtenerConexion () throws SQLException{
        
        try{
        
            //conectar = DriverManager.getConnection(url:" ");
                  
        conectar = DriverManager.getConnection( String.format("jdbc:sqlserver://%s:%s;database=%s;user=%s;password=%s;encrypt=false", 
        ip, puerto, BDD, usuario, password ));


            
            
            
            
        
        }catch(SQLDataException pame){
            
            JOptionPane.showMessageDialog(null,"se conecto correctamente" + pame.toString()); 
            JOptionPane.showMessageDialog(null,"no se conecto, error," + pame.toString());
        
        }
       
        
        return conectar; 
    }
    
    
            
    

}
    

