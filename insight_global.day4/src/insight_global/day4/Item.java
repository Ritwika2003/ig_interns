package insight_global.day4;



public class Item {
    Integer id;
    String name;

    // Constructor
    public Item(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
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

    // Override toString for proper printing of object
    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + "]";
    }

    // Override hashCode for comparison based on id
    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    // Override equals for comparison based on id and name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item other = (Item) obj;
        return this.id.equals(other.id) && this.name.equals(other.name);
    }
}
