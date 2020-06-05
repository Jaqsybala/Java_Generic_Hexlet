package M1.L1.E1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CollectionHelper<Human> collectionHelper = new CollectionHelper<>();
        final List<Human> mans = new ArrayList<>(){
            {
                add(new Man("Arlan"));
                add(new Man("Aziz"));
                add(new Woman("Victoria"));
                add(new Woman("Dana"));
                add(new InterSex("Me"));
            }
        };

        Human human = collectionHelper.findFirst(mans, "Az",Sex.M);
        System.out.println(human.toString());
    }
}
