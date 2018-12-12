package com.company;

import java.util.Scanner;

public class HACKER2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while(casos > 0) {
            int numeros = sc.nextInt();
            int contador = 0;
            while (numeros != 0) {
                contador++;
                numeros = sc.nextInt();
            }
            System.out.println(contador);
            casos--;
        }
    }
}

