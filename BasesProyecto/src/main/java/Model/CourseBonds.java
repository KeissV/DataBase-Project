
package Model;

/**
 *
 * @author wendy_6rrub
 */
public class CourseBonds {
    private Courses course;
    private Users instructor;
    private Inscriptions inscrip;

    public CourseBonds() {
    }

    public CourseBonds(Courses course, Users instructor) {
        this.course = course;
        this.instructor = instructor;
    }

    
    public CourseBonds(Courses course, Users instructor, Inscriptions inscrip) {
        this.course = course;
        this.instructor = instructor;
        this.inscrip = inscrip;
    }

    public Inscriptions getInscrip() {
        return inscrip;
    }

    public void setInscrip(Inscriptions inscrip) {
        this.inscrip = inscrip;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public Users getInstructor() {
        return instructor;
    }

    public void setInstructor(Users instructor) {
        this.instructor = instructor;
    }
}

