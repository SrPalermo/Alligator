/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import java.util.List;
import models.OrdenVenta;
/**
 *
 * @author arodas
 */
public interface CrudOrdenVenta {
    public List listar();
    public OrdenVenta list(int OrdenVentaID);
    public boolean add(OrdenVenta ordenVenta);
    public boolean edit(OrdenVenta ordenVenta);
    public boolean delete(int OrdenVentaID);
}
