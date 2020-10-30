/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;


import java.util.List;
import models.Abastecimiento;

/**
 *
 * @author arodas
 */
public interface CrudAbastecimiento {
    public List listar();
    public Abastecimiento list(int AbastecimientoID);
    public boolean add(Abastecimiento abastecimiento);
    public boolean edit(Abastecimiento abastecimiento);
    public boolean delete(int AbastecimientoID);
}
