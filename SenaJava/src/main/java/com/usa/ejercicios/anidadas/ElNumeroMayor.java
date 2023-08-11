package com.usa.ejercicios.estructuras.condicionales.anidadas;

import java.util.Scanner;

public class ElNumeroMayor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el primer número:");
    int num1 = Integer.parseInt(scanner.nextLine());

    System.out.println("Ingrese el segundo número");
    int num2 = Integer.parseInt(scanner.nextLine());

    System.out.println("Ingrese el tercer número");
    int num3 = Integer.parseInt(scanner.nextLine());

    if (num1 > num2 && num1 > num3) {
      System.out.println("El número mayor es: " + num1);
    } else if (num2 > num3 && num2 > num1) {
      System.out.println("El número mayor es: " + num2);
    } else {
      System.out.println("El número mayor es: " + num3);
    }
  }
}
