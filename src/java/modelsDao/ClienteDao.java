/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelsDao;

import config.Conexion;
import interfaces.CrudCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Cliente;

/**
 *
 * @author arodas
 */
public class ClienteDao implements CrudCliente{
    Conexion cxn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cliente cliente = new Cliente();

    @Override
    public List listar() {
        ArrayList<Cliente>list=new ArrayList<>();
        String comando = "Select *from Clientes";
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setClienteID(rs.getInt("ClienteID"));
                cliente.setNombre(rs.getString("Nombre"));
                cliente.setApellido(rs.getString("Apellido"));
                cliente.setEmail(rs.getString("Email"));
                cliente.setDireccion(rs.getString("Direccion"));
                cliente.setNit(rs.getInt("Nit"));
                cliente.setEstado(rs.getString("Estado"));
                list.add(cliente);
            }
            
        }catch(Exception error){
            
        }
        return list;
    }

    @Override
    public Cliente list(int ClienteID) {
        ArrayList<Cliente>list=new ArrayList<>();
        String comando = "Select *from Clientes where ClienteID = " + ClienteID;
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                cliente.setClienteID(rs.getInt("ClienteID"));
                cliente.setNombre(rs.getString("Nombre"));
                cliente.setApellido(rs.getString("Apellido"));
                cliente.setEmail(rs.getString("Email"));
                cliente.setDireccion(rs.getString("Direccion"));
                cliente.setNit(rs.getInt("Nit"));
                cliente.setEstado(rs.getString("Estado"));
            } 
        }catch(Exception error){
            
        }
        return cliente;
    }

    @Override
    public boolean add(Cliente cliente) {
        String comando = "CALL SpClientesInsert ('" + cliente.getNombre() + "','" + cliente.getApellido() + "','" + cliente.getDireccion() + "','" + cliente.getEmail() + "'," + String.valueOf( cliente.getNit()) + ");";
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeQuery();
        }catch(Exception error){
            
        }
        return false;
    }

    @Override
    public boolean edit(Cliente cliente) {
        String comando = "CALL SpClientesEdit(" + String.valueOf( cliente.getClienteID()) + ",'" + cliente.getNombre() + "','" + cliente.getApellido() + "','" + cliente.getEmail() + "','" + cliente.getDireccion() + "'," + String.valueOf( cliente.getNit()) + ");";
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeUpdate();
        }catch(Exception error){
            
        }
        return false;
    }
    
    @Override
    public boolean delete(int ClienteID) {
        String comando = "delete from Clientes where ClienteID =" + ClienteID;
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeUpdate();
        }catch(Exception error){
            
        }
        return false;
    }
    
}
