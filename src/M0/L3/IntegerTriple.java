package M0.L3;

// Нетипизированный класс наследуется от типизированного дженерик класса Tuple<Integer, Integer>
// Tuple<T, Integer> не можем указать обобщенный тип Т,
// потому что в момент создания обьекта IntegerTriple
// не существуют возможности указать Т в Tuple<T, Integer> + IntegerTriple нетипизированный.

public class IntegerTriple extends Tuple<Integer, Integer> {

    private final Integer var3;

    public IntegerTriple(Integer var1, Integer var2, Integer var3) {
        super(var1, var2);
        this.var3 = var3;
    }

    public Integer getVar3() {
        return var3;
    }
}
