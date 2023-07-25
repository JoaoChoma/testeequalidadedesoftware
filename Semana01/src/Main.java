/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author joaochoma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] valores = {10, 20, 30};
        CalculadoraMedia med = new CalculadoraMedia();
        double media = med.calcularMedia(valores);
        System.out.println(media);

        // Falha: o resultado é incorreto, a média deveria ser 20.0, mas retorna 19.0
        if (media != 20.0) {
            System.out.println("Falha! O resultado da média está incorreto.");
        } else {
            System.out.println("Teste passou! A média está correta.");
        }
    }
}
    