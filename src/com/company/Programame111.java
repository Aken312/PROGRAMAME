package com.company;

import java.util.Scanner;

public class Programame111 {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int uvas = 999999;

        while (uvas!=0) {
            uvas = sc.nextInt();

            int niveles = 0;
            int totaluvas = 0;

            while (uvas > totaluvas) {

                niveles++;
                totaluvas = niveles + totaluvas;
            }

            if (niveles !=0) {

                System.out.println(niveles);

            }




        }

    }
}
