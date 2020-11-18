package com.company;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga seu numero");
        int a = sc.nextInt();
        System.out.println("O seu numero é :" + par_impar(a));


    }
    static String par_impar(int a){
        String par_ou_impar;
        a = a % 2;
        if (a == 0){
            par_ou_impar = "Par";

        }
        else {
            par_ou_impar= "Impar";
        }
        return  par_ou_impar;
    }
}
