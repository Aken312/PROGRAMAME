package com.company;

import java.util.Scanner;

public class Basic4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte num1");
        int num1 = sc.nextInt();

        System.out.println("Inserte num2");
        int num2 = sc.nextInt();

        if (num1 < num2) {
            System.out.println("Error");
        }else{
            if (num1 % num2 == 0) {
                System.out.println("Són múltiples");
            }else{
                System.out.println("No son múltiples");
            }
        }
    }
}