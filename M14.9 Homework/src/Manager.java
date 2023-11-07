public class Manager implements Employee {
    private final int FIX_SALARY = 50_000;
    private double monthSalary = 0;
    private final double BONUS = 0.05;
    private final double salaryForCompany;

    public Manager(Company company) {
        salaryForCompany = (Math.random() * 25_000) + 115_000;
        monthSalary += (int) FIX_SALARY + (salaryForCompany * BONUS);
    }

    @Override
    public int getMonthSalary() {
        return (int) monthSalary;
    }

    @Override
    public String toString() {
        return getClass().getName() + " - Доход - " + getMonthSalary() + " руб.";
    }
}