public interface ElectricDevice {
    double getEnergyConsumption();
    void switchOn();
    void switchOff();
    boolean isSwitchedOn();
    default void toggle() {
        if (isSwitchedOn()){
            switchOff();
        }else {
            switchOn();
        }
    }
}