import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*Stream.of(1,2,3,4,5)
                .map(i -> i*2)
                .forEach(System.out::println);*/

        /*Stream.of(1,2,3,4,5,6,7,8,9)
                .filter(number -> number % 3 == 0)
                .forEach(System.out::println);*/

        /*Stream.of("one, two, three", "four, five, six", "seven, eight, nine")
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .forEach(System.out::println);*/

        /*Stream.of(1,2,3,4,5,6,7,8,9,9,7,4)
                .distinct()
                .forEach(System.out::println);*/

        Stream.of("skillbox", "javacoding", "art")
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}