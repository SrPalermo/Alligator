/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import models.DetalleCompra;

/**
 *
 * @author arodas
 */
public interface CrudDetalleCompra {
    public List listar();
    public List list(int DetalleID);
    public boolean add(DetalleCompra detalle);
    public boolean edit(DetalleCompra detalle);
    public boolean delete(int DetalleID);
}
