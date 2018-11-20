package com.company;

import java.util.Scanner;

public class E3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numero1=sc.nextInt();
        int numero2=sc.nextInt();
        int numero3=sc.nextInt();
        if (numero1+numero2==numero3){
            System.out.println("+");
        }
        else if(numero1*numero2==numero3){
            System.out.println("*");
        }
        else if (numero1/numero2==numero3){
            System.out.println("/");
        }
        else if (numero1%numero2==numero3){
            System.out.println("%");
        }
        else {
            System.out.println("IMPOSIBLE");
        }

    }
}
