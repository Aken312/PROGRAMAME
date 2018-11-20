package com.company;

import java.util.Scanner;

public class E4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numeros;
        int guardado;
        int contador=0;
        numeros=sc.nextInt();
        while(numeros>0){
            guardado=numeros;
            numeros=sc.nextInt();
            if (numeros>guardado){
                contador++;
            }

        }
        System.out.println(contador);
    }
}
