package com.usa.ejercicios.estructuras.condicionales;

import java.util.Scanner;

public class CantidadDigitos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Proporcione un número del 1 al 99:");
    int numero = Integer.parseInt(scanner.nextLine());

    if (numero >= 10 && numero <= 99) {
      System.out.println("Tiene dos dígitos");
    } else {
      System.out.println("Tiene un solo dígito");
    }
  }
}
