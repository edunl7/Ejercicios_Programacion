package Figuras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        calcularTriangulo(reader);
        calcularCuadrado (reader);
        calcularRectangulo (reader);
    }

        public static void calcularTriangulo(BufferedReader reader) throws IOException {
            System.out.println("Ingrese la base del triángulo:");
            double base = Double.parseDouble(reader.readLine());

            System.out.println("Ingrese la altura del triángulo:");
            double altura = Double.parseDouble(reader.readLine());

            System.out.println("Ingrese el primer lado del triángulo:");
            double lado1 = Double.parseDouble(reader.readLine());

            System.out.println("Ingrese el segundo lado del triángulo:");
            double lado2 = Double.parseDouble(reader.readLine());

            System.out.println("Ingrese el tercer lado del triángulo:");
            double lado3 = Double.parseDouble(reader.readLine());

            double area = (base * altura) / 2;
            double perimetro = lado1 + lado2 + lado3;
            System.out.println("El área del triángulo es: " + area);
            System.out.println("El perímetro del triángulo es: " + perimetro);


        }
    public static void calcularCuadrado(BufferedReader  reader)throws IOException {
        System.out.println("Ingrese la base del cuadrado:");
        double lado = Double.parseDouble((reader.readLine()));
        double area = lado * lado;
        double perimetro = 4 * lado;

        System.out.println("El area del cuadrado es:" + area);
        System.out.println("El perimetro del cuadrado es:" + perimetro);
    }
        public static void calcularRectangulo(BufferedReader reader) throws IOException {
            System.out.println("Ingrese la base del rectángulo:");
            double base = Double.parseDouble(reader.readLine());

            System.out.println("Ingrese la altura del rectángulo:");
            double altura = Double.parseDouble(reader.readLine());

            double arearec = base * altura;
            double perimetrorec = 2 * (base + altura);

            System.out.println("El área del rectángulo es: " + arearec);
            System.out.println("El perímetro del rectángulo es: " + perimetrorec);

        }


    }



