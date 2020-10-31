/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import models.OrdenCompra;

/**
 *
 * @author arodas
 */
public interface CrudOrdenCompra {
    public List listar();
    public OrdenCompra list(int OrdenCompraID);
    public boolean add(int ordenCompra);
    public boolean edit(OrdenCompra ordenCompra);
    public boolean delete(int OrdenCompraID);
}
