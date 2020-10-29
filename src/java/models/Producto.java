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
public class Producto {
    int ProductosID;
    String Descripcion;
    int MarcaID;
    String Estado;
    
    public Producto() {
    }

    public Producto(int ProductosID, String Descripcion, int MarcaID, String Estado) {
        this.ProductosID = ProductosID;
        this.Descripcion = Descripcion;
        this.MarcaID = MarcaID;
        this.Estado = Estado;
    }

    public int getProductosID() {
        return ProductosID;
    }

    public void setProductosID(int ProductosID) {
        this.ProductosID = ProductosID;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getMarcaID() {
        return MarcaID;
    }

    public void setMarcaID(int MarcaID) {
        this.MarcaID = MarcaID;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
}
