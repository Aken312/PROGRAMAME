package com.company;

import java.util.Scanner;

public class control2ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double caracteres=sc.nextInt();
       double errores=sc.nextInt();
        double tiempo=sc.nextInt();

        double porcentaje=(errores*100)/caracteres;
        double porcentajereal=100-porcentaje;
        double palabras=(caracteres/5);
        double ppm=(palabras/tiempo);
        double ppm2=ppm*(60);
        System.out.println((int)porcentajereal);
        System.out.println((int)ppm2);
    }
}
