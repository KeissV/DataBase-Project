/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author wendy_6rrub
 */
public class ConnectionSQLdb {

    Connection connection = null;
    
    String pass = "mimimi66";
    String user = "SeguimientoBD";
    String db = "SeguimientoCurEstu";
    String ip = "localhost";
    String port = "1433";
    
    
    public Connection getConnection(){
        try{
            String cadena = "jdbc:sqlserver://"+ip+":"+port+";databaseName="+db+";user="+user+";password="+pass+";encrypt=true;trustServerCertificate=true";
            connection = DriverManager.getConnection(cadena);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa a la base de Datos");
        
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, "Error: " +e.toString());
        }
    
        return connection;
    }
    
}
