/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import java.util.List;
import models.Producto;
/**
 *
 * @author arodas
 */
public interface CrudProducto {
    public List listar();
    public Producto list(int ProductoID);
    public boolean add(Producto producto);
    public boolean edit(Producto producto);
    public boolean delete(int ProductoID);
}
