package com.company;

import java.util.Scanner;

public class profe1 {

    public static void main(String[] args) {

// Un programa que vaya leyendo numeros por teclado hasta que se introduzca un -1.
// Los numeros introducidos representan las notas obtenidas por los alumnos
// el programa debe imprimir la cantidad de alumnos que han sacado cada rango

// 4 5 7.5 10 10 9 3
// INSU = 2
// SUF 1
// NOT
        Scanner sc = new Scanner(System.in);
        float notas = 0;
        float Insu = 0;
        float Sufi = 0;
        float Bien = 0;
        float Not = 0;
        float Exce = 0;

        while (notas!=-1) {
            notas=sc.nextInt();
            if (notas < 5 && notas>0) {
                Insu++;
            } else if (notas>=5 && notas<6) {
                Sufi++;
            } else if(notas>=6 && notas<7){
                Bien++;
            }else if(notas>=7 && notas<9){
                Not++;}
             else if(notas>=9 && notas<=10){
                Exce++;
            }
            }
        System.out.println("Notas Insu:"+Insu);
        System.out.println("Notas bien:"+Bien);
        System.out.println("Notas Notables:"+Not);
        System.out.println("Notas EXce:"+Exce);
    }
}
