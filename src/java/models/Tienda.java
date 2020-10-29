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
public class Tienda {
    int TiendaID;
    String Nombre;
    String Direccion;
    double PorcentajeGanancia;
    String Estado;

    public Tienda() {
    }

    public Tienda(int TiendaID, String Nombre, String Direccion, double PorcentajeGanancia, String Estado) {
        this.TiendaID = TiendaID;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.PorcentajeGanancia = PorcentajeGanancia;
        this.Estado = Estado;
    }

    public int getTiendaID() {
        return TiendaID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public double getPorcentajeGanancia() {
        return PorcentajeGanancia;
    }

    public String getEstado() {
        return Estado;
    }

    public void setTiendaID(int TiendaID) {
        this.TiendaID = TiendaID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setPorcentajeGanancia(double PorcentajeGanancia) {
        this.PorcentajeGanancia = PorcentajeGanancia;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}
