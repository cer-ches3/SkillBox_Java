public class Employee {
    private String name;
    private String email = "не задан";
    private int numberPhone;

    public Employee(String name, String email, int numberPhone) {
        this.name = name;
        this.email = email;
        this.numberPhone = numberPhone;
    }
    public Employee(String name, int numberPhone) {
        this.name = name;
        this.numberPhone = numberPhone;
    }
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void printInfo() {
        System.out.println("\n" + "Имя пользователя: " + name + "\n"
                + "e-mail: " + email + "\n"
                + "Номер телефона: " + ((numberPhone > 0) ? numberPhone : "не указан"));
    }
}
