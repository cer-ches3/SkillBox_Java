import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*try {
            PrintWriter writer = new PrintWriter("data/file.txt");
            for (int i = 0; i < 1000; i++) {
                writer.write(i + "\n");
            }
            writer.flush();
            writer.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }*/

        try {
            ArrayList<String> strings = new ArrayList<>();
            for (int i = 0; i < 1000; i++) {
                strings.add(Integer.toString(i));
            }
            Files.write(Paths.get("data/file2.txt"), strings);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
