package com.company;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String newColorpt = "";
        String newColor = "";
        String colorChoise = "";
        int menu = 1;
       do {
           System.out.println(newColor);
           colorChoise = "";
           String red = "Red";
           String orange = "Orange";
           String yellow = "Yellow";
           String green = "Green";
           String blue = "Blue";
           String indigo = "Indigo";
           String violet = "Violet";
           System.out.println("Porfavor diga a sua cor em inglês");
           colorChoise = sc.next();

           if (colorChoise == red) {
               System.out.println("Vermelho");
           } else if (colorChoise.equals("orange")) {
               System.out.println("Laranja");
           } else if (colorChoise.equals("yellow")) {
               System.out.println("Amarelo");
           } else if (colorChoise.equals("green")) {
               System.out.println("Verde");
           } else if (colorChoise.equals("Blue")) {
               System.out.println("Azul");
           } else if (colorChoise.equals("Indigo")) {
               System.out.println("Anil");
           } else if (colorChoise.equals("Violet")){
               System.out.println("Violeta");
           } else if (colorChoise.equals(newColor)) {
                   System.out.println(newColorpt);
           } else {
               System.out.println("Diga a nova cor em inglês");
               newColor = sc.next();
               System.out.println("Agora em portugues");
               newColorpt = sc.next();
           }
           System.out.println("Para continuar clique 1 para fechar clique 2");
           menu = sc.nextInt();
       }while (menu == 1);

    }
}
