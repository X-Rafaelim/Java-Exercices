package com.company;
import java.util.Random;

public class ilhas {
    public static void main(String[] args){
        int y;
        int menor = 0;
        int maior = 0;
        Random r = new Random();
        String[] ilhas = new String[]{"Pico", "Terceira", "Faial", "Sao jorge", "Graciosa",};
        String ilhas2 = "";
        String ilhas3 = "";


        int asVendas[];
        asVendas = new int[5];
        asVendas[0] = r.nextInt(101);
        asVendas[1] = 2;
        asVendas[2] = 2;
        asVendas[3] = 100;
        asVendas[4] = 100;
        maior = asVendas[0];
        menor = asVendas[0];



        for (y = 0; y < 5; y++) {
            System.out.println("Vendas da ilha do " + ilhas[y]+ " " + asVendas[y]);
            if (asVendas[y] > maior) {
                maior = asVendas[y];
                ilhas2 =ilhas[y];


            } else if (asVendas[y] < menor) {
                menor = asVendas[y];
                ilhas3 = ilhas[y];

            }
            else if ( asVendas[y] == maior){
                ilhas2 = ilhas2 + " " + ilhas[y];
            }
            else if ( asVendas[y] == menor){
                ilhas3 = ilhas3 + " " + ilhas[y];
            }
        }
        System.out.println(maior + " " + ilhas2);
        System.out.println(menor + " "+ ilhas3);

    }
}
