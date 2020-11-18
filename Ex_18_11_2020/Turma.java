import java.lang.reflect.Array;
import java.util.ArrayList;

public class Turma {
    private int id_Turma;
    private ArrayList<Aluno> alunos;


    //getters
    public int getId_Turma() {
        return id_Turma;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }


    //setters
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    public void setId_Turma(int id_Turma) {
        this.id_Turma = id_Turma;
    }




    //construtor
    public Turma(int id_Turma, ArrayList<Aluno> alunos){
        this.id_Turma = id_Turma;
        this.alunos = alunos;

    }




}




