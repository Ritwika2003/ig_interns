package insight_global.day4;



import java.util.Scanner;

public class ItemTest {

    public static void main(String[] args) {
        ItemService itemService = new ItemService();
        Scanner scanner = new Scanner(System.in);

        // Display menu and take user choice for operations
        boolean running = true;
        while (running) {
            System.out.println("Select an operation:");
            System.out.println("1. Add Item");
            System.out.println("2. List Items");
            System.out.println("3. Delete Item");
            System.out.println("4. Update Item");
            System.out.println("5. Get Item by ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    // Add a new item
                    System.out.print("Enter item ID: ");
                    Integer id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    Item newItem = new Item(id, name);
                    System.out.println(itemService.addItem(newItem));
                    break;

                case 2:
                    // List all items
                    itemService.listItems();
                    break;

                case 3:
                    // Delete an item
                    System.out.print("Enter item ID to delete: ");
                    Integer deleteId = scanner.nextInt();
                    Item deleteItem = new Item(deleteId, "");  // Empty name for delete
                    int deleteResult = itemService.deleteItem(deleteItem);
                    if (deleteResult == 1) {
                        System.out.println("Item deleted successfully.");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 4:
                    // Update an item
                    System.out.print("Enter item ID to update: ");
                    Integer updateId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter new item name: ");
                    String updatedName = scanner.nextLine();
                    Item updateItem = new Item(updateId, updatedName);
                    int updateResult = itemService.updateItem(updateItem);
                    if (updateResult == 1) {
                        System.out.println("Item updated successfully.");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 5:
                    // Get an item by ID
                    System.out.print("Enter item ID to get: ");
                    Integer getId = scanner.nextInt();
                    Item foundItem = itemService.getItem(getId);
                    if (foundItem != null) {
                        System.out.println("Found item: " + foundItem);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 6:
                    // Exit the program
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}
