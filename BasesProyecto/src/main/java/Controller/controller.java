
package Controller;

import InterfaW.CurrentCourses;
import Model.CourseWithInstructor;
import Model.Courses;
import Model.CoursesDAO;
import Model.Users;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wendy_6rrub
 */
public class controller implements ActionListener{

    Courses co = new Courses();
    CoursesDAO cdao = new CoursesDAO();
    Users uss = new Users();
    CurrentCourses cc = new CurrentCourses();
    DefaultTableModel mod = new DefaultTableModel();

    public controller(CurrentCourses c) {
        this.cc = c;
        list(cc.tableCurrent);
    }
    
    public void list(JTable tb){
        mod=(DefaultTableModel)tb.getModel();
        List<CourseWithInstructor> ldao= cdao.listCurrentCourses();
        Object[]obj = new Object[5];
        for (int i = 0; i < ldao.size(); i++) {
            obj[0]= ldao.get(i).getCourse().getInitials();
            obj[1]= ldao.get(i).getCourse().getCourseName();
            obj[2]= ldao.get(i).getInstructor().getNameUser();
            obj[3]= ldao.get(i).getCourse().getScheduleStd();
            obj[4]= ldao.get(i).getCourse().getEndingDate();
            mod.addRow(obj);
        }
        cc.tableCurrent.setModel(mod);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
