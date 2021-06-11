package virtual_pet;

import javax.swing.*;

public class VirtualPet extends VirtualPetShelter {
    String name;
    String description;
    protected int boredom;
    private int hunger;
    private int thirst;
    private boolean isAlive;
    private int batteryLevel;
    private int oilLevel;
    protected int waste;


    public VirtualPet(String name, String description, int hunger, int thirst, int boredom, int waste) {
        this.name = name;
        this.description = description;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.waste = waste;
        isAlive = true;

    }

    public VirtualPet(String name) {
        super();
    }

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
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

    public void cleanCages() {
        waste = 100;
        hunger -= 5;
        thirst -= 5;
        boredom -= 5;
        tick();
    }

    public void walkOrganic(String name) {
        boredom += 15;
        hunger -= 10;
        thirst -= 5;
        waste += 25;
        tick();
    }

    public void chargeBattery() {
        batteryLevel = 100;
        oilLevel -= 5;
        boredom -= 10;
        roboticTick();
    }

    public void oilRobotic() {
        batteryLevel -= 10;
        oilLevel = 100;
        boredom -= 10;
        roboticTick();
    }

    public void playWithRobotic(String name) {
        batteryLevel -= 10;
        oilLevel -= 10;
        boredom += 15;
        roboticTick();
    }

    public void walkRobotic(String name) {
        batteryLevel -= 20;
        oilLevel -= 20;
        boredom += 20;
        roboticTick();
    }

    public void tick() {
        hunger = Math.min(Math.max(hunger - 5, 0), 100);
        thirst = Math.min(Math.max(thirst - 5, 0), 100);
        boredom = Math.min(Math.max(boredom - 5, 0), 100);
        waste = Math.min(Math.max(waste - 5, 0), 100);
    }

    public void roboticTick() {
        batteryLevel = Math.min(Math.max(batteryLevel - 5, 0), 100);
        oilLevel = Math.min(Math.max(oilLevel - 5, 0), 100);
        boredom = Math.min(Math.max(boredom - 5, 0), 100);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getWaste() {
        return waste;
    }

    public boolean isAlive() {
        return true;
    }

}
