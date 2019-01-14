package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class delreves {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros = 0;
        int valores;
        numeros = sc.nextInt();
        int[] posiciones = new int[numeros];
        for (int i = 1; i <numeros+1 ; i++) {


            posiciones[numeros-i] = sc.nextInt();

        }
        for (int i = 0; i <numeros ; i++) {
            System.out.print(posiciones[i]+" ");
        }
        }


    }

