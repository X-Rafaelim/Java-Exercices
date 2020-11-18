package com.company;

import java.util.*;

public class gestaoAnimais {
    public static void main(String[] args) {
        ANIMALS anim1 = new ANIMALS("Doberman","cao", "M", 50.5, 23,"Jacinto");
        ANIMALS anim2 = new ANIMALS("Pastor alemão", "Cão","F",95,47,"Mateus");
        ANIMALS anim3 = new ANIMALS("Rua","Gato","F",760,79,"Nikita");

        ArrayList<ANIMALS> animais = new ArrayList<>();

        animais.add(anim1);
        animais.add(anim2);
        animais.add(anim3);
        double total = 0;
        double iva = 0;

        for (int i=0;i < animais.size();i++){
            System.out.println(animais.get(i).getNome());

        }
    }
}
