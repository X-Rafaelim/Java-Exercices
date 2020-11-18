package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean nome_existente = false;
        String nome_existe;
        int vector_len = 5;
        String[] nomes= new String[vector_len];

        for (int i = 0; i < vector_len; i++){
            System.out.print("Diga um nome:");
            nomes[i] = sc.nextLine();

        }
        System.out.println("Diga um nome para verificar se existe");
        nome_existe = sc.nextLine();
        nome_existir(nomes,nome_existe);

    }
    public static Boolean nome_existir(String[] nomes, String nome_existe ){
        int vector_len = 5;


        boolean nome_existente = false;
        for (int u = 0; u < vector_len; u++){
            boolean confirmacao = Objects.equals(nome_existe,nomes[u]);
            if (confirmacao == true){
                nome_existente = true;
            }
            else {
                nome_existente = false;
            }
        }
        System.out.println(nome_existente);

        return nome_existente;


    }
}
