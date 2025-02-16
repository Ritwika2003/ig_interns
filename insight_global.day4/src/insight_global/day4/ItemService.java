package insight_global.day4;



import java.util.ArrayList;
import java.util.List;

public class ItemService {

    static List<Item> itemList = new ArrayList<>();

    // Method to add an item
    public String addItem(Item item) {
        itemList.add(item);
        return "Item added successfully.";
    }

    // Method to delete an item (currently returns 1, but can be extended)
    public int deleteItem(Item item) {
        if (itemList.remove(item)) {
            return 1;  // Success
        }
        return 0;  // Failure (item not found)
    }

    // Method to update an item (currently returns 1, but can be extended)
    public int updateItem(Item item) {
        for (int i = 0; i < itemList.size(); i++) {
            Item existingItem = itemList.get(i);
            if (existingItem.getId().equals(item.getId())) {
                itemList.set(i, item);  // Update item
                return 1;  // Success
            }
        }
        return 0;  // Failure (item not found)
    }

    // Method to list all items
    public void listItems() {
        if (itemList.isEmpty()) {
            System.out.println("No items available.");
        } else {
            itemList.forEach(item -> System.out.println(item));
        }
    }

    // Method to get an item by ID (returns a sample item for now)
    public Item getItem(Integer id) {
        for (Item item : itemList) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null; // Item not found
    }
}

