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
public class OrdenVenta {
    
    int OrdenVentaID;
    int ClienteID;
    int UsuarioID;
    String ClienteNombre;
    String ClienteNit;
    String ClienteDireccion;
    Date FechaVenta;
    String Estado;
    
    public OrdenVenta(){
        
    }

    public OrdenVenta(int OrdenVentaID, int ClienteID, int UsuarioID, String ClienteNombre, String ClienteNit, String ClienteDireccion, Date FechaVenta, String Estado) {
        this.OrdenVentaID = OrdenVentaID;
        this.ClienteID = ClienteID;
        this.UsuarioID = UsuarioID;
        this.ClienteNombre = ClienteNombre;
        this.ClienteNit = ClienteNit;
        this.ClienteDireccion = ClienteDireccion;
        this.FechaVenta = FechaVenta;
        this.Estado = Estado;
    }

    public int getOrdenVentaID() {
        return OrdenVentaID;
    }

    public void setOrdenVentaID(int OrdenVentaID) {
        this.OrdenVentaID = OrdenVentaID;
    }

    public int getClienteID() {
        return ClienteID;
    }

    public void setClienteID(int ClienteID) {
        this.ClienteID = ClienteID;
    }

    public int getUsuarioID() {
        return UsuarioID;
    }

    public void setUsuarioID(int UsuarioID) {
        this.UsuarioID = UsuarioID;
    }

    public String getClienteNombre() {
        return ClienteNombre;
    }

    public void setClienteNombre(String ClienteNombre) {
        this.ClienteNombre = ClienteNombre;
    }

    public String getClienteNit() {
        return ClienteNit;
    }

    public void setClienteNit(String ClienteNit) {
        this.ClienteNit = ClienteNit;
    }

    public String getClienteDireccion() {
        return ClienteDireccion;
    }

    public void setClienteDireccion(String ClienteDireccion) {
        this.ClienteDireccion = ClienteDireccion;
    }

    public Date getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(Date FechaVenta) {
        this.FechaVenta = FechaVenta;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
    
    
}
