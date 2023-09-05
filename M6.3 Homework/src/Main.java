public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Milk", 109);
        Product product2 = new Product("Eggs", 170);
        System.out.println(Product.getCount());
        System.out.println(Product.getAveragePrice());

    }
}
