import java.util.*;

public class Order {
    private List<Product> products;
    private double totalPrice;

    public Order(List<Product> products, double totalPrice) {
        this.products = products;
        this.totalPrice = totalPrice;
    }

    public void showOrder() {
        System.out.println("Order details:");
        for (Product p : products) {
            System.out.println(p.getName());
        }
        System.out.println("Total: " + totalPrice);
    }
}
