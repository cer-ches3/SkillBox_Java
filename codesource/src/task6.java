/*Напишите Java-программу для печати суммы (сложения), умножения, вычитания, деления и остатка двух чисел.
Тестовые данные:
Введите первое число: 125
Введите второе число: 24
Ожидаемый результат :
125 + 24 = 149
125 - 24 = 101
125 х 24 = 3000
125/24 = 5
125 мод 24 = 5*/

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        System.out.println("Введите 1 число: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Введите 2 число: ");
        int num2 = new Scanner(System.in).nextInt();
        int sum = num1 + num2;
        int difference = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        int remains = num1 % num2;
        System.out.println(sum +"\n" +
                difference +"\n" +
                multiply +"\n" +
                divide +"\n" +
                remains);
    }
}
