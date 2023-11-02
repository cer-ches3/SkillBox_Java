import java.util.Scanner;

/*Напишите программу на Java и вычислите сумму цифр целого числа.
        Входные данные:
        Введите целое число: 25
        Ожидаемый результат

        Сумма цифр: 7*/
public class task33 {
    public static void main(String[] args) {
       while (true){
           System.out.println("Введите целое число: ");
           int input = new Scanner(System.in).nextInt();
           System.out.println("Сумма чисел равна: " + sumDigits(input));
       }
    }

    public static int sumDigits(int input) {
        int sum = 0;
        while (input != 0) {
            sum += input % 10;
            input /= 10;
        }
        return sum;
    }
}
