package com.company;

import java.util.Scanner;

public class basic2 {

    public static void main(String[] args) {
        System.out.println("NUM 1");
        Scanner sc=new Scanner(System.in);
        int N1=sc.nextInt();
        System.out.println("NUM 2");
        int N2 = sc.nextInt();
        System.out.println("OPERACION");
        sc.nextLine();
        String OP = sc.nextLine();

        if (OP.equals("*")){
            System.out.println(N1 * N2);
        }
        else if (OP.equals("+")){
            System.out.println(N1 + N2);
        }
    }
}
