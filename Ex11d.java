package com.company;

import java.util.*;

public class Ex11d {
    private static int[] idade = new int[20];
    private static String[] primeiro_nome = new String[20];
    private static String[] ultimo_nome = new String[20];
    private static String[] freguesia = new String[20];
    private static String[] conselho= new String[20];
    private static int loop = 1;
    private static int copia_loop =0;
    private static int continuar_loop = 0;
    private static int escolher = 0;
    private static int menu_consultar = 0;




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
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Diga seu primeiro nome");
            primeiro_nome[loop] = sc.nextLine();

            System.out.println("Diga seu ultimo nome");
            ultimo_nome[loop] = sc.nextLine();

            System.out.println("Diga sua idade");
            idade[loop] = sc.nextInt();
            sc.nextLine();

            System.out.println("Diga a sua freguesia");
            freguesia[loop] = sc.nextLine();

            System.out.println("Diga o seu conselho ");
            conselho[loop] = sc.nextLine();

            System.out.println("Criado aluno numero " + loop  + " chamado " + primeiro_nome[loop] + " " + ultimo_nome[loop] + " residente em " + freguesia[loop] + " de " + conselho[loop]);
            loop++;
            copia_loop = loop;
            System.out.println("\n");
            System.out.println("Escolha uma das seguintes opções:");
            System.out.println("0-Adicionar mais um aluno");
            System.out.println("1-Voltar ao menu");
            continuar_loop = sc.nextInt();
            sc.nextLine();
        }while ( continuar_loop == 0);
        menu();
    }

    public static void consultar_alunos (){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Diga o numero do aluno que quer consultar ");
            escolher = sc.nextInt();

            copia_loop = escolher  ;

            System.out.println("Anluno n -" + escolher);
            System.out.println("Nome -" + primeiro_nome[copia_loop] + " " + ultimo_nome[copia_loop]);
            System.out.println("Idade -" + idade[copia_loop]);
            System.out.println("Freguesia -" + freguesia[copia_loop]);
            System.out.println("Conselho -" + conselho[copia_loop]);
            System.out.println();
            System.out.println("Escolha uma das opções");
            System.out.println("0-Consultar novamente");
            System.out.println("1-Ir para menu");
            menu_consultar = sc.nextInt();
        }while (menu_consultar == 0);




    }

    public static void listar_alunos (){
        System.out.println("+-----+------+-------+-----------+-----------+\n" +
                "| Num | Nome | Idade | Freguesia | Conselho  |\n" +
                "+-----+------+-------+-----------+-----------+\n");


    }
}
