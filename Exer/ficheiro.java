package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ficheiro {
    public static void main(String[] args) {
        String input = "";
        Scanner SC = new Scanner(System.in);



       /* try {
            File f = new File("C:\\random\\ficheiros.txt");
            if (f.createNewFile()){
                System.out.println("Ficheiro foi criado");
            }
            else {
                System.out.println("Ficheiro ja existe ");
            }
        }catch (IOException e){
            System.out.println("Ocorreu um erro a criar o ficheiro");
        }
        */

       input = SC.nextLine();
        String input2 = SC.nextLine();

        try {
            FileWriter f = new FileWriter("C:\\random\\ficheiros.txt", true);
            f.write(input + "\n" + input2);
            f.close();
            System.out.println("Os a sua frase  foi posta dentro o ficheiro \n");
        }

         catch (IOException e) {
             System.out.println("Ocorreu um erro na tentativa de escrever algo no seu ficheiro");
            e.printStackTrace();

        }
        try{

            File f = new File("C:\\random\\ficheiros.txt");
            Scanner ler_ficheiro = new Scanner(f);
            while (ler_ficheiro.hasNextLine()){
                String data = "";

                    data = ler_ficheiro.nextLine();
                String[] linha = data.split(";");



                System.out.println(data);
            }

        }
        catch (FileNotFoundException e){
            System.out.println("Ocorreu um erro");
            e.printStackTrace();

        }

      //String[] linha = data.split(";");
    }
}
