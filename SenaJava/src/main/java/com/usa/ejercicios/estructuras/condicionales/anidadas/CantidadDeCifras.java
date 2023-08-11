package com.usa.ejercicios.estructuras.condicionales.anidadas;

import java.util.Scanner;

public class CantidadDeCifras {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese un número entero positivo de hasta tres cifras:");
    int numero = Integer.parseInt(scanner.nextLine());

    if (numero < 9) {
      System.out.println("El número tiene una cifra");
    } else if (numero > 10 && numero < 99) {
      System.out.println("El número tiene dos cifras");
    } else if (numero > 100 && numero < 999) {
      System.out.println("El número tiene tres cifras");
    } else {
      System.out.println("ERROR: El número de cifras es mayor al indicado");
    }
  }
}
