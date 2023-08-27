import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* int sum = 0;
        int value = -1;

        while (value != 0){
            value = new Scanner(System.in).nextInt();
            sum = sum + value;
        }
        System.out.println("Сумма введенных чисел равна: " + sum);*/

        int validPinCode = 7388;
        int pinCode = -1;

        while (pinCode != validPinCode){
            if (pinCode == -1){
                System.out.println("Введите пинкод");
            }else {
                System.out.println("Вы ввели неверный пароль, попробуйте снова");
            }
            pinCode = new Scanner(System.in).nextInt();
        }
        System.out.println("Вы ввели правильный пароль");
    }
}
