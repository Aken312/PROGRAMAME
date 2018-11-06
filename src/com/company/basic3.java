package com.company;

import java.util.Scanner;

public class basic3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte número: ");
        int N1 = sc.nextInt();
        boolean var1 = false;
        for (int i = 2; i < N1-1; i++) {
            if(N1%i == 0){
                System.out.println("No es un número Primo");
                var1 = true;
                break;
            }

        }
        if(var1 == false){
            System.out.println("Es un número Primo");
        }else if (var1 == false){
            System.out.println("Error");
        }
    }
}