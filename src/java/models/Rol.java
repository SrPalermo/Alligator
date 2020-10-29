/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author arodas
 */
public class Rol {
    int RolID;
    String Descripcion;
    String Estado;
    
    public Rol(){
    }

    public Rol(int RolID, String Descripcion, String Estado) {
        this.RolID = RolID;
        this.Descripcion = Descripcion;
        this.Estado = Estado;
    }

    public int getRolID() {
        return RolID;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setRolID(int RolID) {
        this.RolID = RolID;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
