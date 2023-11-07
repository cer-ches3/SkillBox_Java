public class Operator implements Employee{
    private final int FIX_SALARY = 40_000;
    private int monthSalary = 0;

    public Operator(Company company) {
        monthSalary = FIX_SALARY;
    }

    @Override
    public int getMonthSalary() {
        return monthSalary;
    }

    @Override
    public String toString() {
        return getClass().getName() + " - Доход - " + getMonthSalary() + " руб.";
    }
}
