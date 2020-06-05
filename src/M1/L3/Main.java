package M1.L3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(97);
        list.add(8);
        list.add(18);
        list.add(18);
        list.add(97);
        System.out.println(CollectionHelper.findFirstIndex(list,8));
        System.out.println(CollectionHelper.findLastIndex(list,8));
        System.out.println(list.size());
    }

}
