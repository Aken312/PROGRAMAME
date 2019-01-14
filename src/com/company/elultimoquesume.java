package com.company;

import java.util.Scanner;

public class elultimoquesume {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();

        int[] array=new int [num];
        for (int i = 0; i <num ; i++) {
            array[i]=sc.nextInt();
        }


        int[] array2 = new int[num];
        for (int i = 0; i <num ; i++) {
            array2[i] = array[i] + array[num-1];
        }

        for (int i = 0; i <num ; i++) {
            System.out.print(array2[i]+" ");
        }
    }
}
