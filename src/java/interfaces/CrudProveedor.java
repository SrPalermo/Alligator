/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import java.util.List;
import models.Proveedor;
/**
 *
 * @author arodas
 */
public interface CrudProveedor {
    public List listar();
    public Proveedor list(int ProveedorID);
    public boolean add(Proveedor proveedor);
    public boolean edit(Proveedor proveedor);
    public boolean delete(int ProveedorID);
}
