package com.company;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome = "";
        int horas;
        int custoHora;
        int desconto;
        System.out.println("Qual seu nome");
        nome = sc.next();
        System.out.println("Quanto recebe por hora");
        horas = sc.nextInt();
        System.out.println("Quanto custo por hora");
        custoHora = sc.nextInt();
        System.out.println("Quanto desconta");
        desconto = sc.nextInt();
        int salario = horas * custoHora - desconto;
        System.out.println("O " + nome + " trabalhou "+ horas + "horas a " + custoHora + "e descontou " + desconto + " levou " + salario);


    }
}
