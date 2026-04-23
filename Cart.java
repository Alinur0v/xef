import java.util.*;

public class Cart {
    private Map<Product, Integer> items = new HashMap<>();

    public void addProduct(Product product, int qty) {
        if (product.getQuantity() < qty) {
            System.out.println("Not enough stock!");
            return;
        }

        items.put(product, items.getOrDefault(product, 0) + qty);
        product.reduceQuantity(qty);

        System.out.println("Added to cart!");
    }

    public void showCart() {
        System.out.println("Cart:");
        for (Product p : items.keySet()) {
            System.out.println(p.getName() + " x " + items.get(p));
        }
    }

    public double getTotal() {
        double total = 0;
        for (Product p : items.keySet()) {
            total += p.getPrice() * items.get(p);
        }
        return total;
    }

    public void clearCart() {
        items.clear();
    }
}
