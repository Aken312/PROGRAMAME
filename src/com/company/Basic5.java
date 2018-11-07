package com.company;

import java.util.Scanner;

public class Basic5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float notas = sc.nextFloat();
        if (notas < 5) {
            System.out.println("Insuficiente");
        } else if (notas >= 5 && notas < 6) {
            System.out.println("SUFICIENTE");
        } else if (notas >= 6 && notas < 7) {
            System.out.println("OK");
        } else if (notas >= 7 && notas < 8.5) {
            System.out.println("Notable");
        } else if (notas >= 8.5 && notas < 10) {
            System.out.println("Excelente");
        } else if (notas == 10) {
            System.out.println("MATRICULA DE HONOR");
        }
    }
}



// Un programa que vaya leyendo numeros por teclado hasta que se introduzca un -1.
// Los numeros introducidos representan las notas obtenidas por los alumnos
// el programa debe imprimir la cantidad de alumnos que han sacado cada rango

// 4 5 7.5 10 10 9 3
// INSU = 2
// SUF 1
// NOT




