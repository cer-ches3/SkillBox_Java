import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//Массивы примитивов
        /*int[] numbers = {1,3,85,8,7,4};
        System.out.println(numbers.length);
        System.out.println(numbers[1]);

        numbers[5] = 400;
        System.out.println(numbers[5]);*/



        /*int[] floors = {3,10,17,22,16,14};
        floors[0] = 15;
        System.out.println(floors[0]);*/

//Создание пустого массива
        /*int[] numbers = new int[20];
        numbers[0] =15;*/

//Массивы объектов
        /*String[] words = new String[10];
        System.out.println(words[0]);

        LocalDate[] dates = {
                LocalDate.now().minusDays(1),
                LocalDate.now(),
                LocalDate.now().plusDays(1)
        };*/


//Метод, который возвращаем массив
        String text = "rgregre gr es rg greeg";
        String[] words = text.split("\s+");
    }
}
