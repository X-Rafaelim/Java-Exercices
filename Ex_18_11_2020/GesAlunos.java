import java.util.ArrayList;
import java.util.concurrent.TransferQueue;

public class GesAlunos {
    public static void main(String[] args) {

        ArrayList<Aluno> aluno = new ArrayList<>();

        //objetos criados com seus criterios
        Aluno alun1 = new Aluno("Rafael",19,"rakitir@gmail.com", 17.10);
        Aluno alun2 = new Aluno("Mario",90,"mariogod@gmail.com", 5.10);
        Aluno alun3 = new Aluno("Roberto",30,"roberoplays@gmail.com", 14.90);
        Aluno alun4 = new Aluno("Marco",29,"craquezao@gmail.com", 13.60);
        Aluno alun5 = new Aluno("Luis",15,"progamer@gmail.com", 11.80);
        Aluno alun6 = new Aluno("Rodrigo",16,"rodrigyout@gmail.com", 14.60);
        Aluno alun7 = new Aluno("Joao",19,"jonnybrave@gmail.com", 12.10);
        Aluno alun8 = new Aluno("Marcelo",18,"marceloking@gmail.com", 11.00);
        Aluno alun9 = new Aluno("Hogo",13,"marborofumaças@gmail.com", 6.10);
        Aluno alun10 = new Aluno("Emiliano",23,"firmamarreta@gmail.com", 12.90);


        //adicionar os objetos as uma lista de alunos que vai ser usada no objeto da turma1
        aluno.add(alun1);
        aluno.add(alun2);
        aluno.add(alun3);
        aluno.add(alun4);
        aluno.add(alun5);
        //criação do objeto turma 1
        Turma turma1 = new Turma(1,aluno);

        //criação dad lista anlunost2 para que seja usada na segunda turma
        ArrayList<Aluno> alunost2 = new ArrayList<Aluno>();

        //adicionando os objetos a lista alunost2 para serem usado para a turma 2
        alunost2.add(alun6);
        alunost2.add(alun7);
        alunost2.add(alun8);
        alunost2.add(alun9);
        alunost2.add(alun10);
        //criação do objeto  turma 2
        Turma turma2 = new Turma(2,alunost2);

        System.out.println("Pessoas menores");
        System.out.println(contaMenores(turma1));
        System.out.println("---------------------------------");
        System.out.println("Pessoas media boa");
        System.out.println(contaMedia(turma1));



    }
    //Mostra o alunos menores de 18 anos de idade
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

    //Mostra os alunos com nota mais ou igual a 10.00
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
