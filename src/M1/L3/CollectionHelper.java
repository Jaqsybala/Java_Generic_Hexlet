package M1.L3;

import java.util.List;

public class CollectionHelper {

    public static <T> int findIndex(final List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static <T> int findFirstIndex(final List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(target) && i == 0) {
                return i;
            } else if (list.get(i).equals(target)) {
                return i;
            }
        }

        return -1;
    }

    public static <T> int findLastIndex(final List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target) && i == list.size() - 1) {
                return i;
            } else if (list.get(i).equals(target) && i > 0) {
                return i;
            }

        }
        return -1;
    }
}
