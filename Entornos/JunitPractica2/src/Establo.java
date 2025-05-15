public class Establo {
    private int numeroCaballos, numeroClientes;

    public Establo() {
    }

    public Establo(int numeroCaballos, int numeroClientes) {
        this.numeroCaballos = numeroCaballos;
        this.numeroClientes = numeroClientes;
    }

    public int gananciaMensual() {
        //cada cliente paga 50€ por cada caballo en el establo
        return this.numeroClientes * this.numeroCaballos * 50;
    }

    public int gastoMensual() {
        //cada caballo consume 20€ en alimento al mes
        return this.numeroCaballos * 20;
    }
}
