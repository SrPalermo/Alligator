/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import java.util.List;
import models.Stock;
/**
 *
 * @author arodas
 */
public interface CrudStock {
    public List listar();
    public Stock list(int StockID);
    public boolean add(Stock stock);
    public boolean edit(Stock stock);
    public boolean delete(int StockID);
}
