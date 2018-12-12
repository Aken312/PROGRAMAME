package com.company;

import java.util.Scanner;

public class HACKERS3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros=sc.nextInt();
        while (numeros!=0){
            if (numeros%7==0){
                System.out.println("SI");
            }
            if (numeros%7!=0){
                System.out.println("NO");
            }
            numeros=sc.nextInt();
        }
    }

}
