import java.util.Scanner;

public class TruckAndContainer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boxes = scanner.nextInt();

        int numberContainer = 0;
        int numberTruck = 0;
        int BOXES_PER_CONTAINER = 27;
        int CONTAINER_PER_TRACK = 12;

        for (int i = 0; i < boxes; i++){
            if (i % (BOXES_PER_CONTAINER * CONTAINER_PER_TRACK) == 1){
                numberTruck++;
                System.out.println("Грузовик: " + numberTruck);
            }
            if (i % CONTAINER_PER_TRACK == 1){
                numberContainer++;
                System.out.println("\tКонтейнер: " + numberContainer);
            }
            System.out.println("\t\tЯщик: " + i);
        }
        System.out.println("Необходимо для " + boxes + " ящ." + System.lineSeparator() +
                "Грузовиков: " + numberTruck + " шт." + System.lineSeparator() +
                "Контейнеров: " + numberContainer + " шт.");
    }
}
