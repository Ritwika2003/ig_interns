package insight_global.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.List;

public class IODemo {

    public static void main(String[] args) {
        // Create a ProductService instance
        ProductService productService = new ProductService();

        String filePath = "C:\\Users\\RitwikaGhosh\\OneDrive - Insight Global, LLC\\Desktop\\Java\\item.txt"; // You can update this to a valid path

        // Try to read the file
        try (BufferedReader b = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read and print lines from the file
            while ((line = b.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file " + filePath + " was not found. Please check the file path.");
            e.printStackTrace(); // Print the exception stack trace for debugging
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace(); // Print the exception stack trace for debugging
        }

        // Example: Fetch a product and perform operations
        Integer productIdToSearch = 10; // Example: Let's say we need the product with ID 10

        // Get the price by product ID
        Double price = productService.getPriceById(productIdToSearch);
        if (price != null) {
            System.out.println("Price of Product with ID " + productIdToSearch + ": " + price);
        } else {
            System.out.println("Product not found with ID " + productIdToSearch);
        }

        // Get the product details by ID
        Product product = productService.getProductById(productIdToSearch);
        if (product != null) {
            System.out.println("Product Details: " + product);
        } else {
            System.out.println("Product not found with ID " + productIdToSearch);
        }

        // List all products
        System.out.println("\nAll Products:");
        List<Product> products = productService.listProducts();
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
