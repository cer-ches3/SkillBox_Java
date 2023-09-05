import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Elevator elevator = new Elevator(-3, 26);
        while (true){
            System.out.println("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }*/


        Dimensions dimensions = new Dimensions(1.80, 0.70, 2.5);
        СargoProperties cargo = new СargoProperties(dimensions, 8.4, "г. Бежецк", "142VJ67X", true, false);
        System.out.println(cargo);
    }
}
