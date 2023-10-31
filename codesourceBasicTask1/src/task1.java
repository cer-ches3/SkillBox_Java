        /*Напишите программу на Java,которая напечатает «Hello» на экране,
        а затем напечатайте свое имя в отдельной строке.
        Ожидаемый результат:
        Привет Александра Абрамова*/

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        String input = new Scanner(System.in).nextLine();
        System.out.println("Привет " + input);

    }
}
