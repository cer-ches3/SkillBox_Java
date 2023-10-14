import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*//Преобразование в строку, сортировка
        int[]values = {2,4,12,-4,289};
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));*/

        /*//Сравнение массивов
        int[] a = {5,6,7};
        int[] b = {5,6,7};
        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.compare(a,b));*/

        /*//Копирование части массива
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] firstValues = Arrays.copyOf(values, 5);
        System.out.println(Arrays.toString(firstValues));
        int[] fragment = Arrays.copyOfRange(values, 2,5);
        System.out.println(Arrays.toString(fragment));*/

        //Заполнение массива значением
        int[] values = new int[20];
        Arrays.fill(values,-1);
        System.out.println(Arrays.toString(values));
    }
}
