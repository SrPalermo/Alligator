/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;

/**
 *
 * @author Cesar
 */
public class OrdenCompra {
    int OrdenCompraID;
    int ProveedorID;
    int UsuarioID;
    String ProveedorNombre;
    String ProveedorNit;
    String ProveedorDireccion;
    Date FechaCompra;
    String Estado;
    
    
    public OrdenCompra(){
        
    }

    public OrdenCompra(int OrdenCompraID, int ProveedorID, int UsuarioID, String ProveedorNombre, String ProveedorNit, String ProveedorDireccion, Date FechaCompra, String Estado) {
        this.OrdenCompraID = OrdenCompraID;
        this.ProveedorID = ProveedorID;
        this.UsuarioID = UsuarioID;
        this.ProveedorNombre = ProveedorNombre;
        this.ProveedorNit = ProveedorNit;
        this.ProveedorDireccion = ProveedorDireccion;
        this.FechaCompra = FechaCompra;
        this.Estado = Estado;
    }

    public int getOrdenCompraID() {
        return OrdenCompraID;
    }

    public void setOrdenCompraID(int OrdenCompraID) {
        this.OrdenCompraID = OrdenCompraID;
    }

    public int getProveedorID() {
        return ProveedorID;
    }

    public void setProveedorID(int ProveedorID) {
        this.ProveedorID = ProveedorID;
    }

    public int getUsuarioID() {
        return UsuarioID;
    }

    public void setUsuarioID(int UsuarioID) {
        this.UsuarioID = UsuarioID;
    }

    public String getProveedorNombre() {
        return ProveedorNombre;
    }

    public void setProveedorNombre(String ProveedorNombre) {
        this.ProveedorNombre = ProveedorNombre;
    }

    public String getProveedorNit() {
        return ProveedorNit;
    }

    public void setProveedorNit(String ProveedorNit) {
        this.ProveedorNit = ProveedorNit;
    }

    public String getProveedorDireccion() {
        return ProveedorDireccion;
    }

    public void setProveedorDireccion(String ProveedorDireccion) {
        this.ProveedorDireccion = ProveedorDireccion;
    }

    public Date getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(Date FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}
