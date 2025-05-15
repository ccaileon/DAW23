public class Calculadora {
    private int numero1, numero2;

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int restar(int numero1, int numero2){
        return numero1 - numero2;
    }

    public int multiplicar (int numero1, int numero2) {
        return numero1 * numero2;
    }
}
