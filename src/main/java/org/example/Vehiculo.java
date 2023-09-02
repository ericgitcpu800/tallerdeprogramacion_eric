package org.example;

public class Vehiculo {
    private String marca;
    private int año;
    private double precio;
    private int capacidadEstanque;
    private int nivelEstanque;
    public Vehiculo(String marca, int año, double precio, int capacidadEstanque) {
        this.marca = marca;
        this.año = año;
        this.precio = precio;
        this.capacidadEstanque = capacidadEstanque;
        this.nivelEstanque = 0;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }
    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }
    public int getNivelEstanque() {
        return nivelEstanque;
    }
    public void setNivelEstanque(int nivelEstanque) {
        this.nivelEstanque = nivelEstanque;
    }
    public void ImprimirDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + año);
        System.out.println("Precio: " + precio);
        System.out.println("Capacidad Estanque: " + capacidadEstanque);
        System.out.println("Nivel Estanque: " + nivelEstanque);
    }
    public void CargarEstanque(int litros) {
        if (litros > 0) {
            int espacioDisponible = capacidadEstanque - nivelEstanque;
            if (litros <= espacioDisponible) {
                nivelEstanque += litros;
                System.out.println("Se han cargado " + litros + " litros en el estanque.");
            } else {
                System.out.println("No se pueden cargar tantos litros, excede la capacidad del estanque.");
            }
        } else {
            System.out.println("La cantidad de litros a cargar debe ser mayor que 0.");
        }
    }
    public void VaciarEstanque(int litros) {
        if (litros > 0) {
            if (nivelEstanque - litros >= 0) {
                nivelEstanque -= litros;
                System.out.println("Se han vaciado" + litros + "litros del estanque.");
            } else {
                System.out.println("No se puede vaciar tantos litros, el estanque debe tener mas de 0 litros.");
            }
        } else {
            System.out.println("La cantidad de litros a vaciar debe ser mas de 0.");
        }
    }
    public double calcularImpuesto() {
        return precio * 0.015;
    }
}
