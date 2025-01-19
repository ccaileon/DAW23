package model;

public class Coche {  //Creamos la clase Coche y asignamos sus características
    private String marca, modelo, matricula;
    private int cv, cc;
    private double velocidad, kmRecorridos;

    public Coche() {
    } //Constructor vacío

    public Coche(String marca, String modelo, String matricula, int cv, int cc) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.cc = cc;
        this.velocidad = 0;
        this.kmRecorridos = 0;

    }

    // <------------getter------------->
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCv() {
        return cv;
    }

    public int getCc() {
        return cc;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    // <------------setter------------->
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public void mostrarDatos() { //Método que mostrará los datos del coche
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Cv: " + cv);
        System.out.println("Cc: " + cc);

    }

    public void acelerar(double kmh) { //Método que permitirá al coche acelerar según indique el usuario
        if (kmh < 10) { // El mínimo que puede acelerar el coche es de 10 km/h, por lo que aunque el usuario intente acelerar menos, el mínimo que acelerará el coche siempre será de 10 km/h
            kmh = 10;
        }
        if (this.cv > 99) { //Si los cv del coche son superiores a 100 cv
            this.velocidad += (Math.random() * kmh) + 10;
            double distanciaRecorrida = this.velocidad / 2;
            this.kmRecorridos = kmRecorridos + distanciaRecorrida;

        } else {
            this.velocidad += (Math.random() * kmh); //Si los cv del coche son inferiores a 100 cv
            double distanciaRecorrida = this.velocidad / 2;
            this.kmRecorridos = kmRecorridos + distanciaRecorrida;
        }
    }


}


