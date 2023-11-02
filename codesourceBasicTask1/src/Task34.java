import java.util.Scanner;

/*Напишите программу на Java для вычисления площади шестиугольника.
        Площадь шестиугольника = (6 * с ^ 2) / (4 * загар (π / 6))
        где s - длина стороны
        Входные данные:
        Введите длину стороны шестиугольника: 6
        Ожидаемый результат

        Площадь шестиугольника: 93.53074360871938*/
public class Task34 {
    public static void main(String[] args) {
        while (true){
            System.out.println("Введите длину стороны многоугольника: ");
            double s = new Scanner(System.in).nextInt();
            System.out.println("Площадь 6тиугольника: " + areaHexagon(s));
        }
    }
    public static double areaHexagon(double s){
        double area = 6 * (Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
        return area;
    }
}
