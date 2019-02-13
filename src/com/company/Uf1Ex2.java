package com.company;

import java.util.Scanner;

public class Uf1Ex2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int viernesA=0;
        int sabadoB=0;
        int domingoC=0;

        int viernesB=0;
        int sabadoC=0;
        int domingoA=0;

        int viernesC=0;
        int sabadoA=0;
        int domingoB=0;

        int dias=sc.nextInt();

        for (int i = 0; i <dias; i++) {
            sc.nextLine();
            String DIA = sc.nextLine();

            if (DIA.equals("viernes")) {
                int edades = 0;
                while (edades != -1) {
                    edades = sc.nextInt();
                    if (edades < 18 && edades>0) {
                        viernesA++;
                    }
                    if (edades >= 18 && edades <= 65) {
                        viernesB++;
                    }
                    if (edades > 65) {
                        viernesC++;
                    }

                }
            }
            if (DIA.equals("sabado")) {
                int edades = 0;
                while (edades != -1) {
                    edades = sc.nextInt();
                    if (edades < 18 && edades>0) {
                        sabadoA++;
                    }
                    if (edades >= 18 && edades <= 65) {
                        sabadoB++;
                    }
                    if (edades > 65) {
                        sabadoC++;
                    }

                }
            }
            if (DIA.equals("domingo")) {
                int edades = 0;
                while (edades != -1) {
                    edades = sc.nextInt();
                    if (edades < 18 && edades>0) {
                        domingoA++;
                    }
                    if (edades >= 18 && edades <= 65) {
                        domingoB++;
                    }
                    if (edades > 65) {
                        domingoC++;
                    }

                }
            }
        }

            System.out.println("viernes");
            System.out.println("0-17 : "+viernesA);
            System.out.println("18-65 : "+viernesB);
            System.out.println("+65 :" +viernesC);
            System.out.println();
            System.out.println("sabado");
            System.out.println("0-17 : "+sabadoA);
            System.out.println("18-65 : "+sabadoB);
            System.out.println("+65 :" +sabadoC);
            System.out.println();
            System.out.println("domingo");
            System.out.println("0-17 : "+domingoA);
            System.out.println("18-65 : "+domingoB);
            System.out.println("+65 :" +domingoC);



    }
}
