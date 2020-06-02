package M0.L3;

// Обощенный класс ComplexTriple<T1, T2, T3> наследуется от дженерик класса Tuple<T1, T3>
// Для T1, T2, T3 можем задать разные типы. Например ComplexTriple<Long, String, Integer>.
public class ComplexTriple<T1, T2, T3> extends Tuple<T1, T3> {

    private final T2 var3;

    public ComplexTriple(final T1 var1, final T2 var3, final T3 var2) {
        super(var1, var2);
        this.var3 = var3;
    }

    public T2 getVar3() {
        return var3;
    }
}
