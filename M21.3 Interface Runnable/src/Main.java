import java.io.File;

public class Main {
    public static void main(String[] args) {
        String srcFolder = "/home/sergey/Изображения/src/";
        String dstFolder = "/home/sergey/Изображения/dst/";
        int newWidth = 300;
        long start = System.currentTimeMillis();

        File srcDir = new File(srcFolder);
        File[] files = srcDir.listFiles();
        int middle = files.length / 2;

        File[] files1 = new File[middle];
        System.arraycopy(files, 0, files1, 0, files1.length);
        ImageResizer resizer1 = new ImageResizer(files1, newWidth, dstFolder, start);
        new Thread(resizer1).start();

        File[] files2 = new File[files.length - middle];
        System.arraycopy(files, middle, files2, 0, files2.length);
        ImageResizer resizer2 = new ImageResizer(files2, newWidth, dstFolder, start);
        new Thread(resizer2).start();

        new Thread(() -> {
            long s = System.currentTimeMillis();
            int sum;
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
            }
            System.out.println("Код выполнен за: " + (System.currentTimeMillis() - s));
        }).start();
    }
}
