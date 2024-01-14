import java.time.LocalDate;

public class Employee {
    private int salary;
    private LocalDate hidingDate;

    public Employee(int salary, LocalDate hidingDate) {
        this.salary = salary;
        this.hidingDate = hidingDate;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getHidingDate() {
        return hidingDate;
    }
}
