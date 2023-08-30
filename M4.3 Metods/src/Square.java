import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.println("Введите число и нажмите <Enter>: ");
        double value = new Scanner(System.in).nextDouble();
        square(value);
    }
    public static void square(double value){
        System.out.println(value * value);
    }
}
