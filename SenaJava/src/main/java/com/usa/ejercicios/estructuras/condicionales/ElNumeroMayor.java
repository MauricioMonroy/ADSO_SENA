package com.usa.ejercicios.estructuras.condicionales;

import java.util.Scanner;

public class ElNumeroMayor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Proporcione el primer número:");
    int num1 = Integer.parseInt(scanner.nextLine());

    System.out.println("Proporcione el segundo número");
    int num2 = Integer.parseInt(scanner.nextLine());

    if (num1 > num2) {
      System.out.println("El número mayor es: " + num1);
    } else {
      System.out.println("El número mayor es: " + num2);
    }
  }
}
