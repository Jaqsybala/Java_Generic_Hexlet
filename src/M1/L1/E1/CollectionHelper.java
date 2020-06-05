package M1.L1.E1;

import java.util.List;

public class CollectionHelper<T extends Human> {

    public T findFirst(final List<T> humans, final String namePrefix, final Sex sex) {

        for (T human : humans) {
            if (sex.equals(human.getSex()) && human.getName().startsWith(namePrefix)) {
                return human;
            }
        }

        return null;
    }
}
