import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        sortBySalaryAndAlphabet(staff);
//        staff.stream().filter(employee -> employee.getSalary() >= 100000).forEach(System.out ::println);

        /*Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10);
        numbers.filter(number -> number % 2 == 0).forEach(System.out :: println);*/

        /*Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(numbers).filter(number -> number % 2 == 0).forEach(System.out :: println);*/

//        Stream.iterate(1, n -> n + 1).forEach(System.out::println);

//        Stream.generate(() -> "aaa").forEach(System.out::print);

//        staff.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

        staff.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
        staff.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);


    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.
        staff.sort(((o1, o2) -> {
            int comparison = o1.getSalary().compareTo(o2.getSalary());
            if (comparison == 0) {
                return o1.getName().compareTo(o2.getName());
            };
            return comparison;
        }));
    }
}