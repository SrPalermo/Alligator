/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import models.Cliente;

/**
 *
 * @author arodas
 */
public interface CrudCliente {
    public List listar();
    public Cliente list(int ClienteID);
    public boolean add(Cliente cliente);
    public boolean edit(Cliente cliente);
    public boolean delete(int ClienteID);
}
    

