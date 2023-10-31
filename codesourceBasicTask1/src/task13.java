/*Напишите Java-программу для печати площади и периметра прямоугольника.
        Тестовые данные:
        Ширина = 5,6 Высота = 8,5
        Ожидаемый результат
        Площадь 5,6 * 8,5 = 47,60
        Периметр 2 * (5,6 + 8,5) = 28,20*/
public class task13 {
    public static void main(String[] args) {
        double width = 5.6;
        double height = 8.5;
        double area = width * height;
        double perimetr = (width + height)*2;

        System.out.println("Площадь: " + area);
        System.out.println("Перметр: " + perimetr);
    }
}
