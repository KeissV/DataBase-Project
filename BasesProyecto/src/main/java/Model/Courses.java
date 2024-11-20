package Model;

/**
 *
 * @author wendy_6rrub
 */
public class Courses {
    
    String initials;
    String courseName;
    String modality;
    String area;
    int amountStudents;
    String duration;
    String scheduleStd;
    String endingDate;
    String openingDate;

    public Courses() {
    }

    public Courses(String initials, String courseName, String modality, String area, int amountStudents, String duration, String scheduleStd, String endingDate, String openingDate) {
        this.initials = initials;
        this.courseName = courseName;
        this.modality = modality;
        this.area = area;
        this.amountStudents = amountStudents;
        this.duration = duration;
        this.scheduleStd = scheduleStd;
        this.endingDate = endingDate;
        this.openingDate = openingDate;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getAmountStudents() {
        return amountStudents;
    }

    public void setAmountStudents(int amountStudents) {
        this.amountStudents = amountStudents;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getScheduleStd() {
        return scheduleStd;
    }

    public void setScheduleStd(String scheduleStd) {
        this.scheduleStd = scheduleStd;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }
    
    
    
}
