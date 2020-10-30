package config;

import java.sql.*;

public class Conexion {

    Connection cxn;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cxn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ferreteria","admin","12345678");
        } catch (Exception error) {
            System.err.println("Error: " + error);
        }
    }

    public Connection getConnection() {
        return cxn;
    }
}
