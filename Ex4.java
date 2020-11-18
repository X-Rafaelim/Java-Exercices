package com.company;

import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Diga um numero:");
        int a = sc.nextInt();
        System.out.println("O dobro do seu numero é " + dobro(a));
    }
    static int dobro(int a){
        a = a *2;
        return a;

    }
}
