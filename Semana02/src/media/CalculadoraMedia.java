package media;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaochoma
 */
public class CalculadoraMedia {
    public double calcularMedia(double[] valores) {
        return sum(valores) / valores.length-1;
    }

    public double sum(double[] valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma;
    }
}
