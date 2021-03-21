import java.util.Scanner;

public class TesterCarro {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        BMW bmw = new BMW();

        System.out.println("Entre com a quantidade de acentos: ");
        bmw.setNun_acentos(teclado.nextInt());

        System.out.println("Entre com a Cor do carro: ");
        bmw.setCor(teclado.next());

        System.out.println("Entre com a Velocidade ");
        bmw.setVelocidade(teclado.nextFloat());

        bmw.imprimir();
        teclado.close();

    }
}