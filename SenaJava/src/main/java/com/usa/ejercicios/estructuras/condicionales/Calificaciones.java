package com.usa.ejercicios.estructuras.condicionales;

import java.util.Scanner;

public class Calificaciones {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Proporcione la primera nota:");
    float nota1 = Float.parseFloat(scanner.nextLine());

    System.out.println("Proporciona la segunda nota");
    float nota2 = Float.parseFloat(scanner.nextLine());

    System.out.println("Proporciona la tercera nota");
    double nota3 = Float.parseFloat(scanner.nextLine());

    float notaFinal;
    notaFinal = (float) ((nota1 + nota2 + nota3) / 3);

    if (notaFinal >= 7) {
      System.out.println("Nota final: " + notaFinal + " | Promocionado");
    } else {
      System.out.println("Nota final: " + notaFinal + " | Debe repetir el curso");
    }
  }
}
