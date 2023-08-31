public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addProducts(5, 100);
        order.addProducts(2, 75);
        System.out.println("Количесво товаров в корзине: " + order.getProductCount() + "\n"
        + "Общая стоимость товаров в корзине: " + order.getTotalCost());
    }
}
