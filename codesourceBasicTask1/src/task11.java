/*Напишите Java-программу для печати области и периметра круга.
        Тестовые данные:
        Радиус = 7,5
        Ожидаемый результат
        Периметр = 47.12388980384689
        Площадь = 176.71458676442586*/

public class task11 {
        public static void main(String[] args) {
            double radius = 7.5;
            double perimetr = 2 * Math.PI * radius;
            double area = Math.PI * Math.pow(radius, 2);

            System.out.println("Периметр: " + perimetr);
            System.out.println("Площадь: " + area);



    }
}
