public class Main {
    public static void main(String[] args) {

        Basket basket1 = new Basket();
        basket1.add("Молоко", 150, 2, 2);
        basket1.add("Хлеб", 30, 1, 2);

        Basket basket2 = new Basket();
        basket2.add("Яйца", 120, 1, 2);
        basket2.add("Масло", 170, 2, 3);

        System.out.println("Общая сумма товаров: " + Basket.getTotalPriceAllProducts() + " руб.");
        System.out.println("общее колличество продуктов " + Basket.getTotalCountProducts() + " шт");
        System.out.println("средняя стоимость товара составит: " + Basket.calcPriceAverage() + " руб.");
        System.out.println("средняя стоимость корзины составит: " + Basket.calcPriceAverageOneBasket() + " руб.");

    }
}
