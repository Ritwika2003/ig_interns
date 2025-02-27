package insight_global.StreamAPI;

import java.time.LocalDate;

public class Product {
    Integer id;
    String name;
    String type;  // ex: dairy, pulses, spices, oils, snacks
    Double qty;
    Double price;
    LocalDate expiryDate;

    // Constructor
    public Product(Integer id, String name, String type, Double qty, Double price, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.qty = qty;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Double getQty() {
        return qty;
    }

    public Double getPrice() {
        return price;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    // toString for better representation of products (optional but useful)
    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', type='" + type + "', price=" + price + ", expiryDate=" + expiryDate + "}";
    }
}
