/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author arodas
 */
public class DetalleCompra {
    
    int DetalleOrdenCompraID;
    int OrdenCompraID;
    int ProductoID;
    String ProductoNombre;
    double PrecioCompra;
    int Cantidad;
    double Total;

    public DetalleCompra() {
    }

    public DetalleCompra(int DetalleOrdenCompraID, int OrdenCompraID, int ProductoID, String ProductoNombre, double PrecioCompra, int Cantidad, double Total) {
        this.DetalleOrdenCompraID = DetalleOrdenCompraID;
        this.OrdenCompraID = OrdenCompraID;
        this.ProductoID = ProductoID;
        this.ProductoNombre = ProductoNombre;
        this.PrecioCompra = PrecioCompra;
        this.Cantidad = Cantidad;
        this.Total = Total;
    }

    public int getDetalleOrdenCompraID() {
        return DetalleOrdenCompraID;
    }

    public int getOrdenCompraID() {
        return OrdenCompraID;
    }

    public int getProductoID() {
        return ProductoID;
    }

    public String getProductoNombre() {
        return ProductoNombre;
    }

    public double getPrecioCompra() {
        return PrecioCompra;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public double getTotal() {
        return Total;
    }

    public void setDetalleOrdenCompraID(int DetalleOrdenCompraID) {
        this.DetalleOrdenCompraID = DetalleOrdenCompraID;
    }

    public void setOrdenCompraID(int OrdenCompraID) {
        this.OrdenCompraID = OrdenCompraID;
    }

    public void setProductoID(int ProductoID) {
        this.ProductoID = ProductoID;
    }

    public void setProductoNombre(String ProductoNombre) {
        this.ProductoNombre = ProductoNombre;
    }

    public void setPrecioCompra(double PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    
    
}
