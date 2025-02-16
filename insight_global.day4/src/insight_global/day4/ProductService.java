package insight_global.day4;



import java.util.ArrayList;
import java.util.List;

public class ProductService {
    
    // A list to store products (usually, this might be retrieved from a database or file)
    private List<Product> productList;

    public ProductService() {
        productList = new ArrayList<>();
        // Sample products (Normally, these would be loaded from a file or database)
        productList.add(new Product(1, "Product A", 10, 100.0));
        productList.add(new Product(2, "Product B", 20, 200.0));
        productList.add(new Product(3, "Product C", 30, 300.0));
    }

    // Get price by product ID
    public Double getPriceById(Integer id) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product.getPrice();
            }
        }
        return null; // If product not found
    }

    // Get Product object by ID
    public Product getProductById(Integer id) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null; // If product not found
    }

    // List all products
    public List<Product> listProducts() {
        return productList;
    }
}
