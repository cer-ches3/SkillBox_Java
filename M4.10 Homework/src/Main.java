public class Main {
    public static void main(String[] args) {
        /*Arithmetic calc = new Arithmetic(15, 10);
        calc.sum();
        calc.multiply();
        calc.minValue();
        calc.maxValue();*/

        Basket basket1 = new Basket();
        basket1.add("Молоко", 40, 1.2);
        basket1.add("Картофель", 25, 2, 2.5);
        basket1.print("Корзина 1");
        System.out.println("Общая стоимость товаров в корзине: " + basket1.getTotalPrice());
        System.out.println("Общий вес корзины: " + basket1.getTotalWeight());
    }
}
