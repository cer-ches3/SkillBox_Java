import java.time.LocalDateTime;

public class Main {
    /*public static void main(String[] args) {
        printCurrentDateTime();
    }
    public static void printCurrentDateTime(){
        System.out.println("Текущее время и дата: " + LocalDateTime.now());
    }*/

    public static int i = 0;
    public static int max = 10;
    public static  void iterate() {
        if (i < max) {
            i++;
            System.out.println(i);
            iterate();
        }
    }
    public static void main(String[] args) {
        iterate();
    }
}
