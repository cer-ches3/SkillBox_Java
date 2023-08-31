public class ProductBasket {
    private static String product = "";
    private static int totalPrice = 0;
    private static int countProductInBasket = 0;
    private static int balance = 500;

    public static void main(String[] args) {
        toPay("Проверка платежа: ");

        add("Молоко", 100, 2);
        add("Хлеб", 25, 1);
        add("Батон", 25, 1);
        add("Яйца 1 дес.", 50, 3);
        printListProduct("Содержимое корзины: ");
        toPay("Проверка платежа: ");

        add("Торт", 500, 1);
        printListProduct("Содержимое корзины: ");
        toPay("Проверка платежа: ");



    }

    public static void add(String name, int price, int count) {
        product = product + "\n" + name + " - " + price + " руб.," + " количество: " + count + " шт.";
        countProductInBasket = countProductInBasket + count;
        totalPrice = totalPrice + (price * count);
    }

    public static void printListProduct(String title) {
        System.out.println("\n" + title);
        if (product.isEmpty()) {
            System.out.println("Корзина пуста!");
        }
        System.out.println(product);
        System.out.println("\n" + "Количество товаров в корзине: " + countProductInBasket +
                "\n" + "Общая стоимость товаров в корзине: " + totalPrice);
    }

    public static void clear() {
        product = "";
        countProductInBasket = 0;
        totalPrice = 0;
    }

    public static void toPay(String title) {
        System.out.println("\n" + title);
        if (totalPrice > balance && product != "") {
            System.out.println("На вашем балансе недостаточно средств для оплаты покупки");
        } else if (product.isEmpty()) {
            System.out.println("Ваша корзина пуста, оплата невозможна!");
        } else {
            balance = balance - totalPrice;
            System.out.println("Оплата покупки прошла успешно!" + "\n"
                    + "Текущий баланс: " + balance);
            clear();
        }
    }

    public static void topBalance(int sumTop){

    }

}
