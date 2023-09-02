package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Automovil auto = new Automovil("Hyundai", 2012, 22000.0, 50, 4);
            auto.ImprimirDatos();
            auto.CargarEstanque(50);
            auto.VaciarEstanque(30);
            double impuestoAuto = auto.calcularImpuesto();
            System.out.println("Pago de impuesto por el auto: " + impuestoAuto);
            auto.ModificarAño(2018);
            auto.ImprimirDatos();

            Motocicleta moto = new Motocicleta("Honda", 2024, 16000.0, 20, 750);
            moto.ImprimirDatos();
            moto.CargarEstanque(20);
            moto.VaciarEstanque(15);
            int cilindrada = moto.getCilindrada();
            System.out.println("La medida del cilindro de la moto es: " + cilindrada );
            auto.ModificarAño(2016);
            auto.ImprimirDatos();
        } catch (IllegalArgumentException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}