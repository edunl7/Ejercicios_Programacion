package Figuras;

import javax.swing.*;

public class Ejercicio_2 {
    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        String input2 = JOptionPane.showInputDialog("Ingrese el segundo número:");


        double numero1 = Double.parseDouble(input1);
        double numero2 = Double.parseDouble(input2);


        String[] opciones = {"Suma", "Resta", "Multiplicación", "División"};
        String operacion = (String) JOptionPane.showInputDialog(null, "Seleccione la operación:",
                "Operación", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        double resultado = 0;
        String mensaje = "";


        switch (operacion) {
            case "Suma":
                resultado = numero1 + numero2;
                mensaje = "El resultado de la suma es: " + resultado;
                break;
            case "Resta":
                resultado = numero1 - numero2;
                mensaje = "El resultado de la resta es: " + resultado;
                break;
            case "Multiplicación":
                resultado = numero1 * numero2;
                mensaje = "El resultado de la multiplicación es: " + resultado;
                break;
            case "División":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    mensaje = "El resultado de la división es: " + resultado;
                } else {
                    mensaje = "Error: No se puede dividir entre cero.";
                }
                break;
            default:
                mensaje = "Operación no válida.";
                break;
        }


        JOptionPane.showMessageDialog(null, mensaje);
    }
}

