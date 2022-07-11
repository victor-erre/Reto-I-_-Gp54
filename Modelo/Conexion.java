package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    Connection connection;
    private String driver="com.mysql.cj.jdbc.Driver";
    private String usuario="root";
    private String contraseña="";
    private String urlConexion="jdbc:mysql://localhost:3306/reto1_gp54_db";

    public Conexion() {
        //Se inicializa la vble connection
        //se intenta hacer conecion mediante el bloque try catch 
        try {
            Class.forName(driver);
            connection = (Connection)DriverManager.getConnection(urlConexion , usuario,contraseña);
            if (connection != null){
                System.out.println("COnextión exitosa con la base de datos");
            }
    } catch (ClassNotFoundException | SQLException e){
            System.out.println("Error en la conexion"+ e);
        }
    }
    //Se crea la función getConnection
    public Connection getConnection(){
        //Puede retornar msje de conexión o no conexión
        return connection;
    }
    
}
