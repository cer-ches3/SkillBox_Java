public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

//        String str = "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
//            str += "some code some code some code";
            builder.append("some code some code some code");
        }
//        System.out.println("Длина строки: " + str.toString().length());
        System.out.println("Длина строки: " + builder.toString().length());
        System.out.println((System.currentTimeMillis() - start) + " ms");
    }
}