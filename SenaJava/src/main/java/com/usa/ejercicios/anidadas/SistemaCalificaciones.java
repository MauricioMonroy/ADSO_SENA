package com.usa.ejercicios.estructuras.condicionales.anidadas;

import java.util.Scanner;

public class SistemaCalificaciones {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese la primera nota:");
    float nota1 = Float.parseFloat(scanner.nextLine());

    System.out.println("Ingrese la segunda nota");
    float nota2 = Float.parseFloat(scanner.nextLine());

    System.out.println("Ingrese la tercera nota");
    double nota3 = Float.parseFloat(scanner.nextLine());

    float promedio;
    promedio = (float) ((nota1 + nota2 + nota3) / 3);

    if (promedio >= 7) {
      System.out.println("Nota final: " + promedio + " | El alumno ha sido promocionado");
    } else if (promedio >= 4) {
      System.out.println("Nota final: " + promedio + " | El alumno obtuvo un rendimiento regular");
    } else {
      System.out.println("El alumno ha sido reprobado");
    }
  }
}
