package M1.L1.E1;

public class Woman implements Human {

    private final String name;

    public Woman(String name) {
        this.name = name;
    }

    @Override
    public Sex getSex() {
        return Sex.W;
    }

    @Override
    public String getName() {
        return name;
    }
}
