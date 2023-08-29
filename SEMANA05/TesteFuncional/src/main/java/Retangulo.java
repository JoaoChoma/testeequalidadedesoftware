public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea() {
        // Introduzindo um erro: trocando os lados na fórmula do cálculo da área
        return comprimento * largura;
    }
}
