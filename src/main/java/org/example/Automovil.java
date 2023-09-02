package org.example;

public class Automovil extends Vehiculo{
    public int cantidadPuertas;

    public Automovil(String marca, int año, double precio, int capacidadEstanque, int cantidadPuertas) {
        super(marca, año, precio, capacidadEstanque);

        if (cantidadPuertas % 2 != 0) {
            throw new IllegalArgumentException("La cantidad de puertas del automovil debe ser un par.");
        }

        this.cantidadPuertas = cantidadPuertas;
    }
    @Override
    public void CargarEstanque(int litros) {
    }
    @Override
    public void VaciarEstanque(int litros) {
    }
    @Override
    public double calcularImpuesto() {
        return 0;
    }
    public void ModificarAño(int nuevoAño) {
    }
}