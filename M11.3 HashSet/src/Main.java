import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        /*HashSet<Task> todoList = new HashSet<>();
        todoList.add(new Task ("Купить молоко"));
        todoList.add(new Task ("Купить лошадь"));
        todoList.add(new Task ("Покормить кота"));
        todoList.add(new Task ("Купить лошадь"));
        todoList.add(new Task ("Купить молоко"));

        for (Task item : todoList){
            System.out.println(item);
        }*/

        HashSet<Task> todoList = new HashSet<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            Task task = new Task("Некая задача " + (int) (1000 * Math.random()));
            todoList.add(task);
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(Task.getEqualsCount());
    }
}
