package com.usa.ejercicios.prog.secuencial;

import java.util.Scanner;

public class SueldoOperario {
  public static void main(String[] args) {
    Scanner calculoValorHoras = new Scanner(System.in);
    int horasTrabajadas;
    float costoHora;
    float sueldo;
    System.out.println("Ingrese la cantidad de horas trabajadas por el operario: ");
    horasTrabajadas = calculoValorHoras.nextInt();
    System.out.println("Ingrese el valor de la hora: ");
    costoHora = calculoValorHoras.nextFloat();
    sueldo = horasTrabajadas * costoHora;
    System.out.println("El empleado debe cobrar: " + sueldo);
  }
}
