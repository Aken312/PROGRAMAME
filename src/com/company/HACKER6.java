package com.company;

import java.util.Scanner;

public class HACKER6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



       int numeros=sc.nextInt();
       int ultimo=numeros;
       int anterior=0;




        while (numeros != 0){
            anterior=numeros;

        numeros = sc.nextInt();

         }
         if (anterior==ultimo){
             System.out.println("SI");
         }
        else  {
            System.out.println("NO");
        }
    }

}

