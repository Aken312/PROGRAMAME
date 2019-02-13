package com.company;

import java.util.Scanner;

public class Uf1Ex6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String frase=sc.nextLine();

        String copia="";

        for (int i = frase.length()-1; i>=0 ; i--) {
            if (frase.charAt(i)!= ' ') {
                int ayuda=i;
                for (int j = i; j <frase.length()-1 ; j++) {
                    copia+=frase.charAt(ayuda);



                }

            }

        }
        System.out.println(copia);
    }
}
