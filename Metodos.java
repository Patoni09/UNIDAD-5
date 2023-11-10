/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.metodos;

/**
 *
 * @author ce182
 */
public class Metodos {
  public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;

        System.out.println("Suma: " + suma(numero1, numero2));
        System.out.println("Resta: " + resta(numero1, numero2));
        System.out.println("Multiplicación: " + multiplicacion(numero1, numero2));
        System.out.println("División: " + division(numero1, numero2));
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: división por cero.");
            return 0;
        }
    }

   
}
