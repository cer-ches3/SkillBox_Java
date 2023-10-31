/*Напишите программу на Java, которая принимает число в качестве входных данных и печатает свою таблицу умножения до 10.
        Тестовые данные:
        Введите число: 8
        Ожидаемый результат :
        8 х 1 = 8
        8 х 2 = 16
        8 х 3 = 24
        ...
        8 х 10 = 80*/

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        System.out.println("На какое число вывести таблицу умнжения? ");
        int input = new Scanner(System.in).nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(input + " * " + i + " = " + (input * i));
        }
    }
}
