package com.company;
import java.util.concurrent.TimeUnit;
import  java.util.*;

public class Ex11a {


    public static void main(String[] args) {
        menu();

    }

    //Isto é um Metodo
    public static void menu (){
        Scanner sc = new Scanner(System.in);

        System.out.println("*********************");
        System.out.println("*  GESTÃO DE ALUNOS  *");
        System.out.println("*********************");
        System.out.println("");
        System.out.println("");
        System.out.println("1 - Inscrever aluno");
        System.out.println("2 - Consultar alunos");
        System.out.println("3 - Listar alunos");
        System.out.println("4 - Sair");
        System.out.println("So pode escolhes as opções de 1 a 4");
        int escolha = sc.nextInt();

        switch (escolha){
            case 1:
                increver_alunos();
                break;
            case 2:
                consultar_alunos();
                break;
            case 3:
                listar_alunos();
                break;
            case 4:
                System.out.println("Terminado...");
                System.exit(0);
                break;
            default:
                menu();

        }
    }

    public static void increver_alunos (){
        System.out.println("Tu escolheste a opção Inscrever alunos");
        delay(3);

    }

    public static void consultar_alunos (){
        System.out.println("Tu escolheste a opção Consultar alunos");
        delay(3);

    }

    public static void listar_alunos (){
        System.out.println("Tu escolheste a opção Listar alunos");
        delay(3);

    }
    public static void delay(int segundos){
        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        menu();
    }
}