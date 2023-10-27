public class ElectricBus extends Bus{
    private final double minimalTAnkFullnessRate;

    public ElectricBus(double consumptionRate, double minimalTAnkFullnessRate) {
        super(consumptionRate);
        this.minimalTAnkFullnessRate = minimalTAnkFullnessRate;
    }
}
