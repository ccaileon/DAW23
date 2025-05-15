package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {
        File file = new File("src/resources/examen.txt");
        FileReader fileReader = null;


        try {
            fileReader = new FileReader(file);
            int codigo = -1;
            while ((codigo = fileReader.read()) != -1) {
                System.out.println(codigo);
                System.out.println((char) codigo);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero");

        } catch (IOException e) {
            System.out.println("Error en los permisos de la lectura");
    } finally {
            try {
                assert fileReader != null;
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado del fichero");;
            }
        }

    }
}
