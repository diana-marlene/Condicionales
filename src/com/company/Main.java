package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* System.out.println("Ingresa primer angulo");
       int primer = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa segundo angulo");
        int segundo = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa tercer angulo");
        int tercero = sc.nextInt();

        if ((primer+segundo+tercero)==180){
            System.out.println("Triangulo valido");
        }else{
            System.out.println("Triangulo invalido");
        }*/

        /*System.out.println("Ingresa año");
        int anio = sc.nextInt();
        if(anio%4 ==0){
            if(anio%100 ==0) {
                if (anio % 400 == 0) {
                    System.out.println("Año bisiesto :)");
                }
            }else {
                System.out.println("Año bisiesto");
            }
        }else
        {
            System.out.println("No es año bisiesto");
        }*/

       /*System.out.println("Ingresa numero 1");
        int n1 = sc.nextInt();
        System.out.println("Ingresa numero 2");
        int n2 = sc.nextInt();

        System.out.println("Ingresa operación deseada: \n 1) Suma \n 2) Resta " +
                "\n 3) Multiplicación  \n 4) División");
        int operacion = sc.nextInt();
        sc.nextLine();
        float resultado =0;

        switch (operacion){
            case 1:
                resultado = n1+n2;
                break;
            case 2:
                resultado = n1-n2;
                break;
            case 3:
                resultado = n1*n2;
                break;
            case 4:
                resultado = n1/n2;
                break;

        }

        System.out.println(resultado);*/
        System.out.println("Ingresa un numero del 1 al 7 ");
        int dia = sc.nextInt();

        switch (dia){
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sabado");
                break;
            case 7:
                System.out.println("Es Domingo");
                break;
        }
    }


}
