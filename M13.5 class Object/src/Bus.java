import java.util.Objects;

public class Bus {
    private double tankFullnessRate;
    private final double consumptionRate;
    private static int count;

    public Bus(double consumptionRate) {
        this.consumptionRate = consumptionRate;
        count++;
    }

    public boolean run(int distance){
        if (powerReserve() < distance){
            return false;
        }
        tankFullnessRate = tankFullnessRate - (distance * consumptionRate);
        return true;
    }

    public final void refuel(double tankRate){
        double total = tankFullnessRate + tankRate;
        tankFullnessRate  = total > 1 ? 1 : total;
    }

    public int powerReserve() {
        return (int) (tankFullnessRate / consumptionRate);
    }

    public double getTankFullnessRate() {
        return tankFullnessRate;
    }

    public double getConsumptionRate() {
        return consumptionRate;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Double.compare(tankFullnessRate, bus.tankFullnessRate) == 0 && Double.compare(consumptionRate, bus.consumptionRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tankFullnessRate, consumptionRate);
    }
}