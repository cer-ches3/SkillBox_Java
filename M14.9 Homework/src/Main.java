public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        for (int i = 1; i <= 10; i++){
            company.hire(new Operator(company));
        }
        for (int i = 1; i <= 10; i++){
            company.hire(new Manager(company));
        }
        for (int i = 1; i <= 10; i++){
            company.hire(new TopManager(company));
        }
        for (Employee e : company.getEmployee()){
            System.out.println(e);
        }
        System.out.println("Доход компании: " + company.getIncome());
    }
}
