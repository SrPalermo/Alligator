/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelsDao;
import config.Conexion;
import interfaces.CrudTienda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Tienda;

/**
 *
 * @author arodas
 */
public class TiendaDao implements CrudTienda{

    Conexion cxn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Tienda tienda = new Tienda();
    
    @Override
    public List listar() {
        ArrayList<Tienda>list=new ArrayList<>();
        String comando = "Select *from Tiendas";
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                Tienda tienda = new Tienda();
                tienda.setTiendaID(rs.getInt("TiendaID"));
                tienda.setNombre(rs.getString("Nombre"));
                tienda.setDireccion(rs.getString("Direccion"));
                tienda.setPorcentajeGanancia(rs.getDouble("PorcentajeGanancia"));
                tienda.setEstado(rs.getString("Estado"));
                list.add(tienda);
            }
            
        }catch(Exception error){
            
        }
        return list;
    }

    @Override
    public Tienda list(int TiendaID) {
        ArrayList<Tienda>list=new ArrayList<>();
        String comando = "Select *from Tiendas where TiendaID = " + TiendaID;
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                tienda.setTiendaID(rs.getInt("TiendaID"));
                tienda.setNombre(rs.getString("Nombre"));
                tienda.setDireccion(rs.getString("Direccion"));
                tienda.setPorcentajeGanancia(rs.getDouble("PorcentajeGanancia"));
                tienda.setEstado(rs.getString("Estado"));
            } 
        }catch(Exception error){
            
        }
        return tienda;
    }

    @Override
    public boolean add(Tienda tienda) {
        String comando = "CALL SpTiendaInsert ('" + tienda.getNombre() + "','" + tienda.getDireccion() + "'," + String.valueOf(tienda.getPorcentajeGanancia()) + " );";
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeQuery();
        }catch(Exception error){
            
        }
        return false;
    }

    @Override
    public boolean edit(Tienda tienda) {
        String comando = "CALL SpTiendaEdit(" + tienda.getTiendaID() + ",'" + tienda.getNombre() + "','" + tienda.getDireccion() + "'," + String.valueOf(tienda.getPorcentajeGanancia()) + ");";
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeUpdate();
        }catch(Exception error){
            
        }
        return false;
    }

    @Override
    public boolean delete(int TiendaID) {
        String comando = "delete from Tiendas where TiendaID =" + TiendaID;
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeUpdate();
        }catch(Exception error){
            
        }
        return false;
    }
    
}
