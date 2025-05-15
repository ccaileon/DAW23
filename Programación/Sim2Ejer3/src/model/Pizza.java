package model;

import java.util.ArrayList;

public class Pizza {
    String nombre;
    int precio;
    ArrayList<Ingrediente> listaIngredientes;

    public Pizza() {
    }

    public Pizza(String nombre, int precio, ArrayList<Ingrediente> listaIngredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.listaIngredientes = listaIngredientes;
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

    public ArrayList<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
}
