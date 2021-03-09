import java.util.Scanner;
class Main {
  public static void main(String[] args) {

//Pâmela Silva Pereira
//Matrícula: 0050015226

Scanner input = new Scanner(System.in);

    int tabuada;
    int x;

  System.out.println("Entre com o numero");
  tabuada = input.nextInt();

  System.out.println("Tabuada de Somar do " + tabuada);

  for(x=0; x<=10; x++)
    {
      System.out.println(tabuada + " + " + x + " = " + (tabuada + x));
    }
  }
}