package com.company;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.println("Diz a tua nota do teste");
        nota = sc.nextInt();
        if (nota >= 0 || nota <= 5){
            System.out.println("Mau");
        }
        else if (nota >= 6 || nota <= 9){
            System.out.println("Insuficiente");
        }
        else if (nota >= 9 || nota <= 13){
            System.out.println("Suficiente");
        }
        else if (nota >= 13 || nota <= 16){
            System.out.println("Bom");
        }
        else if (nota >= 17 || nota <= 18){
            System.out.println("Muito Bom");
        }
        else if (nota >= 19 || nota <= 20){
            System.out.println("Excelente");
        }

    }
}
