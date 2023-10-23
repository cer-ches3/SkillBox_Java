import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Красный");
        colors.add("Зеленый");
        colors.add("Синий");
        colors.add("Желтый");

        Iterator<String> iterator = colors.iterator();
        while(iterator.hasNext()){
            String color = iterator.next();
            System.out.println(color);
            if (color.equals("Зеленый")){
                iterator.remove();
            }
        }
        System.out.println("\nИтог: ");
        for (String color : colors){
            System.out.println(color);
        }
    }
}
