package M0.L2;

public class Tuple<T1, T2> {

    private final T1 var1;

    private final T2 var2;

    public Tuple(final T1 var1, final T2 var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public T1 getVar1() {
        return var1;
    }

    public T2 getVar2() {
        return var2;
    }

}
