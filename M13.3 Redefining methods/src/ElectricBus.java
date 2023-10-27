public class ElectricBus extends Bus{
    private final double minimalTAnkFullnessRate;

    public ElectricBus(double consumptionRate, double minimalTAnkFullnessRate) {
        super(consumptionRate);
        this.minimalTAnkFullnessRate = minimalTAnkFullnessRate;
    }

    @Override
    public int powerReserve() {
        double remainingRate = getTankFullnessRate() - minimalTAnkFullnessRate;
        if (remainingRate < 0) {
            return 0;
        }
        return (int) (remainingRate / getConsumptionRate());
    }
}