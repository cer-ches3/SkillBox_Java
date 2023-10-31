import java.util.Scanner;

/*Напишите программу на Java для сравнения двух чисел. Перейти к редактору
        Входные данные:
        Введите первое целое число: 25
        Введите второе целое число: 39
        Ожидаемый результат

        25! = 39
        25 <39
        25 <= 39*/
public class task32 {
    public static void main(String[] args) {
        while (true){
            System.out.println("Число 1: ");
            int num1 = new Scanner(System.in).nextInt();
            System.out.println("Число 2: ");
            int num2 = new Scanner(System.in).nextInt();
            if (num1 == num2){
                System.out.println("Числа "+ num1 + " и " + num2 +" равны");
            }
            if (num1 > num2){
                System.out.println(num1 + " > " + num2);
            }
            if (num1 < num2){
                System.out.println(num1 + " < " + num2);
            }
        }
    }
}
