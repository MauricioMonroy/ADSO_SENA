package com.usa.ejercicios.prog.secuencial;

import java.util.Scanner;

public class FacturaCompra {
  public static void main(String[] args) {
    Scanner compra = new Scanner(System.in);

    float precioArticulo;
    int cantidad;
    float costoTotal;

    System.out.println("Ingrese el valor del artículo: ");
    precioArticulo = compra.nextFloat();

    System.out.println("Especifique la cantidad de artículos: ");
    cantidad = compra.nextInt();

    costoTotal = precioArticulo * cantidad;

    System.out.println("El valor a pagar es: " + costoTotal);
  }
}
