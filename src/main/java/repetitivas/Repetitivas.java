package repetitivas;

import java.util.Scanner;

public class Repetitivas {

    public static void main(String[] args) {
        Scanner valor1 = new Scanner(System.in);
        Scanner valor2 = new Scanner(System.in);
        
        System.out.println("Ingresa el primer valor a la calculadora.");        
        
        double v1 = valor1.nextDouble();
        
        System.out.println("Ingresa el segundo valor a la calculadora.");                
        double v2 = valor2.nextDouble();
        
        double suma = v1 + v2;
        double resta = v1 - v2;
        double multiplicacion = v1*v2;
        double division = v1/v2;
        double resto = v1%v2;
        
        System.out.println("La suma de " + v1 + " y " + v2 + " es: " + suma);
        System.out.println("La resta de " + v1 + " y " + v2 + " es: " + resta);
        System.out.println("La multiplicación de " + v1 + " y " + v2 + " es: " + multiplicacion);
        System.out.println("La división de " + v1 + " y " + v2 + " es: " + division);
        System.out.println("El resto de la división entre " + v1 + " y " + v2 + " es: " + resto);
    }
}
