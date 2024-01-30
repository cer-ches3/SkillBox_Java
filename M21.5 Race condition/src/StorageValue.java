import java.util.concurrent.atomic.AtomicInteger;

public class StorageValue {
    //private static int value;
    private static AtomicInteger value = new AtomicInteger();

    public static void incrementValue(){
        //value += value;
        value.incrementAndGet();
    }

    public static int getValue() {
        //return value;
        return value.intValue();
    }
}
