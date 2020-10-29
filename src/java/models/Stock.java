/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Cesar
 */
public class Stock {
    
    int StockID;
    int ProductoID;
    int Entrada;
    int Salida;
    int Existencia;
    double PrecioCosto;
    
    
    public Stock(){
        
    }

    public Stock(int StockID, int ProductoID, int Entrada, int Salida, int Existencia, double PrecioCosto) {
        this.StockID = StockID;
        this.ProductoID = ProductoID;
        this.Entrada = Entrada;
        this.Salida = Salida;
        this.Existencia = Existencia;
        this.PrecioCosto = PrecioCosto;
    }

    public int getStockID() {
        return StockID;
    }

    public void setStockID(int StockID) {
        this.StockID = StockID;
    }

    public int getProductoID() {
        return ProductoID;
    }

    public void setProductoID(int ProductoID) {
        this.ProductoID = ProductoID;
    }

    public int getEntrada() {
        return Entrada;
    }

    public void setEntrada(int Entrada) {
        this.Entrada = Entrada;
    }

    public int getSalida() {
        return Salida;
    }

    public void setSalida(int Salida) {
        this.Salida = Salida;
    }

    public int getExistencia() {
        return Existencia;
    }

    public void setExistencia(int Existencia) {
        this.Existencia = Existencia;
    }

    public double getPrecioCosto() {
        return PrecioCosto;
    }

    public void setPrecioCosto(double PrecioCosto) {
        this.PrecioCosto = PrecioCosto;
    }
    
    
}
