package com.company;

import java.util.Scanner;

public class profe3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = 1;
        int anterior=0;
        int contador=0;
        int contadormax=0;

        while(codigo!=0){
            codigo =sc.nextInt();



            if (codigo!=anterior){

                anterior=codigo;

                if (contador>contadormax){
                    contadormax = contador;
                }
                contador=0;
            } else {
                contador++;
            }


        }
        System.out.println(contadormax+1);
    }
}

