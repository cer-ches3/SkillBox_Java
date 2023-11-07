import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {
    public int income = 0;

    private static final ArrayList<Employee> employee = new ArrayList<>();

    public Company() {
        new ArrayList<String>();
    }

    public void hire(Employee employee) {
        Company.employee.add(employee);
    }

    public ArrayList<Employee> hireAll(Employee employee, int count) {
        for (int i = 0; i < count; i++) {
            Company.employee.add(employee);
        }
        return Company.employee;
    }

    public void fire(Employee employee) {
        Company.employee.remove(employee);
    }

    public List<Employee> getTopSalaryStaff(int count) {
       return null;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        return null;
    }

    public List<Employee> getEmployee() {
        return employee;
    }
    public int getIncome() {
        for (Employee employees : employee){
            if (employees instanceof TopManager){
                income += ((TopManager)employees).getMonthSalary();
            }
            if (employees instanceof Manager){
                income += ((Manager)employees).getMonthSalary();
            }
            if (employees instanceof Operator){
                income += ((Operator)employees).getMonthSalary();
            }
        }
        return income;
    }
}