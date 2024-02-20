public class Main {
    public static void main(String[] args) {
        Thread thread = new Timer();
//        Thread interrupter = new Thread(new Interrupter(thread));

        thread.start();
//        interrupter.start();
    }
}
