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
public class Proveedor {
    int ProveedorID;
    String Nombre;
    String Apellido;
    String Email;
    String Direccion;
    String Nit;
    String Estado;
    
    public Proveedor() {
    }

    public Proveedor(int ProveedorID, String Nombre, String Apellido, String Email, String Direccion, String Nit, String Estado) {
        this.ProveedorID = ProveedorID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Direccion = Direccion;
        this.Nit = Nit;
        this.Estado = Estado;
    }

    public int getProveedorID() {
        return ProveedorID;
    }

    public void setProveedorID(int ProveedorID) {
        this.ProveedorID = ProveedorID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}
