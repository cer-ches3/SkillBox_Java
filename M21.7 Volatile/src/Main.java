import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        new Thread(task).start();

        System.out.println("Нажмите Enter: ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        task.stop();
        System.out.println("Main: " + task.getCounter());

    }
}
