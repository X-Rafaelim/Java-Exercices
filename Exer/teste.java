package com.company;
import java.util.Random;
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        int y;
        int total = 0;
        int menor = 0;
        int maior = 0;
        String[] ilhas = new String[]{"Pico", "Terceira", "Faial", "Sao jorge", "Graciosa",};
        Random r = new Random();

        int[] maisVendas;
        maisVendas = new int[]{10, 20, 30, 40, 50};

        int[] vendas = new int[]{10, 20, 30, 40, 50};

        int asVendas[];
        asVendas = new int[5];
        asVendas[0] = r.nextInt(101);
        asVendas[1] = r.nextInt(101);
        asVendas[2] = r.nextInt(101);
        asVendas[3] = r.nextInt(101);
        asVendas[4] = r.nextInt(101);
        maior = asVendas[0];
        menor = asVendas[0];

        for (y = 0; y < 5; y++) {
            System.out.println("Vendas da ilha do " + ilhas[y]+ " " + asVendas[y]);


            if (asVendas[y] > maior) {
                maior = asVendas[y];
            } else if (asVendas[y] < menor) {
                menor = asVendas[y];
            }

            }
        System.out.println(maior);
        System.out.println(menor);
        }
    }


