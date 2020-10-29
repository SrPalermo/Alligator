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
public class Abastecimiento {
    int AbastecimientoID;
    int TiendaID;
    int ProductoID;
    int Entrada;
    int Salida;
    int Existencia;
    double Precioventa;
    
    public Abastecimiento(){
        
    }

    public Abastecimiento(int AbastecimientoID, int TiendaID, int ProductoID, int Entrada, int Salida, int Existencia, double Precioventa) {
        this.AbastecimientoID = AbastecimientoID;
        this.TiendaID = TiendaID;
        this.ProductoID = ProductoID;
        this.Entrada = Entrada;
        this.Salida = Salida;
        this.Existencia = Existencia;
        this.Precioventa = Precioventa;
    }

    public int getAbastecimientoID() {
        return AbastecimientoID;
    }

    public void setAbastecimientoID(int AbastecimientoID) {
        this.AbastecimientoID = AbastecimientoID;
    }

    public int getTiendaID() {
        return TiendaID;
    }

    public void setTiendaID(int TiendaID) {
        this.TiendaID = TiendaID;
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

    public double getPrecioventa() {
        return Precioventa;
    }

    public void setPrecioventa(double Precioventa) {
        this.Precioventa = Precioventa;
    }
    
}
