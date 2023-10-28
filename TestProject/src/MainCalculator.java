import java.util.Arrays;
import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        char operation;
        while(true) {
            System.out.println("Ввод в формате a+b: ");
            String enter = new Scanner(System.in).nextLine();
            enter = Arrays.toString(enter.split("['+''-''/''*']"));
            String[] arrayEnter = new String[] {enter};
            num1 = Integer.parseInt(arrayEnter[0]);
            num2 = Integer.parseInt(arrayEnter[1]);
            System.out.println(num1);
            System.out.println(num2);


        }
    }
}
