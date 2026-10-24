import java.util.Scanner;

class Restaurant {
    String item;
    int price;

    // Constructor
    Restaurant(String item, int price) {
        this.item = item;
        this.price = price;
    }

    // Method
    void bill(int quantity) {
        int total = price * quantity;

        System.out.println("\n----- BILL -----");
        System.out.println("Item     : " + item);
        System.out.println("Price    : Rs " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : Rs " + total);
    }
}

public class RestaurantBilling3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- MENU -----");
        System.out.println("1. Burger - Rs 120");
        System.out.println("2. Pizza  - Rs 250");

        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        Restaurant r;

        if (choice == 1) {
            r = new Restaurant("Burger", 120);
        } else if (choice == 2) {
            r = new Restaurant("Pizza", 250);
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        r.bill(quantity);

        sc.close();
    }
}