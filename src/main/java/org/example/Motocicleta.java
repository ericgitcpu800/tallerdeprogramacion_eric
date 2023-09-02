package org.example;

public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String marca, int año, double precio, int capacidadEstanque, int cilindrada) {
        super(marca, año, precio, capacidadEstanque);
        this.setMarca(marca);
        this.setAño(año);
        this.setPrecio(precio);
        this.setCapacidadEstanque(capacidadEstanque);
        this.cilindrada = cilindrada;
    }

    public String getMarca(String marca) {
        return marca;
    }

    public int getAño(int año) {
        return año;
    }

    public double getPrecio(double precio) {
        return precio;
    }

    public int getCapacidadEstanque(int capacidadEstanque) {
        return capacidadEstanque;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void ImprimirDatos() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Año: " + getAño());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Capacidad Estanque: " + getCapacidadEstanque());
        System.out.println("Nivel Estanque: " + getNivelEstanque());
    }
    @Override
    public void VaciarEstanque(int litros){
    }
}