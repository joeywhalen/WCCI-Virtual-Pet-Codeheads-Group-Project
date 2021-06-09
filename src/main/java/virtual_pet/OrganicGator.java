package virtual_pet;

public class OrganicGator extends OrganicPet implements Walkable{

        public OrganicGator (String name) {
            super(name);
        }

        @Override
        public void walk() {boredom -=5;}
}

