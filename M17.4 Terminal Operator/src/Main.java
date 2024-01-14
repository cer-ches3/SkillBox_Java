import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*Stream.of("skillbox", "java", "art")
                .distinct()
                .forEach(x -> System.out.println("->" + x));*/

        /*long count = Stream.of("skillbox", "java", "art")
                .count();
        System.out.println(count);*/

        /*Optional<String> shorttest = Stream.of("skillbox", "java", "art")
                .min(Comparator.comparing(String::length));
        System.out.println(shorttest);*/

        /*List<Integer> collections = Stream.of(100,25,15,100)
                .map(i -> i*3)
                .collect(Collectors.toList());
        System.out.println(collections);*/

        /*Map<String, Person> map = Stream.of(
                        new Person("1"),
                        new Person("2"),
                        new Person("3")
                )
                .collect(Collectors.toMap(Person::getPhone, person -> person));
        map.forEach((s, person) -> System.out.println(s + " - " + person));*/

        /*Map<Integer, List<Person>> map = Stream.of(
                        new Person("1"),
                        new Person("2"),
                        new Person("3"),
                        new Person("22"),
                        new Person("33")
                )
                .collect(Collectors.groupingBy(person -> person.getPhone().length()));
        map.forEach((integer, people) -> System.out.println(integer + " - " + people));*/

        /*Map<String, Long> map = Stream.of(
                "a","b","a","c","b","c","a"
        )
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((s, aLong) -> System.out.println(s + " - " + aLong));*/

        boolean hasMoreThem10 = Stream.of(1,2,3,4,5)
                .anyMatch(integer -> integer > 10);
        System.out.println(hasMoreThem10);

    }
}