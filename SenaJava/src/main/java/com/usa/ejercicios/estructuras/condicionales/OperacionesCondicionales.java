package com.usa.ejercicios.estructuras.condicionales;

import java.util.Scanner;

public class OperacionesCondicionales {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Proporcione el primer número:");
    double num1 = Double.parseDouble(scanner.nextLine());

    System.out.println("Proporciona el segundo número");
    double num2 = Double.parseDouble(scanner.nextLine());

    if (num1 > num2) {
      System.out.println("Suma: " + (num1 + num2) + " Diferencia: " + (num1 - num2));
    } else {
      System.out.println("Producto: " + (num1 * num2) + " División: " + (num1 / num2));
    }
  }
}
