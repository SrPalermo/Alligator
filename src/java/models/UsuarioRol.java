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
    Usuario Usuario;
    Rol Rol;
    Tienda Tienda;
    
    public UsuarioRol(){
        
    }

    public UsuarioRol(Usuario Usuario, Rol Rol, Tienda Tienda) {
        this.Usuario = Usuario;
        this.Rol = Rol;
        this.Tienda = Tienda;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public Rol getRol() {
        return Rol;
    }

    public Tienda getTienda() {
        return Tienda;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public void setRol(Rol Rol) {
        this.Rol = Rol;
    }

    public void setTienda(Tienda Tienda) {
        this.Tienda = Tienda;
    }
    
}
