public class ProductBasket {
    private String product = "";
    private int totalPrice = 0;
    private int countProductInBasket = 0;
    private int balance = 500;

    public void add(String name, int price, int count) {
        product = product + "\n" + name + " - " + price + " руб.," + " количество: " + count + " шт.";
        countProductInBasket = countProductInBasket + count;
        totalPrice = totalPrice + (price * count);
    }

    public void printListProduct(String title) {
        System.out.println("\n" + title);
        if (product.isEmpty()) {
            System.out.println("Корзина пуста!");
        }
        System.out.println(product);
        System.out.println("\n" + "Количество товаров в корзине: " + countProductInBasket +
                "\n" + "Общая стоимость товаров в корзине: " + totalPrice);
    }

    public void clear() {
        product = "";
        countProductInBasket = 0;
        totalPrice = 0;
    }

    public void toPay(String title) {
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
}
