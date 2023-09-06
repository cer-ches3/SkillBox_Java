public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    private static int totalCountProducts = 0;
    private static int totalPriceAllProducts = 0;
    private static int basketCount;


    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
        basketCount = basketCount + 1;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public static int getCount(){
        return count;
    }
    public void add(String name, int price) {
        add(name, price, 1, 0);
    }
    public static void calcTotalCountProducts(int count){
        totalCountProducts = totalCountProducts + count;
    }
    public static void calcTotalPrice(int priсe){
        totalPriceAllProducts = totalPriceAllProducts + priсe * count;
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }
        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;
        calcTotalCountProducts(count);
        calcTotalPrice(price);

    }

    public static int getTotalCountProducts() {
        return totalCountProducts;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public static int getTotalPriceAllProducts() {
        return totalPriceAllProducts;
    }
    public static int calcPriceAverage(){
        if(totalPriceAllProducts == 0 || totalCountProducts == 0){
            System.out.println("вы забыли добавить продукты в козину");
            return 0;
        }
        return totalPriceAllProducts / totalCountProducts;
    }

    public static int getBasketCount() {
        return basketCount;
    }


    public static int calcPriceAverageOneBasket(){
        if(totalPriceAllProducts == 0 || basketCount == 0){
            System.out.println("похоже вы забыли положить продукты в корзину " +
                    "или создать корзину");
            return 0;
        }
        return totalPriceAllProducts / basketCount;
    }


}
