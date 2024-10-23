package Figuras;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;

class Empleado {
    private String cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private double salario;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;


    public Empleado(String cedula, String nombre, String apellido, String genero, double salario, LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }


    public void modificarSalario(double nuevoSalario) {
        this.salario = nuevoSalario;
    }


    public int calcularEdad() {
        LocalDate ahora = LocalDate.now();
        return Period.between(fechaNacimiento, ahora).getYears();
    }


    public double calcularPrestaciones() {
        int antiguedad = Period.between(fechaIngreso, LocalDate.now()).getYears();
        return (antiguedad * salario) / 12;
    }


    public String obtenerInformacion() {
        return "Cédula: " + cedula +
                "\nNombre: " + nombre +
                "\nApellido: " + apellido +
                "\nGénero: " + genero +
                "\nSalario: " + salario +
                "\nFecha de Nacimiento: " + fechaNacimiento +
                "\nFecha de Ingreso: " + fechaIngreso +
                "\nEdad: " + calcularEdad() +
                "\nPrestaciones: " + calcularPrestaciones();
    }
}

public class Ejercicio_5 {
    public static void main(String[] args) {

        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del empleado:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del empleado:");
        String genero = JOptionPane.showInputDialog("Ingrese el género del empleado:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));


        String fechaNacimientoStr = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (YYYY-MM-DD):");
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);

        String fechaIngresoStr = JOptionPane.showInputDialog("Ingrese la fecha de ingreso (YYYY-MM-DD):");
        LocalDate fechaIngreso = LocalDate.parse(fechaIngresoStr);


        Empleado empleado = new Empleado(cedula, nombre, apellido, genero, salario, fechaNacimiento, fechaIngreso);


        double nuevoSalario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo salario del empleado:"));
        empleado.modificarSalario(nuevoSalario);


        JOptionPane.showMessageDialog(null, empleado.obtenerInformacion());
    }
}
