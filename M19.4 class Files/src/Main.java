import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(Paths.get("data/text.txt"));
            lines.forEach(line -> builder.append(line + "\n"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println(builder.toString());
    }
}
