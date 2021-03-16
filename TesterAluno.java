import java.util.Scanner;

public class TesterAluno{

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome: ");
        aluno.setNome(teclado.next());

        System.out.println("Entre com a Matricula: ");
        aluno.setMatricula(tecaldo.next());

        System.out.println("Entre com o Curso ");
        aluno.setCurso(teclado.next());

        aluno.listar();
        teclado.close();
    }