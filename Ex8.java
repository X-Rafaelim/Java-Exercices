package com.company;
import  java.util.*;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1= sc.nextInt();
        int [] array = new int[100];
        int divisão;
        int array_num = 0;
        System.out.println("Diga um numero para converter ");

        do {
            array[array_num]= n1 % 2;
             n1 = n1 / 2;
            array_num++;

        }while (n1 != 0);
        for (int i = array_num - 1; i >= 0; i--){
            System.out.print(" " + array[i]);
        }

       /* int a = 37 % 2;
        int b = 37 / 2;
        System.out.println(b);
        System.out.println(a);

       */


    }




}
