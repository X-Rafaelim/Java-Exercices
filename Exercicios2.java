package com.company;
import java.util.Scanner;


public class Exercicios2 {
    public static void main(String[] args){
        int idade1;
        int idade2;
        int idadeFinal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Diga a sua idade");
        idade1 = sc.nextInt();
        System.out.println("Diga a sua idade tambem");
        idade2 = sc.nextInt();
        if (idade1 > idade2){
            idadeFinal = idade1 - idade2;
            System.out.println("A primeira pessoa é a mais velha e a diferença de idades é" + idadeFinal);
        }
        else if (idade1 < idade2){
            idadeFinal = idade2 - idade1;
            System.out.println("A segunda pessoa é a mais velha e a diferença de idades é" + idadeFinal);
        }




    }
}
