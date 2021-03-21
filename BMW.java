public class BMW extends Carro {
    public float velocidade;

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public void imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "A qtd de acentos é " + nun_acentos + ", a cor é " + cor + " e a velocidade é " + velocidade + " km/h";
    }

}
