/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author franc
 */
public class Students {
    String ID_Estudiante;
    String Identificacion;
    String Necesidad_especial;
    String Estado_civil;

    public Students(String ID_Estudiante, String Identificacion, String Necesidad_especial, String Estado_civil) {
        this.ID_Estudiante = ID_Estudiante;
        this.Identificacion = Identificacion;
        this.Necesidad_especial = Necesidad_especial;
        this.Estado_civil = Estado_civil;
    }

    public String getID_Estudiante() {
        return ID_Estudiante;
    }

    public void setID_Estudiante(String ID_Estudiante) {
        this.ID_Estudiante = ID_Estudiante;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNecesidad_especial() {
        return Necesidad_especial;
    }

    public void setNecesidad_especial(String Necesidad_especial) {
        this.Necesidad_especial = Necesidad_especial;
    }

    public String getEstado_civil() {
        return Estado_civil;
    }

    public void setEstado_civil(String Estado_civil) {
        this.Estado_civil = Estado_civil;
    }
   
    
}
