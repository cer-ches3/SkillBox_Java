import java.util.Scanner;

public class forCycle {
    public static void main(String[] args) {
        int value;

        System.out.println("Введите число: ");
        value = new Scanner(System.in).nextInt();

        for (int num1 = 1; num1 <= value; num1++){
            for (int num2 = 1; num2 <= value; num2++){
                if (num1 * num2 == value){
                    System.out.println(num1 + " * " + num2);
                }
            }
        }
    }
}
