package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Configuración para poder tener la base de datos
//Static: accesible desde todos los sitios de forma directa
//Un elemento que pertenece a la clase, no al objeto
public class DBConnection {
    static Connection connection = null;

    private static void createConnection() {
        //cargar el driver en memoria:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //uri -> jdbc:mysql://127.0.0.1:3306/programacion_crud
            String uri = "jdbc:mysql://127.0.0.1:3306/programacion_crud";
            //abrir la conexión desde una uri

            connection = DriverManager.getConnection(uri, "root", "");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver");
            //System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error en la ejecución SQL");
            //System.out.println(e.getMessage());
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            createConnection();
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            connection.close();
            connection = null;
        } catch (SQLException e) {
            System.out.println("Error en el cerrado");
        }
    }
}
