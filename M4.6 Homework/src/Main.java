public class Main {
    /*public static void main(String[] args) {
        User sergey = new User("Сергей", 27);
        User sofya = new User("Софья", 26);
        User maxim = new User("Максим", 6);

        printInfo(sergey);
        printInfo(sofya);
        printInfo(maxim);
    }
    public static void printInfo(User user){
        System.out.println("Пользователь: " + user.getName() + ", возраст: " + user.getAge());
    }*/

    public static void main(String[] args) {
        Employee sergey = new Employee("Сергей", "serg@ya.ru", 1234);
        Employee sofya = new Employee("Софья", "seofya@ya.ru");
        Employee maxim = new Employee("Максим", 1234);

        sergey.printInfo();
        sofya.printInfo();
        maxim.printInfo();

    }
}
