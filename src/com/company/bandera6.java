package com.company;

import java.util.Scanner;

public class bandera6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                if(i < size*1/3){
                    System.out.print("*");
                }else if(i >= size*2/3){
                    System.out.print("*");
                }else {
                    System.out.print("~");
                }
            }

            System.out.println();
        }
        System.out.println();
    }

















    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int cont=0;
        for (int i = 0; i <size ; i++) {
            //1 tercio y ultimo tercio

            if (cont<(size/3) || cont>= ((size/3)*2)){
                for (int j = 0; j <size ; j++) {
                    System.out.print("*");
                }
            }
            else {
                for (int j = 0; j <size ; j++) {
                    System.out.print("-");
                }
            }
            System.out.println();
            cont++;
        }
        System.out.println();
    }
}


