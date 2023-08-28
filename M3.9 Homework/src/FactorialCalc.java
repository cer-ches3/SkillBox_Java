import java.util.Scanner;

public class FactorialCalc {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int value = new Scanner(System.in).nextInt();

        int factorial = 1;

        for (int i = 1; i <= value; i++){
            factorial = factorial * i;
        }
        System.out.println(value + "! = " + factorial);
    }
}
