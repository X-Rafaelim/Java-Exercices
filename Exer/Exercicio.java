package com.company;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Fazer as perguntas
        int turno;

        //do while para quando for escrito um numero menor q 1 e maior q 3 ele repete denovo
        do {
            System.out.println("Turno de 1 a 3 ?");
            turno = sc.nextInt();
        }while (turno < 1 || turno >3);
        double lk = 0;
        System.out.println("Quantas horas?");
        int x = sc.nextInt();
        System.out.println("Custo?");
        double y = sc.nextInt();
        //calcula atraves da escolha do turno
        switch (turno) {
            case 1:
                y = y;
                break;
            case 2:
                lk = y * 0.25;
                break;
            case 3:
                lk = y * 0.50;
                break;
        }
         //faz o calculo final
         y = y + lk;
        double z = x * y;
        System.out.println("Total =" + z);

    }
}
