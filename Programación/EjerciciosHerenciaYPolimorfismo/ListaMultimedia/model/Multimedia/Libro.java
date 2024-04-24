package model.Multimedia;
import model.Persona.Persona;
public final class Libro extends ElementoMultimedia{
    private String isbn;
    private int numeroPaginas;

    public Libro(String isbn, int numeroPaginas) {
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro(int identificador, double size, String titulo, Persona autor, String formato, String isbn, int numeroPaginas) {
        super(identificador, size, titulo, autor, formato);
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("isbn = " + isbn);
        System.out.println("numeroPaginas = " + numeroPaginas);
    }
}
