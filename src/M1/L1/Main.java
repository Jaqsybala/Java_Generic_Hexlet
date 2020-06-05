package M1.L1;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        SpaceShip<Human> spaceShip = new SpaceShip<>(human);
        spaceShip.showLifeForm();
        Human human1 = spaceShip.getLifeForm();
    }
}
