public abstract class Employees {
    protected int monthSalary = 0;
    protected int fixSalary = 0;


    public Employees(Company company) {
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public String toString() {

        return getClass().getName() + " - Доход - " + getMonthSalary() + " руб.";
    }
}

