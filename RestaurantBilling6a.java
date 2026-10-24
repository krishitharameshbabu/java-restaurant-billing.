import java.util.Scanner;

abstract class Restaurant {
    abstract void bill(int price, int quantity);
}

class Food extends Restaurant {
    void bill(int price, int quantity) {
        System.out.println("----- BILL -----");
        System.out.println("Price    : Rs " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : Rs " + (price * quantity));
    }
}

public class RestaurantBilling6a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price: ");
        int price = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        Restaurant r = new Food();
        r.bill(price, quantity);
    }
}