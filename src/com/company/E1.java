package com.company;

import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero;
        int contador=0;
        numero =sc.nextInt();
        for (int i = 1; i <=numero ; i++) {
            if (numero%i==0){
                contador++;
            }

        }
        System.out.println(contador);
    }
}

