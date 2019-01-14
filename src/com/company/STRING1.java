package com.company;

import java.util.Scanner;

public class STRING1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;
        String palabra=sc.nextLine();
        String vocales="aAeEiIoOuU";
        for (int k = 0; k <palabra.length() ; k++) {
            if ( palabra.charAt(k)==vocales.charAt(0) || palabra.charAt(k)==vocales.charAt(1)){
                a++;
            }
            if ( palabra.charAt(k)==vocales.charAt(2) || palabra.charAt(k)==vocales.charAt(3)){
                e++;
            }
            if ( palabra.charAt(k)==vocales.charAt(4) || palabra.charAt(k)==vocales.charAt(5)){
                i++;
            }
            if ( palabra.charAt(k)==vocales.charAt(6) || palabra.charAt(k)==vocales.charAt(7)){
                o++;
            }
            if ( palabra.charAt(k)==vocales.charAt(8) || palabra.charAt(k)==vocales.charAt(9)){
                u++;
            }
        }

        System.out.println(a);
        System.out.println(e);
        System.out.println(i);
        System.out.println(o);
        System.out.println(u);

    }
}
