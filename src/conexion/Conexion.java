/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ediso
 */
public class Conexion {
    public static Connection conectar() {
    try {
        Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bd_laCanchita","root","");
        return cn;
    } catch (SQLException e) {
        System.out.println("Error en la conexión local " + e);
    }
    return null;
}
}
