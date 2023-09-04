import java.util.Scanner;

public class Calculator {
    private static int a;
    private static int b;
    private static String operation;
    private static int result;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите первое число: ");
            a = new Scanner(System.in).nextInt();

            System.out.println("Введите второе число: ");
            b = new Scanner(System.in).nextInt();

            System.out.println("Введите символ операции (+ - * / ): ");
            operation = new Scanner(System.in).nextLine();
            if (operation != "+"){
                System.out.println("Вы ввели некорректный символ операции");
            }
            switch (operation){
                case "+" -> { sum();}
                case "-" -> { difference();}
                case "*" -> { multiply();}
                case "/" -> { divide();}
            }
        }
    }

    public static void sum() {
        result = a + b;
        System.out.println("Сумма чисел " + a + " и " + b + " равна: " + result);
    }
    public static void difference() {
        result = a - b;
        System.out.println("Разность чисел " + a + " и " + b + " равна: " + result);
    }
    public static void multiply() {
        result = a * b;
        System.out.println("Произведение чисел " + a + " и " + b + " равно: " + result);
    }
    public static void divide() {
        result = a / b;
        System.out.println("Частное чисел " + a + " и " + b + " равно: " + result);
    }

}
