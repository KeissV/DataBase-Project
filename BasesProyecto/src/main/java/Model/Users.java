
package Model;

/**
 *
 * @author wendy_6rrub
 */
public class Users {
    
    int id;
    String nameUser;
    String lastname1;
    String lastname2;

    public Users() {
    }

    public Users(int id, String nameUser, String lastname1, String lastname2) {
        this.id = id;
        this.nameUser = nameUser;
        this.lastname1 = lastname1;
        this.lastname2 = lastname2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastname1() {
        return lastname1;
    }

    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }
    
    
    
}
