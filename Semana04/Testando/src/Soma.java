public class Soma {
    int num1;
    int num2;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public Soma(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int somar(){
        return this.num1 + this.num2;
    }
}
