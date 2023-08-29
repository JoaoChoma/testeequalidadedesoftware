import java.util.Arrays;

public class ArrayUtils {
    public static int encontrarMaiorElemento(int[] array) {
        int maior = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int num : array) {
            soma += num;
        }
        return soma;
    }

    public static boolean contemElemento(int[] array, int elemento) {
        for (int num : array) {
            if (num == elemento) {
                return true;
            }
        }
        return false;
    }
}
