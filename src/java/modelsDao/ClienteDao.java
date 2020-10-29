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
                cliente.setNombre(rs.getString("Nombres"));
                cliente.setApellido(rs.getString("Apellido"));
                cliente.setDireccion(rs.getString("Direccion"));
                cliente.setEmail(rs.getString("Email"));
                cliente.setEstado(rs.getString("Estado"));
                list.add(cliente);
            }
            
        }catch(Exception error){
            
        }
        return list;
    }

    @Override
    public Cliente list(int ClienteID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int ClienteID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
