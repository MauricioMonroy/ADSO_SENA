package com.usa.ejercicios.prog.secuencial;

import java.util.Scanner;

public class SumaProductoDiferenciados {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int primerValor;
    int segundoValor;
    int tercerValor;
    int cuartoValor;
    int suma;
    int producto;

    System.out.println("Ingrese el primer valor: ");
    primerValor = teclado.nextInt();

    System.out.println("Ingrese el segundo valor: ");
    segundoValor = teclado.nextInt();

    System.out.println("Ingrese el tercer valor: ");
    tercerValor = teclado.nextInt();

    System.out.println("Ingrese el cuarto valor: ");
    cuartoValor = teclado.nextInt();

    suma = primerValor + segundoValor;
    producto = tercerValor * cuartoValor;

    System.out.println("La suma del primer valor y el segundo valor es igual a: " + suma);
    System.out.println("El producto del tercer valor y el cuarto valor es igual a: " + producto);
  }
}
