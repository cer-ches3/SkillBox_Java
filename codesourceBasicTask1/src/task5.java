/*Напишите программу Java, которая принимает два числа в качестве входных данных и отображает произведение двух чисел.
        Тестовые данные:
        Введите первое число: 25
        Введите второе число: 5
        Ожидаемый результат :
        25 х 5 = 125*/

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("Введите 1 число: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Введите 2 число: ");
        int num2 = new Scanner(System.in).nextInt();
        int multiply = num1 * num2;
        System.out.println(multiply);


    }
}
