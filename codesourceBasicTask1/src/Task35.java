import java.util.Scanner;

/*Напишите программу на Java для вычисления площади многоугольника.
        Площадь многоугольника = (n * s ^ 2) / (4 * tan (π / n))
        где n - это n-сторонний многоугольник, а s - длина стороны
        Входные данные:
        Введите количество сторон на многоугольнике: 7
        Введите длину одной из сторон: 6
        Ожидаемый результат

        Площадь составляет: 130.82084798405722*/
public class Task35 {
    public static void main(String[] args) {
        while (true){
            System.out.println("Введите количество углов многоугольника: ");
            int n = new Scanner(System.in).nextInt();
            System.out.println("Введите длину сторон многоугольника: ");
            double s = new Scanner(System.in).nextInt();
            System.out.println("Площадь " + n + "-иугольника со сторонами " + s + " см. равна: " + polygone(n, s));
        }
    }
    public static double polygone(int n, double s) {
        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
        return area;
    }

}
