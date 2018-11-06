package com.company;

import java.util.Arrays;

public class programame324 {
    public static void main(String[] args){
        int[] array = {3, 5, 4, 1, 2, 0};
        System.out.println(Arrays.toString(array));

        int numCambios = 1;

        for (int i = 0; i < array.length ; i++) {
            while( array[i] !=i){
                int numguardado = array[i];
                array[i] = array[array[i]];
                array[numguardado] = numguardado;
                numCambios++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Número total de cambios: " + numCambios);
    }
}