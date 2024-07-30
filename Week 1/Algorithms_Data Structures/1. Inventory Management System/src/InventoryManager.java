import java.util.HashMap;
import java.util.Map;

public class InventoryManager
{
    private Map<String, Product> inventory;
    public InventoryManager() {
        inventory = new HashMap<>();
    }
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }
    public void updateProduct(String productId, Product updatedProduct) {
        if (inventory.containsKey(productId)) {
            inventory.put(productId, updatedProduct);
        } else {
            System.out.println("Product not found.");
        }
    }
    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found.");
        }
    }
    public Product getProduct(String productId) {
        return inventory.get(productId);
    }
    public void displayAllProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        // Create an InventoryManager object
        InventoryManager inventoryManager = new InventoryManager();

        // Create some Product objects
        Product product1 = new Product("P123", "Shirt", 10, 19.99);
        Product product2 = new Product("ABC456", "Jeans", 5, 34.50);
        Product product3 = new Product("XYZ789", "Hat", 20, 12.95);

        // Add products to the inventory
        inventoryManager.addProduct(product1);
        inventoryManager.addProduct(product2);
        inventoryManager.addProduct(product3);

        // Display all products in the inventory
        System.out.println("Inventory:");
        inventoryManager.displayAllProducts();

        // Update product quantity
        String updateProductId = "P123";
        int newQuantity = 15;
        Product updatedProduct = new Product(updateProductId, product1.getProductName(), newQuantity, product1.getPrice());
        inventoryManager.updateProduct(updateProductId, updatedProduct);

        // Display updated inventory
        System.out.println("\nInventory after update:");
        inventoryManager.displayAllProducts();

        // Delete a product
        String deleteProductId = "ABC456";
        inventoryManager.deleteProduct(deleteProductId);

        // Display inventory after deletion
        System.out.println("\nInventory after deletion:");
        inventoryManager.displayAllProducts();

        // Get a specific product
        String findProductId = "XYZ789";
        Product foundProduct = inventoryManager.getProduct(findProductId);
        if (foundProduct != null) {
            System.out.println("\nProduct found:");
            System.out.println(foundProduct);
        } else {
            System.out.println("\nProduct not found with ID: " + findProductId);
        }
    }
}