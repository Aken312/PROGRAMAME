package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EJERCICIOPRUEBA {

    public static void main(String[] args) {
	// 13 19 55
        Scanner sc=new Scanner(System.in);
        int semilla =sc.nextInt();
        int contador=1;
        int primero=semilla;

        do {
            int newnum=((semilla%10)*6)+semilla/10;
            System.out.println(newnum);
            contador++;
            semilla=newnum;



        } while(semilla != primero);

        System.out.println("ha tardado "+contador+" veces en repetirse");


    }
}
