import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("Слово 1: ");
            String str1 = new Scanner(System.in).nextLine();
            System.out.println("Слово 2: ");
            String str2 = new Scanner(System.in).nextLine();
            boolean isEquals = str1.equals(str2);

            if (isEquals == true){
                System.out.println(str1 + " = " + str2);
            }else{
                System.out.println(str1 + " != " + str2);
            }
        }
    }
}
