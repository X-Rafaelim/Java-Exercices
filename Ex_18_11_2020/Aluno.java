import  java.util.*;

public class Aluno {
    private String nome;
    private int idade;
    private String email;
    private double media_curso;


    //contrutor
    public Aluno(String nome, int idade, String email, double media_curso ){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.media_curso = media_curso;
    }


    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setMedia_curso(double media_curso){
        this.media_curso = media_curso;
    }

    //getters
    public String getNome(){
        return this.nome = nome;
    }
    public int setIdade(){
        return this.idade = idade;
    }
    public String setEmail(){
        return this.email = email;
    }
    public double setMedia_curso(){
        return this.media_curso = media_curso;
    }



}
