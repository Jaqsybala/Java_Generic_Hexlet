package M1.L1;

public class SpaceShip<T extends LifeFrom> {

    private final T lifeForm;

    public SpaceShip(T lifeForm) {
        this.lifeForm = lifeForm;
    }

    public T getLifeForm() {
        return lifeForm;
    }

    public void showLifeForm() {
        System.out.println(lifeForm.getName());
    }
}
