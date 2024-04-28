package repositories;

import database.DBConnection;
import model.Alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AlumnoRepository {
    //Todas las acciones CRUD que necesito del modelo Alumno
    //INSERT - SELECT - UPDATE - DELETE -> CONNECTION
    private Connection connection;
    public void insertarAlumno(Alumno alumno){
        // abrir la conexión
        connection = DBConnection.getConnection();

        // trabajar con la conexión
        // INSERT into alomnos (nombre, apellido, correo, telefono) VALUES ('carla','garcia','correo','1234')
        Statement statement = null;
        PreparedStatement preparedStatement = null;

        try {
//            statement = connection.createStatement();
//            String query = "INSERT INTO alumnos (nombre,apellido,correo,telefono) VALUES ('carla2','garcia2','correo','1234')";
//            statement.execute(query);
//            statement.close();
            String query = "INSERT INTO alumnos (nombre,apellido,correo,telefono) VALUES (?,?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, alumno.getNombre());
            preparedStatement.setString(2, alumno.getApellido());
            preparedStatement.setString(3, alumno.getCorreo());
            preparedStatement.setInt(4, alumno.getTelefono());
            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println("Fallo en la sentencia SQL");
            System.out.println(e.getMessage());
        }


        // cerrar la conexión
        DBConnection.closeConnection();


    }

}
