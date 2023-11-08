public class Manager extends Employees
        implements Employee {
    private final double bonus;
    private final double salaryForCompany;

    public Manager(Company company) {
        super(company);
        fixSalary = 50_000;
        bonus = 0.05;
        salaryForCompany = (Math.random() * 25_000) + 115_000;
        monthSalary += fixSalary + (salaryForCompany * bonus);
    }

    public double getSalaryForCompany() {
        return salaryForCompany;
    }
}