package example;

public class SimpleClass {
    private int a1;
    private int b1;

    public SimpleClass(int a1, int b1) {
        this.a1 = a1;
        this.b1 = b1;
    }

    public int simpleAddition() {
        return this.a1 + this.b1;
    }

    public int simpleDeduction() {
        return this.a1 - this.b1;
    }

    public int simpleDivision() {
        try {
            return this.a1 / this.b1;
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }

}
