package com.company;

import java.util.Scanner;

public class Mes {
    public static void main(String[] args){
        int ano;
        int mes;
        int repetir = 1;
        String res ="S";
        double anoDivisao;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga o ano");
        ano = sc.nextInt();
        do {
            System.out.println("Diga o mes");
            mes = sc.nextInt();
        }while (mes < 1 || mes > 12);
        anoDivisao = ano % 4;

        switch (mes){
            case 1:
                System.out.println("Tem 31 dias");
                break;
            case 2:
                if (anoDivisao != 0){
                    System.out.println("Tem 28 dias");
                }
                else {
                    System.out.println("Tem 29 dias");
                }
                break;
            case 3:
                System.out.println("Tem 31 dias");
                break;
            case 4:
                System.out.println("Tem 30 dias");
                break;
            case 5:
                System.out.println("Tem 31 dias");
                break;
            case 6:
                System.out.println("Tem 30 dias");
                break;
            case 7:
                System.out.println("Tem 31 dias");
                break;
            case 8:
                System.out.println("Tem 31 dias");
                break;
            case 9:
                System.out.println("Tem 30 dias");
                break;
            case 10:
                System.out.println("Tem 31 dias");
                break;
            case 11:
                System.out.println("Tem 30 dias");
                break;
            case 12:
                System.out.println("Tem 31 dias");
                break;

        }
            System.out.println("Quer continuar se quiser clique 1 se quiser terminar clique 2");
        res = sc.next();
        }while (res.equals("S") || res.equals("s"));





    }

    public static class Experimento {
        public static void main(String[] args) {
            System.out.println("Pr é gay");
        }
    }
}
