package com.company;

import java.util.Scanner;

public class basic6 {

    public static void main(String[] args) {
//calcular el dinero que tienen que pagar a los emplados
        //se paga semanalmente (5 euros cada hora) me lo he inventado el dinero yo
        Scanner sc =new Scanner(System.in);
        System.out.println("Horas trabajadas");
        float Horas= sc.nextFloat();
        float si= sc.nextFloat();
        double dinero= 0;
        float Horasextra= Horas-35;
        System.out.println("Precio por hora");
        float Preciohora=sc.nextFloat();
        if(Horas>0){
            if (Horas < 35){
                dinero = Horas*Preciohora;
                System.out.println(dinero);
            }
            else if(Horas>35){
                si = Horas-Horasextra;
                dinero = (si*Preciohora)+(Horasextra*(Preciohora*1.5));
                System.out.println("tu dinero es:" +dinero);


            }

        }



    }
}
