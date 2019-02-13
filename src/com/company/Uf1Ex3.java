package com.company;

import java.util.Scanner;

public class Uf1Ex3 {

    public static void main(String[] args) {
        {
                Scanner sc = new Scanner(System.in);
                int anterior=sc.nextInt();
                int ultimo=sc.nextInt();
                int cont=0;
                int cont2=0;
                while(anterior!=0 && ultimo!=0){
                    if(anterior>ultimo || anterior<ultimo){
                        cont++;
                    }else{
                        cont2++;
                    }
                    anterior=ultimo;
                    ultimo=sc.nextInt();
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
