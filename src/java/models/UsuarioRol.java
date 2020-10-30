/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


/**
 *
 * @author lgomez
 */
public class UsuarioRol {
    int UsuarioID;
    int RolID;
    int TiendaID;

    public UsuarioRol(){
    }
    
    public UsuarioRol(int UsuarioID, int RolID, int TiendaID) {
        this.UsuarioID = UsuarioID;
        this.RolID = RolID;
        this.TiendaID = TiendaID;
    }

    public int getUsuarioID() {
        return UsuarioID;
    }

    public int getRolID() {
        return RolID;
    }

    public int getTiendaID() {
        return TiendaID;
    }

    public void setUsuarioID(int UsuarioID) {
        this.UsuarioID = UsuarioID;
    }

    public void setRolID(int RolID) {
        this.RolID = RolID;
    }

    public void setTiendaID(int TiendaID) {
        this.TiendaID = TiendaID;
    }
    
}
