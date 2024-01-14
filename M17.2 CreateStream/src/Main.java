import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*List<Double> list = List.of(1d,2d, 3d);
        Stream<Double> stream = list.stream();
        stream.forEach(System.out::println);*/

        /*double[] array = {1.2,3.6,7.2};
        DoubleStream stream = Arrays.stream(array);
        stream.forEach(System.out::println);*/

        Stream<Double> stream = Stream.generate(Math::random).limit(10);
        stream.forEach(System.out::println);

    }
}