/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author franc
 */
public class Facilitators {
    String ID_Facilitator;
    String Area_Specialization;
    String Identificacion;

    public Facilitators(String ID_Facilitator, String Area_Specialization, String Identificacion) {
        this.ID_Facilitator = ID_Facilitator;
        this.Area_Specialization = Area_Specialization;
        this.Identificacion = Identificacion;
    }

    public String getID_Facilitator() {
        return ID_Facilitator;
    }

    public void setID_Facilitator(String ID_Facilitator) {
        this.ID_Facilitator = ID_Facilitator;
    }

    public String getArea_Specialization() {
        return Area_Specialization;
    }

    public void setArea_Specialization(String Area_Specialization) {
        this.Area_Specialization = Area_Specialization;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }
    
    
    
}
