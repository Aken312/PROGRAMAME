package com.company;

import java.util.Scanner;

public class Uf1Ex1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean requisito1=false;
        boolean requisito2=false;
        boolean requisito3=false;

        int[] practicas = new int[5];
        int[] examenesparciales = new int[3];
        int examenfinal=0;

        for (int i = 0; i <practicas.length ; i++) {
            practicas[i]=sc.nextInt();
        }
        for (int i = 0; i <examenesparciales.length ; i++) {
            examenesparciales[i]=sc.nextInt();
        }
        examenfinal=sc.nextInt();
        int faltas=sc.nextInt();

        if (practicas[2]>=5 && practicas[3]>=5 && practicas[4]>=5){
             requisito1=true;
        }
        if (faltas<=17){
             requisito2=true;
        }
        if (examenesparciales[0]>=5 && examenesparciales[1]>=5 && examenesparciales[2]>=5){
             requisito3=true;
        }
        if (requisito1==true && requisito2==true && requisito3==true){
            System.out.println("true");
        }
        else if(examenfinal>=5 && faltas<=17){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
