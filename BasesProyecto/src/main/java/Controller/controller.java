
package Controller;

import InterfaW.CurrentCourses;
import InterfaW.StudentExpedient;
import Model.CourseBonds;
import Model.Courses;
import Model.CoursesDAO;
import Model.Users;
import Model.UsersDAO;
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
    StudentExpedient se = new StudentExpedient();
    DefaultTableModel mod = new DefaultTableModel();
    UsersDAO udao = new UsersDAO();

    
    public controller() {
        
    }
    
    
    public void list(JTable tb){
        mod=(DefaultTableModel)tb.getModel();
        List<CourseBonds> ldao= cdao.listCurrentCourses();
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
    
    public void listExpedient(JTable tb){
        mod=(DefaultTableModel)tb.getModel();
        List<CourseBonds> ldao= cdao.listCoursesExpedient();
        Object[]obj = new Object[6];
        for (int i = 0; i < ldao.size(); i++) {
            obj[0]= ldao.get(i).getCourse().getInitials();
            obj[1]= ldao.get(i).getCourse().getCourseName();
            obj[2]= ldao.get(i).getInstructor().getNameUser();
            obj[3]= ldao.get(i).getCourse().getModality();
            obj[4]= ldao.get(i).getInscrip().getStatus();
            obj[5]= ldao.get(i).getCourse().getEndingDate();
            mod.addRow(obj);
        }
        se.tableExpe.setModel(mod);
    }
    
    public String getUserName() {
        return udao.getUserNameById();  
    }
        
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
