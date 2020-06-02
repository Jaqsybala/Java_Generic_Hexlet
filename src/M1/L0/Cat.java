package M1.L0;

// На уровне байт-кода getName() возвращает Object,
// обобщение дженериков существуют только на уровне компиляции
// на уровне байт-кода дженериков нет, там только Object.

public class Cat<T> {

    private T name;

    public Cat(final T name) {
        this.name = name;
    }


    // Когда мы вызываем getName() мы результат кастим к String (в моем случае)
    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
