package M1.L4;

import java.util.List;

public class WildCard {

    public int findFirstIndex(final List<? extends Human> humans, final String namePrefix) {
        for (Human names : humans) {
            if (names.getName().startsWith(namePrefix)) {
                return 0;
            }
        }
        return -1;
    }
}
