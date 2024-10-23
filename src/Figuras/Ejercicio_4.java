package Figuras;
import javax.swing.JOptionPane;

public class Ejercicio_4 {
    public static void main(String[] args) {

        String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        String precioStr = JOptionPane.showInputDialog("Ingrese el precio del producto:");
        double precio = Double.parseDouble(precioStr);

        String tieneIVAStr = JOptionPane.showInputDialog("¿El producto tiene IVA? (Si/No):");
        boolean tieneIVA = tieneIVAStr.equalsIgnoreCase("Si");

        double iva = 0;
        double precioFinal = precio;


        if (tieneIVA) {
            if (precio <= 500) {
                iva = precio * 0.12;
            } else if (precio > 500 && precio <= 1500) {
                iva = precio * 0.14;
            } else {
                iva = precio * 0.15;
            }
            precioFinal += iva;
        }

        String mensaje = "Información del Producto:\n" +
                "Nombre: " + nombreProducto + "\n" +
                "Precio Original: " + precio + "\n" +
                (tieneIVA ? "IVA: " + iva + "\n" : "No tiene IVA.\n") +
                "Precio Final: " + precioFinal;


        JOptionPane.showMessageDialog(null, mensaje);
    }
}
