package M1.L1.E1;

public class InterSex implements Human {

    private final String name;

    public InterSex(String name) {
        this.name = name;
    }

    @Override
    public Sex getSex() {
        return Sex.I;
    }

    @Override
    public String getName() {
        return name;
    }
}
