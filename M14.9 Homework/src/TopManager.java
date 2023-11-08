public class TopManager extends Employees
        implements Employee {
    private final double bonus;
    Company company = new Company();
    private int salaryCompany = company.getIncome();

    public TopManager(Company company) {
        super(company);
        fixSalary = 60_000;
        bonus = 1.5;
        monthSalary = (salaryCompany >= 10_000_000) ? (int) (fixSalary + (fixSalary * bonus)) : fixSalary;
    }
}