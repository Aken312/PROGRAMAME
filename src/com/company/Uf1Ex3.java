package com.company;

import java.util.Scanner;

public class Uf1Ex3 {

    public static void main(String[] args) {
        {
                Scanner sc = new Scanner(System.in);
                int guardado=sc.nextInt();
                int guardado2=sc.nextInt();
                int cont=0;
                int cont2=0;
                while(guardado!=0 && guardado2!=0){
                    if(guardado>guardado2 || guardado<guardado2){
                        cont++;
                    }else{
                        cont2++;
                    }
                    guardado=guardado2;
                    guardado2=sc.nextInt();
                }
                if(cont!=0 && cont2==0){
                    System.out.println("Correcto");
                }else if(cont!=0 && cont!=0){
                    System.out.println("Incorrecto");
                }else if(cont==0 && cont2!=0){
                    System.out.println("Incorrecto");
                }

        }
    }
}
