package com.company;

import java.util.Scanner;

public class HACKER7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces=sc.nextInt();



        for (int contador = 0; contador <veces; contador++) {
            int numeros=sc.nextInt();
            int ultimo=numeros;
            int anterior=0;

            while (numeros != 0) {
                anterior = numeros;

                numeros = sc.nextInt();

            }

            if (anterior == ultimo) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

}
