public class Turma {
    private int id_alunos;
    private String alunos;


    //construtor
    public Turma(int id_alunos, String alunos){
        this.id_alunos = id_alunos;
        this.alunos = alunos;
    }

    //setters
    public void setId_alunos(int id_alunos){
        this.id_alunos = id_alunos;
    }
    public void setAlunos(String alunos){
        this.alunos = alunos;
    }

    //getters
    public int getId_alunos(){
        return this.id_alunos = id_alunos;
    }
    public String getAlunos(){
        return this.alunos = alunos;
    }


}




