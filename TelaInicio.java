Package Semana10;

import javax.swing.*;
import java.awt.*;


public class TelaInicio{

    private JFrame tela;
    private JPanel painel;
    private JLabel lyt;

    public TelaInicio(){
        
        tela = new JFrame();
        painel = new JPanel();

        painel.setBorder(BorderFactory.createEmptyBorder(50, 50, 40, 40));
        painel.setLayout(new GridLayout(0,1));
        
        
        lyt = new JLabel("Welcome");
        lyt.setFont((new Font("ARIAL", Font.ITALIC, 30)));
        lyt.setForeground(Color.GRAY);
        painel.add(lyt);

        tela.add(painel, BorderLayout.CENTER);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setTitle("Welcome");
        tela.setSize(600,600);
        tela.pack();
        tela.setVisible(true);

    }

    public static void main(String[] args) {
        new TelaInicio();
    }
}
