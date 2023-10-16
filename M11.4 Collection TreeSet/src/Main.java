import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        /*TreeSet<String> todoList = new TreeSet<>();
        todoList.add("Купить молоко");
        todoList.add("Купить лошадь");
        todoList.add("Покормить кота");
        todoList.add("Сделать домашнее задание");
        todoList.add("Позвонить");

        for (String item : todoList) {
            System.out.println(item);
        }*/

        TreeSet<Task> todoList = new TreeSet<>(new TaskComparator()  );
        todoList.add(new Task("Купить молоко"));
        todoList.add(new Task("Купить лошадь"));
        todoList.add(new Task("Покормить кота"));
        todoList.add(new Task("Сделать домашнее задание"));
        todoList.add(new Task("Позвонить"));

        for (Task item : todoList) {
            System.out.println(item);
        }

        System.out.println("__________________________");
        System.out.println(todoList.ceiling(new Task("купить мол")));
        System.out.println(todoList.floor(new Task("сделать домаш")));
        System.out.println(todoList.contains(new Task("сделать домашнее задание")));
        System.out.println(todoList.first());
        System.out.println(todoList.last());
    }
}