/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelsDao;

import config.Conexion;
import interfaces.CrudUsuarioRol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.UsuarioRol;
/**
 *
 * @author lgomez
 */
public class UsuarioRolDao implements CrudUsuarioRol{
    Conexion cxn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    UsuarioRol us = new UsuarioRol();
    
    @Override
    public List listar() {
        ArrayList<UsuarioRol>list=new ArrayList<>();
        String comando = "SELECT *FROM USUARIOSROLES";
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                UsuarioRol u = new UsuarioRol();
                u.setID(rs.getInt("ID"));
                u.setUsuarioID(rs.getInt("UsuarioID"));
                u.setRolID(rs.getInt("RolID"));
                u.setTiendaID(rs.getInt("TiendaID"));
                list.add(u);
            }
            
        }catch(Exception error){
            
        }
        return list;
    }

    @Override
    public UsuarioRol list(int ID) {
        ArrayList<UsuarioRol>list=new ArrayList<>();
        String comando = "SELECT *FROM USUARIOSROLES WHERE ID="+ID;
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                us.setID(rs.getInt("ID"));
                us.setUsuarioID(rs.getInt("UsuarioID"));
                us.setRolID(rs.getInt("RolID"));
                us.setTiendaID(rs.getInt("TiendaID"));
            } 
        }catch(Exception error){
            
        }
        return us;
    }

    @Override
    public boolean add(UsuarioRol tienda) {
        String comando = "CALL spUsuariosRolesEdit(" + tienda.getUsuarioID()+ ",'" + tienda.getRolID()+ "'," + tienda.getTiendaID()+ ");";
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeQuery();
        }catch(Exception error){
            
        }
        return false;
    }

    @Override
    public boolean edit(UsuarioRol tienda) {
        String comando = "CALL spUsuariosRolesUpdate ("+ tienda.getID()+ ",'" + tienda.getUsuarioID()+ ",'" + tienda.getRolID()+ "'," + tienda.getTiendaID()+ ");";
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeQuery();
        }catch(Exception error){
            
        }
        return false;
    }

    @Override
    public boolean delete(int ID) {
        String comando = "delete from USUARIOSROLES WHERE ID="+ID;
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeUpdate();
        }catch(Exception error){
            
        }
        return false;
    }
    
}
