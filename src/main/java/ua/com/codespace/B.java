package ua.com.codespace;

public class B {
    private A a;
    private int val;

    public B() {
    }

    public B(A a, int val) {
        this.a = a;
        this.val = val;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                ", val=" + val +
                '}';
    }
}
