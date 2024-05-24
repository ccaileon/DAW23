//1. Rellenar nombre.
//2. Rellenar apellidos.
//3. Rellenar DNI.
//4. Rellenar e-mail.
//5. Finalizar.

import utils.*;

import java.util.Scanner;

public class Formulario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        String nombre = null;
        String apellidos = null;
        String dni = null;
        String email = null;
        do {
            System.out.println("Escoge una opción:");
            System.out.println("1. Rellenar nombre");
            System.out.println("2. Rellenar apellidos");
            System.out.println("3. Rellenar DNI");
            System.out.println("4. Rellenar e-mail");
            System.out.println("5. Salir");
            System.out.printf("Opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("Nombre: ");
                    nombre = input.next();

                    try {
                        soloLetras(nombre);
                        break;
                    } catch (TipoDatoIncorrectoException e) {
                        System.out.println("El nombre no es correcto.");
                    }
                    nombre = null;
                    break;

                case 2:
                    System.out.printf("Apellidos: ");
                    apellidos = input.next();
                    try {
                        soloLetras(apellidos);
                        break;
                    } catch (TipoDatoIncorrectoException e) {
                        System.out.println("El apellido no es correcto.");
                    }
                    apellidos = null;
                    break;

                case 3:
                    System.out.printf("DNI: ");
                    dni = input.next();
                    try {
                        validarDni(dni);
                        break;
                    } catch (LongitudDNINoValidaException e) {
                        System.out.println("La longitud del DNI no es correcta");
                    } catch (NumeracionContieneLetrasException e) {
                        System.out.println("El DNI no es correcto");
                    } catch (UltimoDigitoNoLetraException e) {
                        System.out.println("El último carácter del DNI no es una letra");
                    }
                    dni = null;
                    break;

                case 4:
                    System.out.printf("E-mail: ");
                    email = input.next();
                    try {
                        validarEmail(email);
                        break;
                    } catch (EmailIncorrectoException e) {
                        System.out.println("El email no es correcto");
                    }
                    email = null;
                    break;
            }

        } while (opcion != 5 || !validarFormulario(nombre, apellidos, dni, email));

        System.out.println("Estos son los datos introducidos");
        System.out.println("Nombre y apellido: " + nombre + " " + apellidos);
        System.out.println("DNI: " + dni);
        System.out.println("Email: " + email);

    }

    public static boolean validarFormulario(String nombre, String apellidos, String dni, String email) {
        if (nombre != null && apellidos != null && dni != null && email != null) {
            return true;
        }
        System.out.println("No puede salir del formulario hasta rellenar todos los campos.");
        return false;
    }

    public static boolean soloLetras(String value) throws TipoDatoIncorrectoException {
        if (!value.matches("[a-zA-Z]*")) {
            throw new TipoDatoIncorrectoException("El dato introducido contiene números");
        }
        return true;
    }

    public static boolean validarDni(String dni) throws LongitudDNINoValidaException, NumeracionContieneLetrasException, UltimoDigitoNoLetraException {
        if (dni.length() != 9) {
            throw new LongitudDNINoValidaException("La longitud del DNI no es correcta.");
        }
        for (int i = 0; i < 8; i++) {

            if (Character.isLetter(dni.charAt(i))) {
                throw new NumeracionContieneLetrasException("El dni no es correcto.");
            }
        }

        if (Character.isDigit(dni.charAt(dni.length() - 1))) {
            throw new UltimoDigitoNoLetraException("La última letra del dni es un número");
        }
        return true;
    }

    public static boolean validarEmail(String email) throws EmailIncorrectoException {
        if (!email.contains("@") && !email.contains(".")) {
            throw new EmailIncorrectoException("El email no es correcto");
        }
        return true;
    }
}

