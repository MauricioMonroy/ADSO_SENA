package com.usa.ejercicios.estructuras.condicionales.anidadas;

import java.util.Scanner;

public class ResultadoTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el número de preguntas del test:");
    int cantidadPreguntas = Integer.parseInt(scanner.nextLine());

    System.out.println("Ingrese el número de preguntas correctas:");
    int respuestasCorrectas = Integer.parseInt(scanner.nextLine());

    var porcentajeAcierto = (double) respuestasCorrectas / cantidadPreguntas * 100;

    if (porcentajeAcierto >= 90) {
      System.out.println("Porcentaje= " + porcentajeAcierto + "%" + " | Nivel máximo");
    } else if (porcentajeAcierto >= 75 && porcentajeAcierto <= 90) {
      System.out.println("Porcentaje= " + porcentajeAcierto + "%" + " | Nivel medio");
    } else if (porcentajeAcierto >= 50 && porcentajeAcierto <= 75) {
      System.out.println("Porcentaje= " + porcentajeAcierto + "%" + " | Nivel regular");
    } else {
      System.out.println("Fuera de nivel");
    }
  }
}
