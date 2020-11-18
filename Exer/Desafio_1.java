package com.company;

import java.util.*;

public class Desafio_1 {
    public static void main(String[] args) {
        int[] nuvem_avistada = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            nuvem_avistada[i] = sc.nextInt();
        }



        //GRANDE = 1
        //PEQUENA = 0

        int[] tempestade = {1,1,1,1,1};
        int[] sol = {0,0,0,0,1};
        int[] chuva = {1,0,1,0,0};
        int[] nubladdo ={0,1,0,1,0};


        


        // se por acaso tiver 4 nuvens grande automaticamente passa a ser (tempestade)
        // se a ultima casa do array for uma nuvem grande passa a ser (sol)
        //
    }
}
