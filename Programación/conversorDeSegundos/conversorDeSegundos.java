import java.util.Scanner;
public class conversorDeSegundos {
    public static void main(String[] args){
        Scanner conversorDeSegundos = new Scanner(System.in);
        System.out.println("Introduce los segundos");
        long segundos = conversorDeSegundos.nextLong();
        long segundosMinutos = segundos / 60;
        long segundosHoras = segundos / 3600;
        System.out.println(segundos + " segundos son " + segundosMinutos + " minutos y "  + segundosHoras + " horas.");
    }
}
