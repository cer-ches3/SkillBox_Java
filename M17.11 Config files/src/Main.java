import java.io.FileOutputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("timeout", "3600");
        properties.setProperty("cacheSize", "10000");

        try {
            properties.store(new FileOutputStream("data/config.properties", "fwq"));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
