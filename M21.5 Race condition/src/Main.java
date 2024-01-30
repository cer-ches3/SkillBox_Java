public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++){
            new Thread(()-> {
                for (int j = 0; j < 10000000; j++) {
                    StorageValue.incrementValue();
                }
                System.out.println(StorageValue.getValue());
            }).start();
        }
    }
}
