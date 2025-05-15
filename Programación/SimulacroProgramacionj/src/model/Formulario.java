package model;


import Exceptions.*;

import java.util.Scanner;

public class Formulario {
    public static void main(String[] args) throws LongitudDNINoValidaException, EmailIncorrectoException {
        int option;
        Scanner input = new Scanner(System.in);
        String nombre = null, apellidos = null, dni = null, email = null;
        boolean salir = false;
        do {
            System.out.println("1. Rellenar nombre");
            System.out.println("2. Rellenar apellidos");
            System.out.println("3. Rellenar DNI");
            System.out.println("4. Rellenar email");
            System.out.println("5. Finalizar");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Introduce tu nombre");
                    nombre = input.next();
                    tipoDeDato(nombre);

                    break;
                case 2:
                    System.out.println("Introduce tu apellido");
                    apellidos = input.next();
                    tipoDeDato(apellidos);
                    break;
                case 3:
                    System.out.println("Introduce tu DNI");
                    dni = input.next();
                    comprobarDni(dni);
                    break;
                case 4:
                    System.out.println("Introduce tu e-mail");
                    email = input.next();
                    if (!email.contains("@") || !email.contains(".")) {
                        throw new EmailIncorrectoException("El email no es correcto");
                    }
                    break;
                case 5:
                    if (nombre != null && apellidos != null & dni != null & email != null) {
                        salir = true;
                    } else {
                        System.out.println("Debe completar todos los campos");
                    }
                    break;

            }


        } while (option != 5 || !salir);
        System.out.println("Estos son los datos introducidos");
        System.out.println(nombre + " " + apellidos);
        System.out.println(dni);
        System.out.println(email);
    }


    public static void tipoDeDato(String dato) {
        for (int i = 0; i < dato.length(); i++) {
            boolean isDigit = Character.isDigit(dato.charAt(i));
            if (isDigit) {
                try {
                    throw new TipoDeDatoIncorrecto("El tipo de dato introducido no es correcto");
                } catch (TipoDeDatoIncorrecto e) {
                    System.out.println(e.getMessage());
                    ;
                }
            }
        }
    }

    public static void comprobarDni(String dni) {
        try {
            if (dni.length() != 9) {
                throw new LongitudDNINoValidaException("El dni no es correcto");
            }
            for (int i = 0; i < dni.length() - 1; i++) {
                boolean isDigit = Character.isDigit(dni.charAt(i));
                if (!isDigit) {
                    throw new NumeracionContieneLetrasException("La letra debe ir al final del dni");
                }
                isDigit = Character.isDigit(dni.charAt(dni.length() - 1));
                if (isDigit) {
                    throw new UltimoDigitoNoLetraException("El último digito del dni no es una letra");
                }
            }
        } catch (LongitudDNINoValidaException e) {
            System.out.println(e.getMessage());

        } catch (UltimoDigitoNoLetraException | NumeracionContieneLetrasException e) {
            System.out.println("Hay un fallo en el dni");
        }
    }
}

