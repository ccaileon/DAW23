public class Estacion {
    private int numeroPistas, numeroEsquiadores;
    String nombreEstacion;

    public Estacion(int numeroPistas, int numeroEsquiadores) {
        this.numeroPistas = numeroPistas;
        this.numeroEsquiadores = numeroEsquiadores;
    }

    public Estacion(int numeroEsquiadores) {
        this.numeroEsquiadores = numeroEsquiadores;
    }

    public int recaudacionDiaria() {
        return this.numeroEsquiadores * 50;
    }
}
