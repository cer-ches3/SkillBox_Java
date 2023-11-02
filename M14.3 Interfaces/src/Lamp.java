public class Lamp extends LightDevice{


    public Lamp(int power) {
        super(power);
    }
    @Override
    public double getEnergyConsumption() {
        return power * brightness;
    }
}