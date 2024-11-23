
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
        
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, "Error: " +e.toString());
        }
    
        return connection;
    }
    
}
