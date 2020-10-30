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
    Producto u = new Producto();

    @Override
    public List listar() {
        ArrayList<Producto>list=new ArrayList<>();
        String comando = "Select *from Usuarios";
        try{
            con=cxn.getConnection();
            ps=con.prepareStatement(comando);
            rs=ps.executeQuery();
            while(rs.next()){
                Producto u = new Producto();
                u.setProductosID(rs.getInt("UsuarioID"));
                u.setDescripcion(rs.getString("Descripcion"));
                u.setMarcaID(rs.getInt("MarcaID"));
                u.setEstado(rs.getString("Estado"));
                /*u.setContrasea(rs.getString("Contrasea"));
                u.setEmail(rs.getString("Email"));
                u.setEstado(rs.getString("Estado"));*/
                list.add(u);
            }
            
        }catch(Exception error){
            
        }
        return list;
    }

    @Override
    public Producto list(int ProductoID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int ProductoID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
