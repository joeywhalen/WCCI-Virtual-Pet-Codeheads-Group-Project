package virtual_pet;

public class OrganicPet extends VirtualPet{
    protected int hunger;
    protected int thirst;

    public OrganicPet (String name){
        super(name);
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public void giveFood() {
        hunger += 15;
        thirst -= 5;
        boredom += 10;
        tick();
    }

    public void giveWater() {
        thirst += 15;
        hunger += 5;
        boredom -= 5;
        tick();
    }

    public void playWith() {
        boredom += 15;
        hunger -= 10;
        thirst -= 5;
        tick();
    }

//    public void tick() {
//        hunger = Math.min(Math.max(hunger - 5, 0), 100);
//        thirst = Math.min(Math.max(thirst - 5, 0), 100);
//        boredom = Math.min(Math.max(boredom - 5, 0), 100);
//
//    }


    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }


}
//protected enum typeofpet {organic, robotic};

//public virtualpet(String name, String description,TypeofPet Organic)  in OP & RP
//this.name name
//this.description desc
//this boredomlevel 0
//this isalive true
//this TypeofPet typeofpet
//virtualpet.typeofpet.
//super(name, desc, typeofgoat
//public typeofpet petType in VP
//this.petType = typeOfPet  in VP
//in app if(shelterList.get(i).typeofpet == ORGANIC) {
//sout  (OrganicPets) shelterList.get(i).getHungerLevel());