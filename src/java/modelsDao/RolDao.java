/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelsDao;


import config.Conexion;
import interfaces.CrudRol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Rol;

/**
 *
 * @author arodas
 */
public class RolDao implements CrudRol{
    Conexion cxn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Rol role = new Rol();
    
    @Override
    public List listar() {
        ArrayList<Rol>list=new ArrayList<>();
        String comando = "Select *from Roles";
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                Rol role = new Rol();
                role.setRolID(rs.getInt("RolID"));
                role.setDescripcion(rs.getString("Descripcion"));
                role.setEstado(rs.getString("Estado"));
                list.add(role);
            }
            
        }catch(Exception error){
            
        }
        return list;
    }

    @Override
    public Rol list(int RolID) {
        ArrayList<Rol>list=new ArrayList<>();
        String comando = "Select *from Roles where RolID = " + RolID;
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                role.setRolID(rs.getInt("RolID"));
                role.setDescripcion(rs.getString("Descripcion"));
                role.setEstado(rs.getString("Estado"));
            } 
        }catch(Exception error){
            
        }
        return role;
    }

    @Override
    public boolean add(Rol role) {
        String comando = "CALL SpRolesInsert ('" + role.getDescripcion() + "');";
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeQuery();
        }catch(Exception error){
            
        }
        return false;
    }

    @Override
    public boolean edit(Rol role) {
        String comando = "CALL SpRolesEdit(" + role.getRolID() + ",'" + role.getDescripcion() + "');";
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeUpdate();
        }catch(Exception error){
            
        }
        return false;
    }

    @Override
    public boolean delete(int RolID) {
        String comando = "delete from Roles where RolID =" + RolID;
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeUpdate();
        }catch(Exception error){
            
        }
        return false;
    }
}
