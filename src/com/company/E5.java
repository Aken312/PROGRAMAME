package com.company;

import java.util.Scanner;

public class E5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numeros;
        int guardado1 = 0;
        int guardado2=0;
        int contador=0;
        numeros=sc.nextInt();
        while(numeros>0) {
            if (guardado2 == 0){
                guardado2 = numeros;
                numeros = sc.nextInt();
                guardado1 = numeros;
                numeros = sc.nextInt();
            }

            if (guardado2 + guardado1 == numeros) {
                contador++;
            }

            guardado2 = guardado1;
            guardado1 = numeros;
            numeros=sc.nextInt();

        }
        System.out.println(contador);
    }

}
