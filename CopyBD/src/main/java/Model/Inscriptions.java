
package Model;

import java.sql.Date;

/**
 *
 * @author wendy_6rrub
 */
public class Inscriptions {
    
    String IDinscrip;
    Date registerDate;
    String status;
    int idInstructor;
    int idStudent;
    String Initials;
    Date openingDate;
    Date endingDate;

    public Inscriptions() {
    }

    public Inscriptions(String IDinscrip, Date registerDate, String status, int idInstructor, int idStudent, String Initials, Date openingDate, Date endingDate) {
        this.IDinscrip = IDinscrip;
        this.registerDate = registerDate;
        this.status = status;
        this.idInstructor = idInstructor;
        this.idStudent = idStudent;
        this.Initials = Initials;
        this.openingDate = openingDate;
        this.endingDate = endingDate;
    }

    public String getIDinscrip() {
        return IDinscrip;
    }

    public void setIDinscrip(String IDinscrip) {
        this.IDinscrip = IDinscrip;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdInstructor() {
        return idInstructor;
    }

    public void setIdInstructor(int idInstructor) {
        this.idInstructor = idInstructor;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getInitials() {
        return Initials;
    }

    public void setInitials(String Initials) {
        this.Initials = Initials;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }
    
    
    
    
}
