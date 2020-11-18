package com.company;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int maxnum = 5;
        int[] intArray;
        intArray = new int[maxnum];
        int soma2 = 0;
        int media2;
        int maior = 0;
        int menor = 0;

        System.out.println("Introduza 5 numeros");
        for (int i = 0; i < maxnum;i++){
             intArray[i] = sc.nextInt();
             soma2 += intArray[i];
            System.out.println("Introduza mais um numero");
        }
        media2 = soma2 / maxnum;

        System.out.println("A media artimetrica é: " + media2 );




    }
}
