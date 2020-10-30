/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelsDao;
import config.Conexion;
import interfaces.CrudProveedor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import models.Proveedor;
/**
 *
 * @author lgomez
 */
public class ProveedorDao implements CrudProveedor{
    Conexion cxn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Proveedor u = new Proveedor();
    
    @Override
    public List listar() {
        ArrayList<Proveedor>list=new ArrayList<>();
        String comando = "SELECT *FROM Proveedores";
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                Proveedor u = new Proveedor();
                u.setProveedorID(rs.getInt("ProveedorID"));
                u.setNombre(rs.getString("Nombre"));
                u.setApellido(rs.getString("Apellido"));
                u.setEmail(rs.getString("Email"));
                u.setDireccion(rs.getString("Direccion"));
                u.setNit(rs.getString("Nit"));
                u.setEstado(rs.getString("Estado"));
                list.add(u);
            }
            
        }catch(Exception error){
            
        }
        return list;
    }

    @Override
    public Proveedor list(int ProveedorID) {
        ArrayList<Proveedor>list=new ArrayList<>();
        String comando = "SELECT *FROM proveedores where ProveedorID = " + ProveedorID;
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                u.setProveedorID(rs.getInt("ProveedorID"));
                u.setNombre(rs.getString("Nombre"));
                u.setApellido(rs.getString("Apellido"));
                u.setEmail(rs.getString("Email"));
                u.setDireccion(rs.getString("Direccion"));
                u.setNit(rs.getString("Nit"));
                u.setEstado(rs.getString("Estado"));
            } 
        }catch(Exception error){
            
        }
        return u;
    }

    @Override
    public boolean add(Proveedor proveedor) {
        String comando = "CALL SpProveedoresInsert ('" + proveedor.getNombre() + "','" + proveedor.getApellido() + "','" + proveedor.getEmail()+ "','" + proveedor.getDireccion()+ "','" + proveedor.getNit()+ "');";
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeQuery();
        }catch(Exception error){
            
        }
        return false;
    }

    @Override
    public boolean edit(Proveedor proveedor) {
        String comando = "CALL SpProveedoresEdit(" + proveedor.getProveedorID()+ ",'" + proveedor.getNombre() + "','" + proveedor.getApellido() + "','" + proveedor.getEmail()+ "','" + proveedor.getDireccion()+ "'," + proveedor.getNit()+ ");";
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeUpdate();
        }catch(Exception error){
            
        }
        return false;
    }

    @Override
    public boolean delete(int ProveedorID) {
        String comando = "delete from proveedores where ProveedorID =" + ProveedorID;
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeUpdate();
        }catch(Exception error){
            
        }
        return false;
    }
    
}
