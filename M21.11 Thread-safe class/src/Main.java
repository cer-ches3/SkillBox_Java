import java.util.ArrayList;
import java.util.Vector;

public class Main {
    public static StringBuffer numbers = new StringBuffer();

    public static void main(String[] args) {
        ArrayList <Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            threads.add(new Thread(() -> {
                for (int j = 0; j < 100000; j++) {
                    numbers.append('1');
                }
                System.out.println(numbers.length());
            }));
        }
        threads.forEach(Thread::start);
    }
}
