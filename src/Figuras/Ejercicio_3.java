package Figuras;

import javax.swing.JOptionPane;

public class Ejercicio_3 {

    public static void main(String[] args) {
        // Entrada de datos
        String numeroMotor = JOptionPane.showInputDialog("Ingrese el número de motor del vehículo:");
        String numeroVentanasStr = JOptionPane.showInputDialog("Ingrese el número de ventanas del vehículo:");
        int numeroVentanas = Integer.parseInt(numeroVentanasStr);

        String numeroPuertasStr = JOptionPane.showInputDialog("Ingrese el número de puertas del vehículo:");
        int numeroPuertas = Integer.parseInt(numeroPuertasStr);

        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");

        String kilometrajeInicialStr = JOptionPane.showInputDialog("Ingrese el kilometraje inicial:");
        double kilometrajeInicial = Double.parseDouble(kilometrajeInicialStr);

        String kilometrajeFinalStr = JOptionPane.showInputDialog("Ingrese el kilometraje final:");
        double kilometrajeFinal = Double.parseDouble(kilometrajeFinalStr);


        double kilometrosRecorridos = kilometrajeFinal - kilometrajeInicial;


        String mensaje = "Información del Vehículo:\n" +
                "Número de Motor: " + numeroMotor + "\n" +
                "Número de Ventanas: " + numeroVentanas + "\n" +
                "Número de Puertas: " + numeroPuertas + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Kilometraje Inicial: " + kilometrajeInicial + "\n" +
                "Kilometraje Final: " + kilometrajeFinal + "\n" +
                "Kilómetros Recorridos: " + kilometrosRecorridos;


        JOptionPane.showMessageDialog(null, mensaje);
    }
}
