package M1.L0;

public class Main1 {

    // На уровне байт-кода не существуют типа Т, это обобщение только на уровне компиляции
    // можно не задавать тип Т и написать как ниже показано, и он создаст то, что на уровне байт-кода
    // создаст cat в котором будет тип Object, getName() будет возвращать Object,
    // соответственно нам придется его к типу String
    public static void main(String[] args) {
        Cat cat = new Cat("Salim");
        String str = (String) cat.getName();
    }
}
