package virtual_pet;

public class RoboticBear extends RoboticPet implements Walkable {

    public RoboticBear (String name) {
        super(name);

    }

    @Override
    public void walk() {boredom -=5;}
}
