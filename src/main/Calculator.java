public class Calculator {

    public Calculator() {

    }

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    private int a;
    private int b;
}