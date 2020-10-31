/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import models.Usuario;

/**
 *
 * @author arodas
 */
public interface Crud {
    public List listar();
    public Usuario list(int UsuarioID);
    public Usuario validar(String Email, String Contrasea);
    public boolean add(Usuario usuario);
    public boolean edit(Usuario usuario);
    public boolean delete(int UsuarioID);
}
