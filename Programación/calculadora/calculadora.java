import java.util.Scanner;
public class calculadora {
    public static void main(String[] args){
Scanner calculadora = new Scanner(System.in);
    System.out.println("Introduce el primer número");
    double primeraVariable = calculadora.nextDouble();
    System.out.println("Introduce el segundo número");
    double segundaVariable = calculadora.nextDouble();
    double resultadoSuma = primeraVariable + segundaVariable;
    double resultadoResta = primeraVariable - segundaVariable;
    double resultadoMulti = primeraVariable * segundaVariable;
    double resultadoDivi = primeraVariable / segundaVariable;
    double resultadoRestoEnt= primeraVariable % segundaVariable;
System.out.println("La suma de " + primeraVariable + " y " + segundaVariable + " es " + resultadoSuma );
System.out.println("La resta de " + primeraVariable + " y " + segundaVariable + " es " + resultadoResta );
System.out.println("La multiplicación de " + primeraVariable + " y" + segundaVariable + " es " + resultadoMulti );
System.out.println("La división de " + primeraVariable + " y " + segundaVariable + " es " + resultadoDivi );
System.out.println("El resto entero de " + primeraVariable + " y " + segundaVariable + " es " + resultadoRestoEnt );
    }

}
