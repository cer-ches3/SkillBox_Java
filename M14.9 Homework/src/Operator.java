public class Operator implements Employee{
    private final int FIX_SALARY = 40_000;
    private int monthSalary = 0;



    @Override
    public int getMonthSolary() {
        monthSalary += FIX_SALARY;
        return monthSalary;
    }
}
