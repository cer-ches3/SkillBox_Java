import java.util.Scanner;

/*Напишите программу на Java, чтобы вычислить расстояние между двумя точками на поверхности земли.
        Расстояние между двумя точками [(x1, y1) & (x2, y2)]
        d = радиус * arccos (sin (x1) * sin (x2) + cos (x1) * cos (x2) * cos (y1 - y2))
        Радиус земли r = 6371.01 Километров
        Входные данные:
        Введите широту координаты 1: 25
        Введите долготу координаты 1: 35
        Введите широту координаты 2: 35,5
        Введите долготу координаты 2: 25,5
        Ожидаемый результат

        Расстояние между этими точками: 1480.0848451069087 км*/
public class Task36 {
    public static void main(String[] args) {
       while (true){
           System.out.println("Введите широту координаты 1: ");
           double x1 = new Scanner(System.in).nextDouble();
           System.out.println("Введите долготу координаты 1: ");
           double y1 = new Scanner(System.in).nextDouble();
           System.out.println("Введите широту координаты 2: ");
           double x2 = new Scanner(System.in).nextDouble();
           System.out.println("Введите долготу координаты 2: ");
           double y2 = new Scanner(System.in).nextDouble();
           System.out.println("Расстояние между этиими точсками: " + getDistance(x1, y1, x2, y2));
       }
    }
    public static double getDistance(double x1, double y1, double x2, double y2) {
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        final double RADIUS_EDGE = 6371.01;
        double distance = RADIUS_EDGE * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        return distance;
    }
}
