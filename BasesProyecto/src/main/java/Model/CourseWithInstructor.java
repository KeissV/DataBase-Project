
package Model;

/**
 *
 * @author wendy_6rrub
 */
public class CourseWithInstructor {
    private Courses course;
    private Users instructor;

    public CourseWithInstructor(Courses course, Users instructor) {
        this.course = course;
        this.instructor = instructor;
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

