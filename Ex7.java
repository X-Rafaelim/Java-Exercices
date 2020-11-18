package com.company;
import java.util.*;

public class Ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raiz1;
        double raiz2;
        double resultado;
        double a;
        double b;
        double c;

        System.out.println("Diga o a");
        a = sc.nextDouble();
        System.out.println("Diga o b");
        b = sc.nextDouble();
        System.out.println("Diga o c");
        c = sc.nextDouble();

        double calculos = 0;
        calculos = (b*b) - (4*a*c);

        double quadrada = 0;
        quadrada = Math.sqrt(calculos);

        if (calculos > 0){
            raiz1 = (-b + quadrada) / (2*a);
            raiz2 = (-b -quadrada) / (2*a);

            System.out.println( +raiz1 + " e " +raiz2);
        }
        else if(calculos == 0){
            System.out.println( +(-b +quadrada) / (2*a));
        }

    }


}
