package com.company;

import java.util.Scanner;

public class basic1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year%4 ==0) {
            if (year%100 ==0) {
                System.out.println("NO ES BIISIETO");
            }
            else  {
                System.out.println("ES BISIISTO" );

                }


        }
        else {
            System.out.println("NO ES BISIESITO" );
        }



    }
}
