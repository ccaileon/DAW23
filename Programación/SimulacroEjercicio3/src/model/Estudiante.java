package model;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class Estudiante implements Serializable {
    private final static long serialVersionUID = 123123L;
    private String nombre;
    private int edad;
    private int nota1, nota2, nota3;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, int nota1, int nota2, int nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int notaMedia() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                ", Nota1=" + nota1 +
                ", Nota2=" + nota2 +
                ", Nota3=" + nota3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return edad == that.edad && Double.compare(nota1, that.nota1) == 0 && Double.compare(nota2, that.nota2) == 0 && Double.compare(nota3, that.nota3) == 0 && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, nota1, nota2, nota3);
    }

    public static void main(String[] args) {
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(new Estudiante("Juan", 27, 3, 5, 8));
        listaEstudiantes.add(new Estudiante("Ana", 35, 7, 6, 9));

        for (Estudiante item : listaEstudiantes) {
            System.out.println(item.toString());
        }


    }

    public static ArrayList<Estudiante> leerFichero(String nombreFichero) throws IOException {
        ArrayList<Estudiante> listaLeida = new ArrayList<>();
        File file = new File(nombreFichero);
        //FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String linea = null;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
            String[] elementos = linea.split(",");
            //Estudiante estudiante = new Estudiante(String.valueOf(elementos[0]), Integer.valueOf(elementos[1]), Integer.valueOf(elementos[2]), Integer.valueOf(elementos[3]));
            listaLeida.add(new Estudiante(elementos[0], Integer.valueOf(elementos[1]), Integer.valueOf(elementos[2]), Integer.valueOf(elementos[3]), Integer.valueOf(elementos[4])));
        }
        br.close();
        return listaLeida;
    }

    public static void escribirEstudiante() throws IOException {
        File file = new File("src/SimulacroEjercicio3/resources/estudiantes.obj");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));

        objectOutputStream.writeObject(new Estudiante("Maria", 24, 4, 7, 8));
        objectOutputStream.writeObject(new Estudiante("Miranda", 34, 2, 7, 9));
        objectOutputStream.writeObject(new Estudiante("Lopez", 18, 6, 2, 10));
    }

    public static void leerEstudiantes() throws IOException, ClassNotFoundException, ClassCastException {
        File file = new File("src/SimulacroEjercicio3/resources/estudiantes.obj");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

        Estudiante estudiante = (Estudiante) objectInputStream.readObject();
        System.out.println(estudiante);
        estudiante = (Estudiante) objectInputStream.readObject();
        System.out.println(estudiante);
        estudiante = (Estudiante) objectInputStream.readObject();
        System.out.println(estudiante);
        objectInputStream.close();
    }
}




