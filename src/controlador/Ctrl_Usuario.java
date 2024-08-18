/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import conexion.Conexion;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import modelo.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ediso
 */
public class Ctrl_Usuario {
    public boolean loginUser(Usuario objeto) {
    boolean respuesta = false; // Inicializa la variable de respuesta a falso

    Connection cn = Conexion.conectar(); // Obtiene una conexión a la base de datos

    String sql = "select usuario, password from tb_usuario where usuario = '"+ objeto.getUsuario()+"' and password = '"+objeto.getPassword()+"'";

    Statement st;
    try {
        st = (Statement) cn.createStatement();// Crea un objeto Statement para ejecutar la consulta
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) { // Itera sobre los resultados de la consulta
            respuesta = true; // Si se encuentra al menos un registro, se considera que la autenticación es exitosa
        }
    } catch (SQLException e) {
        System.out.println("Error al Iniciar Sesion");
        JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion");
    }

    return respuesta;
}
}
