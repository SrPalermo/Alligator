/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelsDao;

import config.Conexion;
import interfaces.CrudMarca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Marca;

/**
 *
 * @author arodas
 */
public class MarcaDao implements CrudMarca {
    Conexion cxn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Marca marca = new Marca();
    
    @Override
    public List listar() {
        ArrayList<Marca>list=new ArrayList<>();
        String comando = "Select *from Marcas";
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                Marca marca = new Marca();
                marca.setMarcaID(rs.getInt("MarcaID"));
                marca.setDescripcion(rs.getString("Descripcion"));
                list.add(marca);
            }
            
        }catch(Exception error){
            
        }
        return list;
    }

    @Override
    public Marca list(int MarcaID) {
        ArrayList<Marca>list=new ArrayList<>();
        String comando = "Select *from Marcas where MarcaID = " + MarcaID;
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                marca.setMarcaID(rs.getInt("MarcaID"));
                marca.setDescripcion(rs.getString("Descripcion"));
            } 
        }catch(Exception error){
            
        }
        return marca;
        
    }

    @Override
    public boolean add(Marca marca) {
       String comando = "CALL SpMarcasInsert('" + marca.getDescripcion() + "');";
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeQuery();
        }catch(Exception error){
            
        }
        return false;
    
    }

    @Override
    public boolean edit(Marca marca) {
        String comando = "CALL SpMarcasEdit(" + marca.getMarcaID() +",'"+ marca.getDescripcion() + "');"; 
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeQuery();
        }catch(Exception error){
            
        }
        return false;
    
    }

    @Override
    public boolean delete(int MarcaID) {
        String comando = "delete from Marcas where MarcaID =" + MarcaID;
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeUpdate();
        }catch(Exception error){
            
        }
        return false;
    
    }
    
}
