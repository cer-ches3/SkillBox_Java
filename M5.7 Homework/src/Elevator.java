public class Elevator {
    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor - 1;
    }

    public void moveUp() {
        currentFloor = currentFloor + 1;
    }

    public void move(int floor) {
        if (floor == currentFloor || floor > minFloor || floor < maxFloor) {
            System.out.println("Вы ввели некорректный этаж, повторите ввод!");
        }
        while (floor != currentFloor && currentFloor < maxFloor && currentFloor > minFloor) {
            if (floor > currentFloor) {
                moveUp();
                System.out.println("Текущий этаж: " + currentFloor);
            }
            if (floor < currentFloor) {
                moveDown();
                System.out.println("Текущий этаж: " + currentFloor);
            }
        }
    }
}
