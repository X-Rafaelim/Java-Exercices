package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros");
        int x = sc.nextInt();
        System.out.println("Numero inicial");
        int y = sc.nextInt();
        int z = 0;
        int w = 0;
        int v = 0;


        do {
            v = y + z;
            z = z + 1;
            w = w + v;
        } while (z != x);
        System.out.println(w);

    }
}