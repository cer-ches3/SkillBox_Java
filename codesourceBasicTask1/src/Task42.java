import java.io.Console;
import java.util.Scanner;

public class Task42 {
        public static void main(String[] args) {
            String currentPassword = "123@abc";
            while (true){
                System.out.println("Введите пароль: ");
                String enterPassword = new Scanner(System.in).nextLine();
                if (enterPassword.equals(currentPassword)){
                    System.out.println("Вы ввели правильный пароль");
                }else {
                    System.out.println("Вы ввели не правильный пароль");
                }
            }
        }
    }
