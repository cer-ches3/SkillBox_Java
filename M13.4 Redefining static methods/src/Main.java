public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus(0.001);
        Bus bus2 = new Bus(0.001);
        Bus bus3 = new Bus(0.001);
        ElectricBus ebus1 = new ElectricBus(0.001, 0.1);
        ElectricBus ebus2 = new ElectricBus(0.001, 0.1);

        System.out.println("Количество автобусов " + Bus.getCount());
        System.out.println("Количество электробусов " + ElectricBus.getCount());
    }
}
