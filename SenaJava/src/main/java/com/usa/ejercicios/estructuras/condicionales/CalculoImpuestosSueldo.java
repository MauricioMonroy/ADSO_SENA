package com.usa.ejercicios.estructuras.condicionales;

import java.util.Scanner;

public class CalculoImpuestosSueldo {
  public static void main(String[] args) {
    Scanner calculo = new Scanner(System.in);
    float sueldo;
    String impuesto;

    System.out.println("Ingrese el sueldo devengado:");
    sueldo = calculo.nextFloat();

    impuesto = (sueldo > 3000) ? "debe pagar impuestos" : "no paga impuestos";
    System.out.println("Usted " + impuesto);

    //    if (sueldo > 3000) {
    //      System.out.println("Usted debe pagar impuestos");
    //    }
  }
}
