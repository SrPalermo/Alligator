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
public class Usuario {
    int UsuarioID;
    String Nombre;
    String Apellido;
    String Usuario;
    String Contrasea;
    String Email;
    String Estado;

    public Usuario() {
    }

    public Usuario(String Nombre, String Apellido, String Usuario, String Contrasea, String Email, String Estado) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Usuario = Usuario;
        this.Contrasea = Contrasea;
        this.Email = Email;
        this.Estado = Estado;
    }
    

    public int getUsuarioID() {
        return UsuarioID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getContrasea() {
        return Contrasea;
    }

    public String getEmail() {
        return Email;
    }

    public String getEstado() {
        return Estado;
    }

    public void setUsuarioID(int UsuarioID) {
        this.UsuarioID = UsuarioID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setContrasea(String Contrasea) {
        this.Contrasea = Contrasea;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
