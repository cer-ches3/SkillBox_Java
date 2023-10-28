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
}