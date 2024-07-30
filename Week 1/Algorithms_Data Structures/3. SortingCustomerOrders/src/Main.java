import java.util.*;
public class Main
{
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    // Swap orders[j] and orders[j+1]
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }
    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() <= pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    public static void main(String[] args)
    {
        // Create some Order objects
        Order order1 = new Order(1, "Alice", 100.0);
        Order order2 = new Order(2, "Bob", 200.0);
        Order order3 = new Order(3, "Charlie", 50.0);

        // Create an array of orders
        Order[] orders = {order1, order2, order3};

        // Bubble Sort
        bubbleSort(orders);
        System.out.println("Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Quick Sort
        // Create a copy of the original array for Quick Sort
        Order[] ordersCopy = Arrays.copyOf(orders, orders.length);
        quickSort(ordersCopy, 0, ordersCopy.length - 1);
        System.out.println("\nQuick Sort:");
        for (Order order : ordersCopy) {
            System.out.println(order);
        }
    }
}