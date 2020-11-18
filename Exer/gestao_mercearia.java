package com.company;

import java.util.ArrayList;

public class gestao_mercearia {
    public static void main(String[] args) {
        MERCEARIA merc1 = new MERCEARIA(10,"Kg","Batata doce", 0.90,19.00);
        MERCEARIA merc2 = new  MERCEARIA(1,"LT","Sumo de laranja", 1.9,20.00);
        MERCEARIA merc3 = new MERCEARIA(3,"Embalagem", "Arroz",1.00,15.00);
        MERCEARIA merc4 = new MERCEARIA(8,"LT", "Leite",1.89,17.00);
        MERCEARIA merc5 = new MERCEARIA(2,"kg", "Cenoura",0.87,15.00);
        MERCEARIA merc6 = new MERCEARIA(30,"Kg", "Banana",4.00,15.00);

        ArrayList<MERCEARIA> mercearia = new ArrayList<>();

        mercearia.add(merc1);
        mercearia.add(merc2);
        mercearia.add(merc3);
        mercearia.add(merc4);
        mercearia.add(merc5);
        mercearia.add(merc6);

        double total = 0;
        double iva = 0;

        System.out.println("Qtd         " + "UNIDADE                  " + "Descrição           " + "P.Unit         "+ "IVA%");


        for (int i = 0; i < mercearia.size(); i++){
            total += mercearia.get(i).getQtd() * mercearia.get(i).getP_unid();
            iva += (mercearia.get(i).getQtd() * mercearia.get(i).getP_unid() * mercearia.get(i).getIva() /100);

            System.out.format("%3d %14s %28s %13.2f %12.2f\n", mercearia.get(i).getQtd(), mercearia.get(i).getUnidade(), mercearia.get(i).getDescricao(),
                    mercearia.get(i).getP_unid(), mercearia.get(i).getIva());


        }
        System.out.println("Valor total : " + total );
        System.out.println("Iva: "+ iva);


    }
}
