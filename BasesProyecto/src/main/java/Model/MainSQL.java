
package Model;

/**
 *
 * @author wendy_6rrub
 */
public class MainSQL {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        ConnectionSQLdb conec = new ConnectionSQLdb();
        conec.getConnection();
    }   
}
