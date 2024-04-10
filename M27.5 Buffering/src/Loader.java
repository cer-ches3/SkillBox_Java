import java.io.FileOutputStream;
import java.io.IOException;

public class Loader {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        FileOutputStream writer = new FileOutputStream("data/numbers.txt");

        char letters[] = {'У','К','Е','Н','Х','В','Ф','Р','О','С','М','Т'};
        StringBuilder builder = new StringBuilder();
        for (int codeRegion = 1; codeRegion < 100; codeRegion++) {
            for (int number = 1; number < 1000; number++) {
                for (char firstLetter : letters) {
                    for (char secondsLetter : letters) {
                        for (char thirdLetter : letters) {
                            builder.append(firstLetter)
                                    .append(padNumber(number, 2))
                                    .append(secondsLetter)
                                    .append(thirdLetter)
                                    .append(padNumber(codeRegion, 2))
                                    .append("\n");

                            if (builder.length() > 1024) {
                                writer.write(builder.toString().getBytes());
                                builder = new StringBuilder();
                            }
                        }
                    }
                }
            }
        }
        writer.flush();
        writer.close();
        System.out.println((System.currentTimeMillis() - start) + " ms");
    }

    public static String padNumber (int number, int numberLength) {
        String numberStr = Integer.toString(number);
        int padSize = numberLength - numberStr.length();
        for (int i = 0; i < padSize; i++) {
            numberStr = '0' + numberStr;
        }
        return numberStr;
    }
}
