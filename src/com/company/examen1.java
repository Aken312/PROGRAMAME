package com.company;

import java.util.Scanner;

public class examen1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numeros;
        int guardado;
        System.out.println("INSERTE NUMEROS");
        numeros=sc.nextInt();
        while(numeros>0){
            guardado=numeros;
            numeros=sc.nextInt();
           if (numeros>guardado){
               System.out.println("+");
           }
            else if (numeros<guardado){
               System.out.println("-");
           }
            else if (numeros==guardado){
               System.out.println("=");
           }
        }


    }
}
