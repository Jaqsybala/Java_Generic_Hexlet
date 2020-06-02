package M1.L0;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public int findIndex(final List list, Object target) {

        int count = 0;

        for (Object i: list) {

            if (i == null) {
                count++;
            }

            if (i.equals(target)) {
                return count;
            }

            return count;
        }

        return -1;
    }
    // До Java 5.0 List был не обобщенным
    public static void main(String[] args) {
        Main2 main2 = new Main2();
        List<Integer> list = new ArrayList<>();
        list.add(null);
        list.add(2);
        list.add(1);
        list.add(3);
        int res = main2.findIndex(list, 1);
        System.out.println(res);

//        show(list);
    }

    // Чтобы обеспечить обратную совместимость Java допускает создания референса
    // и классов обобщенных типов без указания тип Т,
    // соответственно внутри этого List-а будет трактоваться как Object
    private static void show(final List list) {
        list.forEach(System.out::println);
    }
}
