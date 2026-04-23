import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        Admin admin = new Admin("Admin", 0);

        // default products
        admin.addProduct(products, new Product("IPhone", 500000, 5));
        admin.addProduct(products, new Product("Samsung", 300000, 10));

        User user = new User("Ali", 600000);

        while (true) {
            System.out.println("\n1. Show Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("0. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    admin.showAllProducts(products);
                    break;

                case 2:
                    admin.showAllProducts(products);
                    System.out.print("Enter product index: ");
                    int index = sc.nextInt();

                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    if (index >= 0 && index < products.size()) {
                        user.addToCart(products.get(index), qty);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 3:
                    user.viewCart();
                    break;

                case 4:
                    user.checkout();
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}
