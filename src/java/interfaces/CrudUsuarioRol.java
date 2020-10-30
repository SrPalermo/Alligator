/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import models.UsuarioRol;

/**
 *
 * @author lgomez
 */
public interface CrudUsuarioRol {
    public List listar();
    public UsuarioRol list(int TiendaID);
    public boolean add(UsuarioRol tienda);
    public boolean edit(UsuarioRol tienda);
}
