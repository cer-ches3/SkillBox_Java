public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        for (int i = 0; i < 10; i++) {
            company.hire(new Operator(company));
        }
        for (int i = 0; i < 10; i++) {
            company.hire(new Manager(company));
        }
        for (int i = 0; i < 10; i++) {
            company.hire(new TopManager(company));
        }

        for (Employee employee : company.getEmployee()) {
            System.out.println(employee);
        }


        System.out.println("\nСамые высокие зарплаты: ");
        for (Employee top : company.getTopSalaryStaff(10)){
            System.out.println(top);
        }
        System.out.println("\nСамые низкие зарплаты: ");
        for (Employee low : company.getLowestSalaryStaff(10)){
            System.out.println(low);
        }


        int employeesCount = company.getEmployee().size();
        for (int i = 0; i < employeesCount / 2; i++) {
            company.fire(company.getEmployee().get(i));
        }

        System.out.println("\ndelete");
        for (Employee employee : company.getEmployee()) {
            System.out.println(employee);
        }
    }
}
