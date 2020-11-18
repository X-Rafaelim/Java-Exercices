import java.util.ArrayList;

public class GesAlunos {
    public static void main(String[] args) {
        ArrayList<Aluno> aluno = new ArrayList<>();
        ArrayList<Turma> turma = new ArrayList<>();


        Aluno alun1 = new Aluno("Rafael",19,"rakitir@gmail.com", 17.10);
        Aluno alun2 = new Aluno("Mario",90,"mariogod@gmail.com", 15.10);
        Aluno alun3 = new Aluno("Roberto",30,"roberoplays@gmail.com", 14.90);
        Aluno alun4 = new Aluno("Marco",29,"craquezao@gmail.com", 13.60);
        Aluno alun5 = new Aluno("Luis",15,"progamer@gmail.com", 11.80);
        Aluno alun6 = new Aluno("Rodrigo",16,"rodrigyout@gmail.com", 14.60);
        Aluno alun7 = new Aluno("Joao",19,"jonnybrave@gmail.com", 12.10);
        Aluno alun8 = new Aluno("Marcelo",18,"marceloking@gmail.com", 11.00);
        Aluno alun9 = new Aluno("Hogo",13,"marborofumaças@gmail.com", 10.10);
        Aluno alun10 = new Aluno("Emiliano",23,"firmamarreta@gmail.com", 12.90);


        aluno.add(alun1);
        aluno.add(alun2);
        aluno.add(alun3);
        aluno.add(alun4);
        aluno.add(alun5);
        aluno.add(alun6);
        aluno.add(alun7);
        aluno.add(alun8);
        aluno.add(alun9);
        aluno.add(alun10);


        for (int i = 0; i < aluno.size(); i++){
            System.out.println(aluno.get(i).getNome());
        }



    }
}
