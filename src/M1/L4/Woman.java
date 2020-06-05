package M1.L4;

import M1.L1.E1.Sex;

public class Woman implements Human {

    private final String name;

    public Woman(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
