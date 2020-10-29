/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import models.Rol;

/**
 *
 * @author arodas
 */
public interface CrudRol {
    public List listar();
    public Rol list(int RolID);
    public boolean add(Rol rol);
    public boolean edit(Rol rol);
    public boolean delete(int RolID);
}
