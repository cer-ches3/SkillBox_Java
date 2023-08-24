import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int  maxOnkomingSpeed = 30; //km/h
        int speedFineGrade = 20; //km/h
        int finePerGrade = 500; //rub
        int criminalSpeed = 180; //km/h


        System.out.println("Введите скорость автомобиля: ");
        int onkomingSpeed = new Scanner(System.in).nextInt();

        if (onkomingSpeed >= criminalSpeed){
            System.out.println("Вызываем полицию");
        }else if (onkomingSpeed > maxOnkomingSpeed){
            int overSpeed = onkomingSpeed - maxOnkomingSpeed;
            int gradesCount = overSpeed / speedFineGrade;
            int fine = finePerGrade * gradesCount;
            System.out.println("Сумма штрафа: " + fine);
        }else {
            System.out.println("Скорость не превышена");
        }
    }
}
