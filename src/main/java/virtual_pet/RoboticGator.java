package virtual_pet;

public class RoboticGator extends RoboticPet implements Walkable {

    public RoboticGator (String name) {
        super(name);

    }

    @Override
    public void walk() {boredom -= 5;}

}
