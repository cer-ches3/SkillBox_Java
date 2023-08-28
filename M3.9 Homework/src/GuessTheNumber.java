import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Угадай число, загаданное программой: ");
        int value = new Random().nextInt(100);

        int attempt = -1;

        while (attempt !=value){
            attempt = new Scanner(System.in).nextInt();

            if (attempt < value){
                System.out.println("Загаданное число больше");
            }
            if (attempt > value){
                System.out.println("Загаданное число меньше");
            }
        }
        System.out.println("Вы угадали!");


    }
}
