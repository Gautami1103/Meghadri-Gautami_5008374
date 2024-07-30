import java.util.Arrays;
import java.util.Comparator;
public class Main
{
    public static Product linearSearch(Product[] products, String productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String productId) {
        Arrays.sort(products, Comparator.comparing(Product::getProductId));
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midProductId = products[mid].getProductId();

            if (midProductId.equals(productId)) {
                return products[mid];
            } else if (midProductId.compareTo(productId) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Create some Product objects
        Product product1 = new Product("P1", "Product 1", "Category A");
        Product product2 = new Product("P2", "Product 2", "Category B");
        Product product3 = new Product("P3", "Product 3", "Category A");

        // Create a Product array
        Product[] products = {product1, product2, product3};

        // Linear Search
        String productIdToSearch = "P2";
        Product foundProduct = linearSearch(products, productIdToSearch);
        if (foundProduct != null) {
            System.out.println("Linear Search Found: " + foundProduct);
        } else {
            System.out.println("Linear Search Not Found");
        }
        // Binary Search (requires sorted array)
        // Sort the array based on productId
        Arrays.sort(products, Comparator.comparing(Product::getProductId));

        productIdToSearch = "P3";
        Product foundProduct1 = binarySearch(products, productIdToSearch);
        if (foundProduct1 != null) {
            System.out.println("Binary Search Found: " + foundProduct1);
        } else {
            System.out.println("Binary Search Not Found");
        }
    }
}
