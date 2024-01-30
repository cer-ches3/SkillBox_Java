import java.util.ArrayList;

public class Main {
    public static ArrayList<Double> numbers = new ArrayList<>();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(Main::someMethod));
        }
        threads.forEach(thread -> thread.start());
    }

    public static  void someMethod() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            double value = Math.random() / Math.random();
            synchronized (numbers) {
                numbers.add(value);
            }
        }
        System.out.println(numbers.size() + " - " + (System.currentTimeMillis() - start));
        numbers.clear();
    }
}
