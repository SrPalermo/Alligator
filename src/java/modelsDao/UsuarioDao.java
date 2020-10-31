/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelsDao;

import config.Conexion;
import interfaces.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Usuario;


/**
 *
 * @author arodas
 */
public class UsuarioDao implements Crud{

    Conexion cxn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Usuario u = new Usuario();
    
    public Usuario buscar(String iduser){
        String sql="SELECT *FROM usuarios WHERE UsuarioID="+iduser;
        try {
            con=cxn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Usuario u = new Usuario();
                u.setUsuarioID(rs.getInt("UsuarioID"));
                u.setNombre(rs.getString("Nombre"));
                u.setApellido(rs.getString("Apellido"));
                u.setUsuario(rs.getString("Usuario"));
                u.setContrasea(rs.getString("Contrasea"));
                u.setEmail(rs.getString("Email"));
                u.setEstado(rs.getString("Estado"));
            }
        } catch (Exception e) {
        }
        return u;
    }
    
    @Override
    public List listar() {
        ArrayList<Usuario>list=new ArrayList<>();
        String comando = "Select *from Usuarios";
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                Usuario u = new Usuario();
                u.setUsuarioID(rs.getInt("UsuarioID"));
                u.setNombre(rs.getString("Nombre"));
                u.setApellido(rs.getString("Apellido"));
                u.setUsuario(rs.getString("Usuario"));
                u.setContrasea(rs.getString("Contrasea"));
                u.setEmail(rs.getString("Email"));
                u.setEstado(rs.getString("Estado"));
                list.add(u);
            }
            
        }catch(Exception error){
            
        }
        return list;
    }

    @Override
    public Usuario list(int UsuarioID) {
        ArrayList<Usuario>list=new ArrayList<>();
        String comando = "Select *from Usuarios where UsuarioID = " + UsuarioID;
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                u.setUsuarioID(rs.getInt("UsuarioID"));
                u.setNombre(rs.getString("Nombre"));
                u.setApellido(rs.getString("Apellido"));
                u.setUsuario(rs.getString("Usuario"));
                u.setContrasea(rs.getString("Contrasea"));
                u.setEmail(rs.getString("Email"));
                u.setEstado(rs.getString("Estado"));
            } 
        }catch(Exception error){
            
        }
        return u;
    }

    @Override
    public boolean add(Usuario usuario) {
        String comando = "CALL SpUsuariosInsert ('" + usuario.getNombre() + "','" + usuario.getApellido() + "','" + usuario.getUsuario() + "','" + usuario.getContrasea() + "','" + usuario.getEmail() + "');";
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeQuery();
        }catch(Exception error){
            
        }
        return false;
    }

    @Override
    public boolean edit(Usuario usuario) {
        String comando = "CALL SpUsuariosEdit(" + usuario.getUsuarioID() + ",'" + usuario.getNombre() + "','" + usuario.getApellido() + "','" + usuario.getUsuario() + "','" + usuario.getContrasea()  + "','" + usuario.getEmail() + "');";
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeUpdate();
        }catch(Exception error){
            
        }
        return false;
    }

    @Override
    public boolean delete(int UsuarioID) {
        String comando = "delete from usuarios where UsuarioID =" + UsuarioID;
        try{
            con = cxn.getConnection();
            ps = con.prepareStatement(comando);
            ps.executeUpdate();
        }catch(Exception error){
            
        }
        return false;
    }

    @Override
    public Usuario validar(String Email, String Contrasea) {
        //Usuario us = new Usuario();
        String sql="SELECT *FROM USUARIOS where Email=? and Contrasea=?";
        try {
            con = cxn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, Email);
            ps.setString(2, Contrasea);
            rs=ps.executeQuery();
            while(rs.next()){
                u.setUsuarioID(rs.getInt("UsuarioID"));
                u.setNombre(rs.getString("Nombre"));
                u.setApellido(rs.getString("Apellido"));
                u.setUsuario(rs.getString("Usuario"));
                u.setContrasea(rs.getString("Contrasea"));
                u.setEmail(rs.getString("Email"));
                u.setEstado(rs.getString("Estado"));
            }
        } catch (Exception e) {
            u.setNombre(e.getMessage());
        }
        return u;
    }
    
}
