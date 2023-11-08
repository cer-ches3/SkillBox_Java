public class Operator extends Employees
        implements Employee{

    public Operator(Company company) {
        super(company);
        fixSalary = 40_000;
        monthSalary = fixSalary;
    }
}
