package com.company;

public class carros {
    private String marca;
    private  String cor;
    private int hp;
    private int rpm;
    private String transmissao;
    private String combustivel;

    public carros(String marca, String cor, int hp, int rpm, String transmissao, String combustivel ){
        this.marca = marca;
        this.cor = cor;
        this.hp = hp;
        this.rpm = rpm;
        this.transmissao = transmissao;
        this.combustivel = combustivel;

    }


    //Setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public void setRpm(int rpm){
        this.rpm = rpm;
    }
    public void setTransmissao(String transmissao){
        this.transmissao = transmissao;
    }
    public void setCombustivel(String combustivel){
        this.combustivel = combustivel;
    }

    //getters
    public String getMarca(){
        return this.marca;
    }
    public String getCor(){
        return this.cor;
    }
    public int getHp(){
        return this.hp;
    }
    public int getRpm(){
        return this.rpm;
    }
    public String getTransmissao(){
        return this.transmissao;
    }
    public String getCombustivel(){
        return this.combustivel;
    }



}
