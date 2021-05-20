import javax.print.event.PrintEvent;
import javax.swing.*;  
import java.awt.event.*;

public class SomaValor implements ActionListener{  
    JTextField tf1,tf2,tf3;  
    JButton b1;
    JLabel l4;  
    
    SomaValor(){  
        JFrame f = new JFrame("Calculadora:");    
        JLabel l1,l2,l3; 

        l1=new JLabel("Numero01 :");  
        l1.setBounds(35,50, 150,20); 

        tf1=new JTextField();  //Texto para primeira caixa
        tf1.setBounds(100,50, 150,20);

        l2=new JLabel("Numero02 :");  
        l2.setBounds(35,100, 150,20);

        tf2=new JTextField();  //Texto para segunda caixa
        tf2.setBounds(100,100, 150,20);

        b1=new JButton("Somar");  //Botão de soma
        b1.setBounds(80,150, 100,30);  
        b1.addActionListener(this);  

        l3=new JLabel("Resultado=");  
        l3.setBounds(35,200, 150,20);

        /* 
        tf3=new JTextField();  //Resultado por caixa de texto 
        tf3.setBounds(100,200, 150,20); 
        tf3.setEditable(false);
        */

        l4=new JLabel();  //Result
        l4.setBounds(100,200, 150,20); 
        
        f.add(l1);f.add(tf1);f.add(l2);f.add(tf2);f.add(b1);f.add(l3);f.add(l4);
        f.setSize(300,350);  
        f.setLayout(null);  
        f.setVisible(true);  
    }
  
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        int c=0;  
        if(e.getSource()==b1){  
            c=a+b;  
        }
        String result=String.valueOf(c);  
        l4.setText(result);  
    }  
public static void main(String[] args) {  
    new SomaValor();  
} }  
