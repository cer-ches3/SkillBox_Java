public class Main {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        basket.toPay("Проверка платежа: ");

        basket.add("Молоко", 100, 2);
        basket.add("Хлеб", 25, 1);
        basket.add("Батон", 25, 1);
        basket.add("Яйца 1 дес.", 50, 3);
        basket.printListProduct("Содержимое корзины: ");
        basket.toPay("Проверка платежа: ");

        basket.add("Торт", 500, 1);
        basket.printListProduct("Содержимое корзины: ");
        basket.toPay("Проверка платежа: ");

    }
}
