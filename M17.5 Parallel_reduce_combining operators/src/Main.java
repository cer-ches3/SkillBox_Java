import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*long start = System.currentTimeMillis();
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            strings.add(Double.toHexString(Math.random()));
        }
        long count = strings.stream()
                .filter(s -> {
                    String text = " ";
                    for (int i = 0; i <50; i++){
                        s+=text;
                    }
                    return text.contains("abcd");
                }).count();
        long duration = System.currentTimeMillis() - start;
        System.out.println("Sequential: " + duration);

        start = System.currentTimeMillis();
        count = strings.stream()
                .filter(s -> {
                    String text = " ";
                    for (int i = 0; i <50; i++){
                        s+=text;
                    }
                    return text.contains("abcd");
                }).count();

        duration = System.currentTimeMillis() - start;
        System.out.println("Parallel: " + duration);*/

        /*int [] numbers = {4,5,3};
        int result = Arrays.stream(numbers)
                .reduce(0, Integer::sum);
        System.out.println(result);*/


        Stream<Employee> employess = Stream.of(
                new Employee(100000, LocalDate.of(2020,12,4)),
                new Employee(120000, LocalDate.of(2022,10,3)),
                new Employee(170000, LocalDate.of(2023,11,10)),
                new Employee(205000, LocalDate.of(2022,7,4)),
                new Employee(140000, LocalDate.of(2023,4,25))
        );

        /*int sum = employess.filter(employee -> employee.getHidingDate().isBefore(LocalDate.now().minusYears(1)))
                .map(Employee::getSalary)
                .reduce(0, Integer::sum);
        System.out.println(sum);*/

        Optional<Employee> employee = employess
                .max(Comparator.comparing(Employee::getSalary));
        System.out.println(employee.get().getSalary());
    }
}
