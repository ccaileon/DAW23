import utils.*;

import java.util.Scanner;

import static java.lang.Character.isLetter;

public class Formulario {
    public static void main(String[] args) {
        String nombre = null;
        int opcion = 0;
        String apellidos = null;
        String dni = null;
        String email = null;
        do {
            System.out.println("1. Rellenar nombre");
            System.out.println("2. Rellenar apellidos");
            System.out.println("3. Rellenar DNI");
            System.out.println("4. Email");
            System.out.println("5. Salir");

            Scanner input = new Scanner(System.in);
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.printf("Nombre: ");
                    nombre = input.next();
                    try {
                        comprobarSoloLetras(nombre);
                    } catch (TipoDatoIncorrectoException e) {
                        System.out.println("El nombre introducido no es correcto.");
                        nombre = null;
                    }
                    break;

                case 2:
                    System.out.printf("Apellidos: ");
                    apellidos = input.next();
                    try {
                        comprobarSoloLetras(apellidos);
                    } catch (TipoDatoIncorrectoException e) {
                        System.out.println("El apellido introducido no es correcto.");
                        apellidos = null;
                    }
                    break;
                case 3:
                    System.out.printf("DNI: ");
                    dni = input.next();
                    try {
                        comprobarDni(dni);
                    } catch (LongitudDNINoValidaException | UltimoDigitoNoLetraException e) {
                        System.out.println("El DNI es incorrecto");
                        dni = null;
                    } catch (NumeracionContieneLetrasException e) {
                        System.out.println("El DNI es incorrecto");
                    }
                    break;
                case 4:
                    System.out.printf("Email: ");
                    email = input.next();
                    try {
                        comprobarEmail(email);
                    } catch (EmailIncorrectoException e) {
                        System.out.println("El email introducido no es válido");
                        email = null;
                    }

            }

        } while (opcion != 5 || !comprobarFormulario(nombre, apellidos, dni, email));


        System.out.println("Mostrando los datos introducidos:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("DNI: " + dni);

    }

    public static boolean comprobarDni(String dni) throws LongitudDNINoValidaException, UltimoDigitoNoLetraException, NumeracionContieneLetrasException {
        char ultimoCaracter = dni.charAt(dni.length() - 1);
        if (dni.length() != 9) {
            throw new LongitudDNINoValidaException();

        } else if (!Character.isLetter(ultimoCaracter)) {
            throw new UltimoDigitoNoLetraException();
        }
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(dni.charAt(i))) {
                throw new NumeracionContieneLetrasException();
            }
        }
        return true;
    }

    public static boolean comprobarFormulario(String nombre, String apellidos, String dni, String email) {
        if (nombre == null || apellidos == null || dni == null) {
            System.out.println("Debe cumplimentar todos los campos antes de salir del formulario.");
            return false;
        }
        return true;
    }

    public static boolean comprobarEmail(String email) throws EmailIncorrectoException {
        if (!email.contains("@") || !email.contains(".")) {
            throw new EmailIncorrectoException();
        }
        return true;
    }

    public static boolean comprobarSoloLetras(String value) throws TipoDatoIncorrectoException {
        if (value.matches(".*\\d.*")) {
            throw new TipoDatoIncorrectoException();
        }
        return true;
    }
}
