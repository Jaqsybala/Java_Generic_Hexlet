package M0.L1;

public class Tuple<T> {

    private final T var1;

    private final T var2;

    public Tuple(final T var1, final T var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public T getVar1() {
        return var1;
    }

    public T getVar2() {
        return var2;
    }

}
