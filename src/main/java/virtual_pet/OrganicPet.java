package virtual_pet;

public class OrganicPet extends VirtualPet {
    protected int hunger;
    String description;
    protected int thirst;
    protected int waste;


    public OrganicPet (String name, String description, int hunger, int thirst, int boredom, int waste){
        super(name);
        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;
    }
    public OrganicPet(String name, String description) {
        super(name);
        this.description = description;
    }
    public OrganicPet(String name) {
        super(name);
    }
    public void giveFood() {
        hunger += 15;
        thirst -= 5;
        boredom += 10;
        waste -= 10;
        tick();
    }
    public void giveWater() {
        thirst += 15;
        hunger += 5;
        boredom -= 5;
        waste -= 10;
        tick();
    }
    public void playWithOrganic(String name) {
        boredom += 15;
        hunger -= 10;
        thirst -= 5;
        waste -= 10;
        tick();
    }

    public void walkOrganic() {
        boredom += 15;
        hunger -= 10;
        thirst -=5;
        waste +=25;
        tick();
    }





    public int getWaste() {
        return waste;
    }
    public int getHunger() {
        return hunger;
    }
    public int getThirst() {
        return thirst;
    }
}
//    public void tick() {
//        hunger = Math.min(Math.max(hunger - 5, 0), 100);
//        thirst = Math.min(Math.max(thirst - 5, 0), 100);
//        boredom = Math.min(Math.max(boredom - 5, 0), 100);
//
//    }
