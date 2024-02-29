import model.Persona;

public class EntradaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Luis", "Garcia", "1234A", 34, 175, 73);
        Persona persona1 = new Persona("Marta", "Lopez", "3456B", 18, 154, 60);
        Persona persona2 = new Persona("Carlos", "Muñoz");
        Persona persona3 = new Persona();

        persona1.mostrarDatos();
        persona.mostrarDatos();
        persona2.mostrarDatos();
        persona3.mostrarDatos();





    }

}
