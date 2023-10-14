import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        /*HashSet<String> todoList = new HashSet<>();
        todoList.add("Купить молоко");
        todoList.add("Купить лошадь");
        todoList.add("Покормить кота");
        todoList.add("Купить лошадь");
        todoList.add("Купить молоко");

//        todoList.clear();

        *//*System.out.println(todoList.contains("купииваиукпув"));
        System.out.println(todoList.contains("Купить лошадь"));*//*

         *//*System.out.println(todoList.isEmpty());
        todoList.clear();
        System.out.println(todoList.isEmpty());*//*

//        todoList.remove("Купить лошадь");

        System.out.println(todoList.size());*/


        HashSet<Task> todoList = new HashSet<>();
        todoList.add(new Task ("Купить молоко"));
        todoList.add(new Task ("Купить лошадь"));
        todoList.add(new Task ("Покормить кота"));
        todoList.add(new Task ("Купить лошадь"));
        todoList.add(new Task ("Купить молоко"));

        for (Task item : todoList){
            System.out.println(item);
        }
    }
}