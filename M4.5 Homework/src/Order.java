public class Order {
    private int count = 0;
    private int totalCost = 0;

    public void addProducts(int productsCount, int cost) {
        count = count + productsCount;
        totalCost = totalCost + (cost * productsCount);
    }
    public int getProductCount(){
        return count;
    }
    public int getTotalCost(){
        return totalCost;
    }
}
