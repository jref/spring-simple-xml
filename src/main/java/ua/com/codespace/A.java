package ua.com.codespace;

public class A {

    private B b;
    private int value;

    public A() {
    }

    public A(B b, int value) {
        this.b = b;
        this.value = value;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "A{" +
                "value=" + value +
                '}';
    }
}
