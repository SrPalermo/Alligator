/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import models.Tienda;

/**
 *
 * @author arodas
 */
public interface CrudTienda {
    public List listar();
    public Tienda list(int TiendaID);
    public boolean add(Tienda tienda);
    public boolean edit(Tienda tienda);
    public boolean delete(int TiendaID);
}
