package com.usa.ejercicios.prog.secuencial;

import java.util.Scanner;

public class SuperficieCuadrado {
  public static void main(String[] args) {
    Scanner calculoSuperficie = new Scanner(System.in);
    int lado;
    int superficie;
    System.out.println("Ingrese la longitud del lado del cuadrado en cenímetros: ");
    lado = calculoSuperficie.nextInt();
    superficie = lado * lado;
    System.out.println("La superficie del cuadrado es: " + superficie + "cm\u00B2");
  }
}
