import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("Введите сообщение: ");
            String input = new Scanner(System.in).nextLine();

            switch (input){
                case "Привет" -> System.out.println("Привет!)");
                case "Как дела?" -> {
                    System.out.println("Отлично!при");
                    System.out.println("Как твои?)");
                }
                default -> System.out.println("Я не поняла, повтори!");
            }
        }
    }
}
