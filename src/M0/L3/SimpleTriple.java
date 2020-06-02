package M0.L3;

// Типизированный класс SimpleTriple<T> наследуется от дженерик класса Tuple<T, T>
// Он требует для создания тип Т, но нет возможности указать разные типы для var1, var2, var3

public class SimpleTriple<T> extends Tuple<T, T> {

    private final T var3;

    public SimpleTriple(T var1, T var2, T var3) {
        super(var1, var2);
        this.var3 = var3;
    }

    public T getVar3() {
        return var3;
    }
}
