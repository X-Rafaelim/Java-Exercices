package com.company;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga um numero:");
        int a = sc.nextInt();
        System.out.println(verdadeiro_falso(a));

    }
    static boolean verdadeiro_falso(int a){
        boolean resl;
        if (a >= -100 && a <= 100){
            resl = true;
        }
        else {
            resl = false;
        }
        return resl;

    }
}
