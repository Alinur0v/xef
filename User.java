import java.util.*;

public class User {
    protected String name;
    protected double balance;
    protected Cart cart;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.cart = new Cart();
    }

    public void addToCart(Product product, int qty) {
        cart.addProduct(product, qty);
    }

    public void viewCart() {
        cart.showCart();
    }

    public void checkout() {
        double total = cart.getTotal();

        if (total > balance) {
            System.out.println("Not enough balance!");
            return;
        }

        balance -= total;
        cart.clearCart();

        System.out.println("Order successful! Remaining balance: " + balance);
    }
}
