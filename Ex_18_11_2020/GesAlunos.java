import java.util.ArrayList;
import java.util.concurrent.TransferQueue;

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
        Turma turma1 = new Turma(1,aluno);
        ArrayList<Aluno> alunost2 = new ArrayList<Aluno>();

        alunost2.add(alun6);
        alunost2.add(alun7);
        alunost2.add(alun8);
        alunost2.add(alun9);
        alunost2.add(alun10);
        Turma turma2 = new Turma(2,alunost2);
        System.out.println("PESSOAS MENORES \n" + contaMenores(turma2));
        System.out.println("PESSOAS media boa  \n" + contaMedia(turma2));



    }

    public static int contaMenores(Turma turma){
        int contador = 0;
        for (int i = 0; i< turma.getAlunos().size();i++){
            if (turma.getAlunos().get(i).getIdade() < 18){
                System.out.println(turma.getAlunos().get(i).getNome());
                contador++;
            }
        }

        return contador;

    }

    public static int contaMedia(Turma turma){
        int contador = 0;
        for (int i = 0; i< turma.getAlunos().size();i++){
            if (turma.getAlunos().get(i).getMedia_curso() >= 10.00){
                System.out.println(turma.getAlunos().get(i).getNome());
                contador++;
            }
        }
        return contador;
    }
}
//FIcheiro atualizado teste 
