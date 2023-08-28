public class SwimmingPool {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;

        int volumeNow = 0;
        int increaseSpeed = fillingSpeed - devastationSpeed;
        int timeFilling = 0;
        int fillingValue = 0;

        while (fillingValue < volume) {
            fillingValue = fillingValue + increaseSpeed;
            timeFilling = timeFilling + 1;
            if (fillingValue == volume) {
                break;
            }
        }
        System.out.println("Бассейн наполнится через " + timeFilling + " минут");
    }
}
