package com.company;

import java.util.Scanner;

public class tresenraya {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String l1 = sc.nextLine();
        String l2 = sc.nextLine();
        String l3 = sc.nextLine();

        if(l3.charAt(0) == l3.charAt(1) && l3.charAt(0) == l3.charAt(2)){
            System.out.println(l3.charAt(0));
        }

    }
}
