package reflection.demo;

public class C<T> {

    private T test;

    public T getTest() {
        return test;
    }

    public void setTest(T test) {
        this.test = test;
    }

    public C(T test) {
        this.test = test;
    }

    public C() {
    }
}
