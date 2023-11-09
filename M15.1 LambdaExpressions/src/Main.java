import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {
    private static String staffFile = "data/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";
    public static void main(String[] args)
    {
        ArrayList<Employee> staff = loadStaffFromFile();
        Collections.sort(staff, Comparator.comparing(Employee::getSalary));
        /*System.out.println("Старый список");
        staff.forEach(System.out :: println);

        staff.forEach(e -> e.setSalary(e.getSalary() + 10000)
        );

        System.out.println("\nНовый список");
        staff.forEach(System.out :: println);*/

        /*Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10);
        numbers.filter(number -> number % 2 == 0).forEach(System.out :: println);*/

        /*Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(numbers).filter(number -> number % 2 == 0).forEach(System.out :: println);*/

//        Stream.iterate(1, n -> n + 1).forEach(System.out::println);

//        Stream.generate(() -> "aaa").forEach(System.out::print);

//        staff.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

/*        staff.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
        staff.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);*/

        staff.stream()
                .map(e -> e.getSalary())
                .filter(s -> s >= 100000)
                .reduce((s1,s2) -> s1 + s2)
                .ifPresent(System.out::println);
    }
    private static ArrayList<Employee> loadStaffFromFile() {
        ArrayList<Employee> staff = new ArrayList<>();
        try
        {
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for (String line : lines)
            {
                String[] fragments = line.split("\t");
                if (fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(
                        fragments[0],
                        Integer.parseInt(fragments[1]),
                        (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                ));
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }
}