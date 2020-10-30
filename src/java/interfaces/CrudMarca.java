/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import java.util.List;
import models.Marca;
/**
 *
 * @author arodas
 */
public interface CrudMarca {
    public List listar();
    public Marca list(int MarcaID);
    public boolean add(Marca marca);
    public boolean edit(Marca marca);
    public boolean delete(int MarcaID);
}
