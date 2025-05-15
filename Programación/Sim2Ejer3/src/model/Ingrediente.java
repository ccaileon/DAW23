package model;

import java.util.ArrayList;

public class Ingrediente {
    private String nombre;
    private int precio;
    private ArrayList<Ingrediente> listaIngredientes;

    public Ingrediente() {
    }

    public Ingrediente(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
