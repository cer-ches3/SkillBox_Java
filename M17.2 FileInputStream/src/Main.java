import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        try{
            FileInputStream is = new FileInputStream("data/text.txt");
            for (;;){
                int code = is.read();
                if (code < 0){
                    break;
                }
                char ch = (char) code;
                builder.append(ch);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(builder.toString());
    }
}
