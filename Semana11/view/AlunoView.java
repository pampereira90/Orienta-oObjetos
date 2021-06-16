package view;

import java.util.Scanner;

import bo.Aluno;
import controller.AlunoController;

public class AlunoView {

    public void create() {
        Scanner in = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com a matricula: ");
        aluno.setMatricula(in.next());

        System.out.println("Entre com o nome: ");
        aluno.setNome(in.next());

        System.out.println("Entre com a cidade: ");
        aluno.setCidade(in.next());

        AlunoController controller = new AlunoController();
        controller.create(aluno);

    }

    public void read() {
        AlunoController controller = new AlunoController();
        System.out.println("Listagem de alunos:");
        System.out.println("*******************");

        for (Aluno aluno : controller.read()) {
            System.out.println("Aluno Matricula:" + aluno.getMatricula());
            System.out.println("Aluno Nome:" + aluno.getNome());
            System.out.println("Aluno Cidade:" + aluno.getCidade());
            System.out.println("----------------");
        }

    }

    public void update() {
        Scanner in = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Alteração de dados ");

        System.out.println("Entre com a matricula do aluno que deseja alterar: ");
        aluno.setMatricula(in.next());

        System.out.println("Entre com o nome: ");
        aluno.setNome(in.next());

        System.out.println("Entre com a cidade: ");
        aluno.setCidade(in.next());

        AlunoController controller = new AlunoController();
        controller.update(aluno);

    }

    public void delete() {

        Scanner in = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Deletar aluno: ");

        System.out.println("Entre com a matricula do aluno que deseja excluir:");
        aluno.setMatricula(in.next());

        AlunoController controller = new AlunoController();
        controller.delete(aluno);
    }

    public static void main(String[] args) {

        AlunoView crud = new AlunoView();
        System.out.println("Qual ação do CRUD?");
        System.out.println("Para criar um novo registro digite (c)");
        System.out.println("Para alterar um registro digite (u)");
        System.out.println("Para deletar um registro digite (d)");
        System.out.println("Para ler os registros digite (r)");
        Scanner in = new Scanner(System.in);
        String resposta = in.next();

        if (resposta.equalsIgnoreCase("c"))
            crud.create();
        else if (resposta.equalsIgnoreCase("u"))
            crud.update();
        else if (resposta.equalsIgnoreCase("d"))
            crud.delete();
        else
            crud.read();

    }

}
