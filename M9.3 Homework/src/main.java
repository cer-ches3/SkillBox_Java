import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        while (true){
            System.out.println("Введите число 1: ");
            String firstNumberStr = new Scanner(System.in).nextLine();
            System.out.println("Введите символ операции: ");
            String operationSymbol = new Scanner(System.in).nextLine();
            System.out.println("Введите число 2: ");
            String secondsNumberStr = new Scanner(System.in).nextLine();
            int result = 0;

            int firstNumber = Integer.parseInt(firstNumberStr);
            int secondsNumber = Integer.parseInt(secondsNumberStr);

            switch (operationSymbol){
                case "+"  -> result = firstNumber + secondsNumber;
                case "-"  -> result = firstNumber - secondsNumber;
                case "*"  -> result = firstNumber * secondsNumber;
                case "/"  -> result = firstNumber / secondsNumber;
                default -> {return;}
            }
            System.out.println(firstNumber + " " + operationSymbol + " "+ secondsNumber + " = " + result);
        }
    }
}
