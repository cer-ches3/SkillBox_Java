public class Main {
    public static void main(String[] args) {
        final Friend vasya = new Friend("vasya");
        final Friend vitya = new Friend("vitya");

        new Thread(()-> vasya.throwBallTo(vitya)).start();
        new Thread(()-> vitya.throwBallTo(vasya)).start();
    }
}
