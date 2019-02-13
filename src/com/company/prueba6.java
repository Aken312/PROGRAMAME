package com.company;

import java.util.Scanner;

public class prueba6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String frase=sc.nextLine();
        String y="";

        for (int i = frase.length()-1; i >=0 ; i--) {
            y += frase.charAt(i);

        }
        System.out.println(y);
    }
}
