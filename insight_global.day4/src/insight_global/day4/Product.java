package insight_global.day4;


public class Product {
    private Integer id;
    private String name;
    private Integer qty;
    private Double price;

    // Constructor
    public Product(Integer id, String name, Integer qty, Double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    // Getter and Setter methods
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // toString method to print product details
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
    }
}

