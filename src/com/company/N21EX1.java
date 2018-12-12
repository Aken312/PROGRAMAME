package com.company;

import java.util.Scanner;

public class N21EX1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros;
        int primernumero;
        int ultimonumero = 0;
        numeros = sc.nextInt();
        primernumero = numeros;


        while (numeros != -1) {
            numeros = sc.nextInt();
            ultimonumero = numeros;
            numeros = sc.nextInt();
            if (numeros == 0) {
                if (primernumero == ultimonumero) {
                    System.out.println("si");

                } else if (primernumero != ultimonumero) {
                    System.out.println("no");
                }


            }

        }
    }
}

