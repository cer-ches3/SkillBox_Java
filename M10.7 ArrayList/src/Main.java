import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*int winnerRate = 100;
        int certCount = 1000;
        int [] certNumbers = new int [certCount];
        ArrayList <Integer> winnerCert = new ArrayList<>();
        for (int i = 0; i < certNumbers.length; i++){
            certNumbers[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
            if (i % winnerRate == 0) {
                winnerCert.add(certNumbers[i]);
            }
        }
        for (Integer winnerNumber : winnerCert){
            System.out.println(winnerNumber);
        }*/


        /*ArrayList <Task> taskList = new ArrayList<>();
        taskList.add(new Task("Купить молока", "5 пакетов"));
        taskList.add(new Task("Покормить кота", "Новым кормом"));
        taskList.add(new Task("Сжеч секретное", "Особенно в синей сумке"));
        taskList.add(0, new Task("Очень срочная задача!!!", "!!!"));
        taskList.remove(1);
        taskList.set(1, new Task("Не кормить кота", "Он уже ел"));

        for (Task task : taskList){
            System.out.println(task);
        }*/


        System.out.println("Преобразование массива в список");

        Integer[] numbers = {10, 20, 30, 40};
        ArrayList <Integer> values = new ArrayList<>();
        values.addAll(Arrays.asList(numbers));

        for (Integer value : values){
            System.out.println(value);
        }

        System.out.println("\nПреобразование списка в массив");

        Integer[] nums = values.toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));
    }
}
