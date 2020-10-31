/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelsDao;

import config.Conexion;
import interfaces.CrudDetalleCompra;
import interfaces.CrudMarca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.DetalleCompra;
/**
 *
 * @author arodas
 */
public class DetalleCompraDao implements CrudDetalleCompra {
    Conexion cxn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    DetalleCompra detalle = new DetalleCompra();
    
    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List list(int DetalleID) {
        ArrayList<DetalleCompra>list=new ArrayList<>();
        String comando = "Select *from detallesordencompra where DetalleOrdenCompraID = " + DetalleID;
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                DetalleCompra detalle = new DetalleCompra();
                detalle.setOrdenCompraID(rs.getInt("DetalleOrdenCompraID"));
                detalle.setProductoNombre(rs.getString("ProductoNombre"));
                detalle.setPrecioCompra(rs.getDouble("PrecioCompra"));
                detalle.setCantidad(rs.getInt("Cantidad"));
                detalle.setTotal(rs.getDouble("Total"));
                list.add(detalle);
            } 
        }catch(Exception error){
            
        }
        return list;
    }

    @Override
    public boolean add(DetalleCompra detalle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(DetalleCompra detalle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int DetalleID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
