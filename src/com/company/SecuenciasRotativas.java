package com.company;

import java.util.Scanner;

public class SecuenciasRotativas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenght=sc.nextInt();
        int[] array = new int[lenght];

        for (int i = 0; i <lenght ; i++) {
            array[i]=sc.nextInt();

        }
        int repeticiones=sc.nextInt();
        for (int i = 0; i <repeticiones ; i++) {
            System.out.println(array[i%lenght]);
        }
    }
}
