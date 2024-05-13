import database.DBConnection;
import model.Alumno;
import repositories.AlumnoRepository;

import java.sql.Connection;
import java.sql.SQLException;

public class Entrada {
    public static void main(String[] args) {
        AlumnoRepository alumnoRepository = new AlumnoRepository();
        alumnoRepository.insertarAlumno(new Alumno("Noelia", "Cegarra", "correo", 1548));
    }
}
