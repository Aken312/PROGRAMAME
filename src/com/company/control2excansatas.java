package com.company;

import java.util.Scanner;

public class control2excansatas {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int puntuacion=sc.nextInt();
        int dos =0;
        int tres=0;
        int uno=0;
        int anterior=0;



        while (puntuacion!=0){

            if (puntuacion-anterior==2){
                dos++;
            }
            else if(puntuacion-anterior==3){
                tres++;
            }
            else if (puntuacion-anterior==1){
                uno++;
            }
            anterior=puntuacion;
            puntuacion=sc.nextInt();
        }
        System.out.println(uno);
        System.out.println(dos);
        System.out.println(tres);
    }
}
