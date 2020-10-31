/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelsDao;

import config.Conexion;
import interfaces.CrudOrdenCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.OrdenCompra;

/**
 *
 * @author arodas
 */
public class OrdenCompraDao implements CrudOrdenCompra {
    Conexion cxn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    OrdenCompra oc = new OrdenCompra();
    
    @Override
    public List listar() {
        ArrayList<OrdenCompra>list=new ArrayList<>();
        String comando = "Select *from OrdenesCompra";
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                OrdenCompra oc = new OrdenCompra();
                oc.setOrdenCompraID(rs.getInt("OrdenCompraID"));
                oc.setProveedorID(rs.getInt("ProveedorID"));
                oc.setUsuarioID(rs.getInt("UsuarioID"));
                oc.setProveedorNombre(rs.getString("ProveedorNombre"));
                oc.setProveedorNit(rs.getString("ProveedorNit"));
                oc.setProveedorDireccion(rs.getString("ProveedorDireccion"));
                oc.setFechaCompra(rs.getDate("FechaCompra"));
                oc.setEstado(rs.getString("Estado"));
                list.add(oc);
            }
        }catch(Exception error){
            
        }
        return list;
    }

    @Override
    public OrdenCompra list(int OrdenCompraID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(int OrdenCompraID) {
        String comando = "CALL SpOrdenCompraInsert(1,1)";
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeQuery();
                    }catch(Exception error){
            
        }
        return false;
    
    }

    @Override
    public boolean edit(OrdenCompra ordenCompra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int OrdenCompraID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
