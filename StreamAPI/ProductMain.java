package insight_global.StreamAPI;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        // Sample data
        List<Product> products = Arrays.asList(
                new Product(1, "Milk", "dairy", 10.0, 20.0, LocalDate.of(2025, 3, 5)),
                new Product(2, "Sugar", "pulses", 15.0, 50.0, LocalDate.of(2025, 2, 25)),
                new Product(3, "Oil", "oils", 20.0, 40.0, LocalDate.of(2025, 3, 3)),
                new Product(4, "Chips", "snacks", 5.0, 5.0, LocalDate.of(2025, 2, 15))
        );

        ProductService productService = new ProductService(products);

        // Example method calls with null check for Optional
        productService.getHighestPricedProduct().ifPresent(product ->
                System.out.println("Highest Priced Product: " + product.getName()));

        productService.getLowestPricedProduct().ifPresent(product ->
                System.out.println("Lowest Priced Product: " + product.getName()));

        System.out.println("Expired Products: " + productService.getExpiredProducts());

        System.out.println("Products Expiring in Next 10 Days: " + productService.getProductsExpiringInNext10Days());

        System.out.println("Product Type Counts: " + productService.getProductTypeCount());
    }
}
