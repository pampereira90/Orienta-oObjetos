Package Semana10;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;


public class Login implements ActionListener {

    private JFrame telaCad;
    private JPanel painel;
    private JLabel label; 
    private JTextField txtUser; 
    private JLabel l1; 
    private JLabel ls;  
    private JPasswordField txtSenha; 
    private JButton b1; botao            
    private String senha = "000"; 

    public Login(){
        
        telaCad = new JFrame();
        painel = new JPanel();

        painel.setBorder(BorderFactory.createEmptyBorder(40, 40, 20, 30));
        painel.setLayout(new GridLayout(0,1));
        
        userId = new JLabel("Usuario:"); //Entrar Usuário
        painel.add(userId);

        txtUser = new JTextField();
        painel.add(txtUser);

        pws = new JLabel("Senha:"); //Entrar com senha
        painel.add(pws);

        txtSenha = new JPasswordField();
        painel.add(txtSenha);

        label = new JLabel();
        painel.add(label); 

        botao = new JButton("Entrar");
        botao.addActionListener(this);
        painel.add(botao);

        telaCad.add(painel, BorderLayout.CENTER);
        telaCad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaCad.setTitle("Login");
        telaCad.setSize(700,600);
        telaCad.pack();
        telaCad.setVisible(true);

    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e){
    if(txtSenha.getText().equals(senha)){

        label.setText("Ok");
        label.setFont(new Font("Arial", Font.ITALIC, 20));
        label.setForeground(Color.Blue);
        new Welcome();
        
        }else
        {

        label.setText("Favor tente novamente '000'");
        label.setFont(new Font("Arial", Font.ITALIC, 30));
        label.setForeground(Color.GRAY);
        
        }
    }
}
