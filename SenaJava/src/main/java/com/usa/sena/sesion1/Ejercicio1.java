package com.usa.sena.sesion1;

import java.util.Scanner;

public class Ejercicio1 {

  public static void main(String[] args) {

    //La clase 'Scanner' lee los datos de ingreso
    Scanner consola = new Scanner(System.in);
    //Se definen las variables, incluye las que permiten el ingreso de datos y las operaciones
    long num1;
    long num2;
    long suma;
    long resta;
    long producto;
    double division;

    System.out.println("Ingrese el primer valor: ");
    num1 = consola.nextLong();

    System.out.println("Ingrese el segundo valor: ");
    num2 = consola.nextLong();

    // Definición de operaciones
    suma = num1 + num2;
    resta = num1 - num2;
    producto = num1 * num2;
    division = (double)num1 / num2;

    // Definición de salidas
    System.out.println("La suma de los dos valores es: " + suma);

    System.out.println("La resta de los dos valores es: " + resta);

    System.out.println("La multiplicación de los dos valores es: " + producto);

    System.out.println("La división de los dos valores es: " + division);
  }
}
