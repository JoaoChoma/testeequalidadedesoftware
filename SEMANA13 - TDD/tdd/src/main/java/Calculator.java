public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return (double) a / b;
    }
}
