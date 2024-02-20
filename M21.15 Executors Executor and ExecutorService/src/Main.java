import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        /*Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            for (;;) {
                System.out.println(Math.random());
            }
        });*/

        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Double> future = service.submit(() -> {
            double sum = 0;
            for (int i = 0; i < 100000; i++) {
                sum += Math.random();
            }
            return sum;
        });
        try {
            System.out.println(future.get());
            service.shutdown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
