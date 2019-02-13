package com.company;

import java.util.Scanner;

public class leerMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int filas = sc.nextInt();
        int colus = sc.nextInt();

        int[][] matriz = new int[filas][colus];

        for (int i=0; i<filas; i++){
            for (int j=0; j<colus; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
    }
}
