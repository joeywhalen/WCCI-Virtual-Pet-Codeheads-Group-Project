package virtual_pet;

public class RoboticPet extends VirtualPet {
    protected int batteryLevel;
    protected int oilLevel;


    public RoboticPet (String name) {
        super(name);
        this.batteryLevel = batteryLevel;
        this.oilLevel = oilLevel;

    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }
}
