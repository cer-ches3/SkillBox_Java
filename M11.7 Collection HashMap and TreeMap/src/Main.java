import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*HashMap<String, Car> cars = new HashMap<>();
        cars.put("A745PH69", new Car("A745PH69"));
        cars.put("A521KX69", new Car("A521KX69"));
        cars.put("A741MO69", new Car("A741MO69"));
        cars.put("P720PY69", new Car("P720PY69"));
        cars.put("P720PY69", new Car("новый P720PY69"));

        System.out.println(cars.get("P720PY69"));*/


        Basket basket = new Basket();
        basket.add(new Product("Хлеб", 50), 10);
        basket.add(new Product("Молоко", 75), 20);
        basket.add(new Product("Масло", 150), 10);
        basket.add(new Product("Молоко", 75), 30);

        System.out.println(basket);
    }
}
