package com.company;

import java.util.Scanner;

public class HACKER1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros=sc.nextInt();
        int contador=0;
        while (numeros!=0){
            contador++;
            numeros=sc.nextInt();
        }
        System.out.println(contador);
    }
}
