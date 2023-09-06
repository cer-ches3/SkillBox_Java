public class Main {
    public static void main(String[] args) {
        /*ArithmeticCalculator calculator = new ArithmeticCalculator(5,2);
        System.out.println("Сложение: " + calculator.calculate(Operation.ADD));
        System.out.println("Вычитание: " + calculator.calculate(Operation.SUBTRACT));
        System.out.println("Умножение: " + calculator.calculate(Operation.MULTIPLY));*/


        Engine engine = new Engine(EngineType.DIESEL, 2.0, 156);
        Car car = new Car(engine, CarType.PICKUP, 2500);
        System.out.println("Тип автомобиля: " + car.getType() + "\n" +
                "Масса автомобиля: " + car.getWeight() + "\n" +
                car.getEngine()
                );
    }
}
