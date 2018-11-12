package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class profe2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] personas = new int[100];
        personas[0] = 99;

        int grupos=0;
        for (int i=1; personas[i-1] != 0 ; i++) {
            personas[i] = sc.nextInt();
            if (personas[i]!=personas[i-1]){
                grupos++;
            }
        }

        System.out.println(grupos-1);
    }
}

