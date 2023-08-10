package com.usa.ejercicios.prog.secuencial;

import java.util.Scanner;

public class PerimetroCuadrado {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int medidaLado;
    int perimetro;

    System.out.println("Ingrese la longitud del lado del cuadrado: ");
    medidaLado = teclado.nextInt();

    perimetro = medidaLado * 4;

    System.out.println("El perimetro del cuadrado es: " + perimetro);
  }
}
