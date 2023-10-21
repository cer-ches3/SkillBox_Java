import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] colors = {"Черный", "Белый", "Зеленый", "Красный"};
        ArrayList<String> colorsList = new ArrayList<>();

        //Преобразование массива в список перебором
        for (String color : colors){
            colorsList.add(color);
        }

        /*//Переобразование массива в список одним действием
        colorsList.addAll(Arrays.asList(colors));*/

        for (String result : colorsList){
            System.out.println(result);
        }

        //Преобразовние списка в массив перебором
        String[] newColors = new String[colorsList.size()];
        for (int i = 0; i < newColors.length; i++){
            newColors[i] = colorsList.get(i);
        }
        System.out.println();
        System.out.println(Arrays.toString(newColors));

    }
}
