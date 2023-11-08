import java.util.*;

public class Company {
    public int income;

    private static final ArrayList<Employee> employee = new ArrayList<>();

    public Company() {
        new ArrayList<String>();
    }

    public int getIncome() {
        for (Employee emp : employee) {
            if (emp instanceof Manager) {
                income += ((Manager) emp).getSalaryForCompany();
            }
        }
        return income;
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
        List<Employee> topSalary = new ArrayList<>();
        Collections.sort(employee, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getMonthSalary() - o1.getMonthSalary();
            }
        });
        for (int i = 0; i < count; i++) {
            topSalary.add(employee.get(i));
        }
        return topSalary;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        List<Employee> topSalary = new ArrayList<>();
        Collections.sort(employee, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getMonthSalary() - o2.getMonthSalary();
            }
        });
        for (int i = 0; i < count; i++) {
            topSalary.add(employee.get(i));
        }
        return topSalary;
    }

    public ArrayList<Employee> getEmployee() {
        return employee;
    }
}