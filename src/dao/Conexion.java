/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Josue Cuba
 */
public class Conexion {
    public static Connection Cadena() throws ClassNotFoundException, SQLException
    {
        //nombre del controlador
        Class.forName("com.mysql.jdbc.Driver");
        //url de la conexion, le agregamos usuario y contraseña
        Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/DBSISTEMAPMVG","root","root");
        return cn;
    }
}
