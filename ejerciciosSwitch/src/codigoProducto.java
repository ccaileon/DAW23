import java.util.Scanner;

public class codigoProducto {
    public static void main(String[] args) {
        //Crea un programa que permita al usuario ingresar un código de producto (como una cadena de caracteres) y, utilizando una sentencia switch, muestre el nombre del producto y su precio correspondiente

        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el código del producto (formato 000, 001, 002...):");
        String codigoProducto = input.next();

        switch (codigoProducto) {
            case "001":
                System.out.println("Papel Higiénico 12 Rollos. PVP 3€");
                break;
            case "002":
                System.out.println("Leche Desnatada 6 Unidades. PVP 1,50€");
                break;
            case "003":
                System.out.println("Galletas Maria 200 gramos. PVP 2€");
                break;
            case "004":
                System.out.println("Pan de Molde 300 gramos. PVP 1,30€");
                break;
            case "005":
                System.out.println("Carne picada 500 gramos. PVP 3,50€");
                break;
            default:
                System.out.println("No se ha encontrado el artículo.");
        }

    }
}
