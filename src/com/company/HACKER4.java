package com.company;

import java.util.Scanner;

public class HACKER4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ultimo=sc.nextInt();
        int numeros=1;
        int anterior = 0;
        boolean esFibonacci=true;

        while (numeros!=0){
            numeros=sc.nextInt();
            anterior=numeros;
            numeros=sc.nextInt();

            if (ultimo+anterior==numeros){
                esFibonacci=false;
            }
        }
        if (esFibonacci==true){
            System.out.println("SI");
        }
        if (esFibonacci==false){
            System.out.println("NO");
        }
    }
}
