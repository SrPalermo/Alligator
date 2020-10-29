/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Cesar
 */
public class Marca {
    int MarcaID;
    String Descripcion;
    
    public Marca() {
    }

    public Marca(int MarcaID, String Descripcion) {
        this.MarcaID = MarcaID;
        this.Descripcion = Descripcion;
    }

    public int getMarcaID() {
        return MarcaID;
    }

    public void setMarcaID(int MarcaID) {
        this.MarcaID = MarcaID;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}
