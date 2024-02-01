public class Parking {
    private int parkingSize = 500;
    private int carCount = 0;

    public synchronized void in() {
        if (carCount == parkingSize) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        carCount++;
        System.out.println("Автомобиль добавлен!");
        System.out.println("Свободных мест: " + (parkingSize - carCount));
        notify();
    }

    public synchronized void out() {
        if (carCount == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        carCount--;
        System.out.println("Автомобиль добавлен!");
        System.out.println("Свободных мест: " + (parkingSize - carCount));
        notify();
    }
}
