import java.util.Scanner;

class Restaurant {
    void displayRestaurant() {
        System.out.println("Welcome to ABC Restaurant");
    }
}

class Billing extends Restaurant {
    void calculateBill(int quantity, double price) {
        double total = quantity * price;
        System.out.println("Total Bill: Rs." + total);
    }
}

public class RestaurantBilling9a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Billing b = new Billing();

        b.displayRestaurant();

        System.out.print("Enter item price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        b.calculateBill(quantity, price);
    }
}