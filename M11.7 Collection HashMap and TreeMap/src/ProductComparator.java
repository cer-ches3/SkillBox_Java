import java.util.Comparator;

public class ProductComparator implements Comparator <Product>{
    @Override
    public int compare(Product product1, Product product2) {
        return -Integer.compare(product1.getPrice(),
                product2.getPrice());
    }
}
