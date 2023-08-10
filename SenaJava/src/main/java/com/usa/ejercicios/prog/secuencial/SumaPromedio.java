package com.usa.ejercicios.prog.secuencial;

import java.util.Scanner;

public class SumaPromedio {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int valorA;
    int valorB;
    int valorC;
    int valorD;
    int suma;
    double promedio;

    System.out.println("Ingrese el primer valor:");
    valorA = teclado.nextInt();
    System.out.println("Ingrese el segundo valor:");
    valorB = teclado.nextInt();
    System.out.println("Ingrese el tercer valor:");
    valorC = teclado.nextInt();
    System.out.println("Ingrese el cuarto valor:");
    valorD = teclado.nextInt();

    suma = valorA + valorB + valorC + valorD;
    promedio = (double) suma / 4;

    System.out.println("La suma es igual a: " + suma + ", " + "y el promedio es: " + promedio);
  }
}
