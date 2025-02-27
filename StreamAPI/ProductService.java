package insight_global.StreamAPI;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ProductService {

    List<Product> productList;  // Assume this is populated with Product instances.

    // Constructor
    public ProductService(List<Product> productList) {
        this.productList = productList;
    }

    // List highest priced product
    public Optional<Product> getHighestPricedProduct() {
        return productList.stream()
                          .max(Comparator.comparing(Product::getPrice));
    }

    // List lowest priced product
    public Optional<Product> getLowestPricedProduct() {
        return productList.stream()
                          .min(Comparator.comparing(Product::getPrice));
    }

    // List products that have already expired
    public List<Product> getExpiredProducts() {
        LocalDate today = LocalDate.now();
        return productList.stream()
                          .filter(product -> product.getExpiryDate().isBefore(today))
                          .collect(Collectors.toList());
    }

    // List product names that will expire in the next 10 days
    public List<String> getProductsExpiringInNext10Days() {
        LocalDate today = LocalDate.now();
        LocalDate tenDaysLater = today.plusDays(10);
        return productList.stream()
                          .filter(product -> !product.getExpiryDate().isBefore(today) && product.getExpiryDate().isBefore(tenDaysLater))
                          .map(Product::getName)
                          .collect(Collectors.toList());
    }

    // Display count of products of different types
    public Map<String, Long> getProductTypeCount() {
        return productList.stream()
                          .collect(Collectors.groupingBy(Product::getType, Collectors.counting()));
    }
}
