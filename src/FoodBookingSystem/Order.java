package FoodBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;
    private User user; // Order belongs to a user
    private List<FoodItem> items;

    // Constructor
    public Order(int orderId, User user) {
        this.orderId = orderId;
        this.user = user;
        this.items = new ArrayList<>();
    }

    // Add item to order
    public void addItem(FoodItem item) {
        items.add(item);
        System.out.println("Item added successfully");
    }

    // Calculate total price
    public int calculateTotal() {
        int total = 0;

        for (FoodItem item : items) {
            total += item.getPrice() * item.getQuantity();
        }

        return total;
    }

    // Place order
    public void placeOrder() {
        System.out.println("Order placed by " + user.getName());
        System.out.println("Total: " + calculateTotal());
    }
}