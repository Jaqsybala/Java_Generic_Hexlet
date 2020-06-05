package M1.L1.E1;

public class Man implements Human {

    private final String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public Sex getSex() {
        return Sex.M;
    }

    @Override
    public String getName() {
        return name;
    }
}
