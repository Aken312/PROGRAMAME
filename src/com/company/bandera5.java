package com.company;

import java.util.Scanner;

public class bandera5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();

        for (int filas = size; filas > 0; filas--) {
            for (int colus = size; colus > 0; colus--) {
                if (filas%2==0) {
                    System.out.print("*");
                } else {
                    System.out.print("~");
                }
            }
            System.out.println();
        }
        }
    }

