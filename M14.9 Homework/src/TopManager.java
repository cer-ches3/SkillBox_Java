public class TopManager implements Employee{
    private final int FIX_SALARY = 60_000;
    private double monthSalary = 0;
    private final double BONUS = 1.5;
    private final double salaryCompany;

    public TopManager(Company company) {
        salaryCompany = company.getIncome();
    }

    @Override
    public int getMonthSalary() {
        if (salaryCompany >= 10_000_000){
            monthSalary = (int) FIX_SALARY + (FIX_SALARY * BONUS);
        }
        else {
            monthSalary = FIX_SALARY;
        }
        return (int) monthSalary;
    }

    @Override
    public String toString() {
        return getClass().getName() + " - Доход - " + getMonthSalary() + " руб.";
    }
}

