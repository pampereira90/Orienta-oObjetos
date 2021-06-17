//Equipe: Daniel Guedes, Leandro Motta e Pâmela Pereira
//Matricula: 0050015226

package view;

import java.util.Scanner;

import bo.Aluno;
import controller.AlunoController;
//import para JavaSwing;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.*;
import javax.swing.BorderFactory;
import java.awt.*;

public class AlunoView implements ActionListener {

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

        new AlunoView();
        /*
         * AlunoView crud = new AlunoView(); System.out.println("Qual ação do CRUD?");
         * System.out.println("Para criar um novo registro digite (c)");
         * System.out.println("Para alterar um registro digite (u)");
         * System.out.println("Para deletar um registro digite (d)");
         * System.out.println("Para ler os registros digite (r)"); Scanner in = new
         * Scanner(System.in); String resposta = in.next();
         * 
         * if (resposta.equalsIgnoreCase("c")) crud.create(); else if
         * (resposta.equalsIgnoreCase("u")) crud.update(); else if
         * (resposta.equalsIgnoreCase("d")) crud.delete(); else crud.read();
         */

    }

    private JFrame telaInicial;
    private JPanel painel;
    private JLabel crudJ; // Ação do crud
    private JLabel txtCriar;
    private JLabel txtConsultar;
    private JLabel txtEditar;
    private JLabel txtDeletar;
    private JLabel label;
    private JTextField txtCodigoAcess; // Entrar com o valor para acessar o BD
    private JButton b1;
    private JButton bSair;
    private String AcessC = "c"; // Para acessar criar
    private String AcessU = "u"; // Para acessar Editar
    private String AcessD = "d"; // Para acessar Deletar
    private String AcessS = "s"; // Para acessar Consultar

    public AlunoView() {

        telaInicial = new JFrame();
        painel = new JPanel();

        painel.setBorder(BorderFactory.createEmptyBorder(50, 50, 80, 100));
        painel.setLayout(new GridLayout(0, 1));

        crudJ = new JLabel("Ação da CRUD:"); // Entrar com a CRUD
        txtCriar = new JLabel("(c)Criar");
        txtConsultar = new JLabel("(s)Consultar");
        txtEditar = new JLabel("(u)Editar");
        txtDeletar = new JLabel("(d)Deletar");
        painel.add(crudJ);
        painel.add(txtCriar);
        painel.add(txtConsultar);
        painel.add(txtEditar);
        painel.add(txtDeletar);

        txtCodigoAcess = new JTextField();
        painel.add(txtCodigoAcess);

        label = new JLabel();
        painel.add(label);

        b1 = new JButton("Acessar"); // Botão
        b1.addActionListener((ActionListener) this);
        painel.add(b1);

        telaInicial.add(painel, BorderLayout.CENTER);
        telaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaInicial.setTitle("AcessarBD");
        telaInicial.setSize(600, 500);
        telaInicial.pack();
        telaInicial.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        AlunoView crudSwing = new AlunoView();

        if (txtCodigoAcess.getText().equals(AcessC)) {
            crudSwing.create();

        } else if (txtCodigoAcess.getText().equals(AcessU)) {
            crudSwing.update();

        } else if (txtCodigoAcess.getText().equals(AcessD)) {
            crudSwing.delete();

        } else if (txtCodigoAcess.getText().equals(AcessS)) {
            crudSwing.read();
        }
        System.exit(0);

    }
}
