package com.company;

public class ANIMALS {
    private String raca;
    private String especie;
    private String genero;
    private Double peso;
    private int idade;
    private String nome;


    //construtor da classe animal
    public ANIMALS(String raca,String especie, String genero, double peso , int idade,String nome){
        this.raca = raca;
        this.especie = especie;
        this.genero = genero;
        this.peso = peso;
        this.idade = idade;
        this.nome = nome;

    }

    //setters = metodos de set
    public void setRaca(String raca){
        this.raca = raca;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setPeso(Double peso){
        this.peso = peso;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }



    //getters = metodos de get
    public String getRaca(){
        return this.raca;
    }
    public String getEspecie(){
        return this.especie;
    }
    public String getGenero(){
        return this.genero;
    }
    public Double getPeso(){
        return this.peso;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getNome(){
        return this.nome;
    }





}
