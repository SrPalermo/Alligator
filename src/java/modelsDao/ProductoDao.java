/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelsDao;

import config.Conexion;
import interfaces.CrudProducto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import models.Producto;

/**
 *
 * @author lgomez
 */
public class ProductoDao implements CrudProducto{
    Conexion cxn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Producto producto = new Producto();

    @Override
    public List listar() {
        ArrayList<Producto>list=new ArrayList<>();
        String comando = "Select *from Productos";
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                Producto producto = new Producto();
                producto.setProductoID(rs.getInt("ProductoID"));
                producto.setDescripcion(rs.getString("Descripcion"));
                producto.setMarcaID(rs.getInt("MarcaID"));
                producto.setEstado(rs.getString("Estado"));
                /*u.setContrasea(rs.getString("Contrasea"));
                u.setEmail(rs.getString("Email"));
                u.setEstado(rs.getString("Estado"));*/
                list.add(producto);
            }
            
        }catch(Exception error){
            
        }
        return list;
    }

    @Override
    public Producto list(int ProductoID) {
        ArrayList<Producto>list=new ArrayList<>();
        String comando = "Select *from Productos where ProductoID = " + ProductoID;
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                producto.setProductoID(rs.getInt("ProductoID"));
                producto.setDescripcion(rs.getString("Descripcion"));
                producto.setMarcaID(rs.getInt("MarcaID"));
                producto.setEstado(rs.getString("Estado"));
            } 
        }catch(Exception error){
            
        }
        return producto;
    }

    @Override
    public boolean add(Producto producto) {
        String comando = "CALL SpProductosInsert ('" + producto.getDescripcion() + "'," + producto.getMarcaID()+ ");";
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeQuery();
        }catch(Exception error){
            
        }
        return false;
    }

    @Override
    public boolean edit(Producto producto) {
        String comando = "CALL SpProductosEdit (" + producto.getProductoID()+ ",'" + producto.getDescripcion() + "'," + producto.getMarcaID()+ ");";
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeQuery();
        }catch(Exception error){
            
        }
        return false;}

    @Override
    public boolean delete(int ProductoID) {
        String comando = "delete from Productos where ProductoID =" + ProductoID;
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeUpdate();
        }catch(Exception error){
            
        }
        return false;
    }
}
