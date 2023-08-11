package com.usa.ejercicios.estructuras.condicionales.anidadas;

import java.util.Scanner;

public class TipoDeNumero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese un número entero cualquiera:");
    int numero = Integer.parseInt(scanner.nextLine());

    if (numero == 0) {
      System.out.println("El número es nulo");
    } else if (numero > 0) {
      System.out.println("El número es positivo");
    } else {
      System.out.println("El número es negativo");
    }
  }
}
