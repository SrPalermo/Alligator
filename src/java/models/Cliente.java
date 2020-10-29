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
public class Cliente {
    int ClienteID;
    String Nombre;
    String Apellido;
    String Email;
    String Direccion;
    int Nit; 
    String Estado;

    public Cliente() {
    }

    public Cliente(int ClienteID, String Nombre, String Apellido, String Email, String Direccion, int Nit, String Estado) {
        this.ClienteID = ClienteID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Direccion = Direccion;
        this.Nit = Nit;
        this.Estado = Estado;
    }

    public int getClienteID() {
        return ClienteID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public String getDireccion() {
        return Direccion;
    }

    public int getNit() {
        return Nit;
    }

    public String getEstado() {
        return Estado;
    }

    public void setClienteID(int ClienteID) {
        this.ClienteID = ClienteID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setNit(int Nit) {
        this.Nit = Nit;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}
