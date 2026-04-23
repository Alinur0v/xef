import java.util.*;

public class Admin extends User {

    public Admin(String name, double balance) {
        super(name, balance);
    }

    public void addProduct(List<Product> products, Product p) {
        products.add(p);
        System.out.println("Product added!");
    }

    public void showAllProducts(List<Product> products) {
        for (Product p : products) {
            p.display();
        }
    }
}
