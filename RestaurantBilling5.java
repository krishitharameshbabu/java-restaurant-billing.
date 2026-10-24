import java.util.Scanner;

class Restaurant {
    void bill(int price, int quantity) {
        System.out.println("Restaurant Bill");
        System.out.println("Total: Rs " + (price * quantity));
    }
}

class Food extends Restaurant {
    @Override
    void bill(int price, int quantity) {
        System.out.println("Food Bill");
        System.out.println("Price: Rs " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: Rs " + (price * quantity));
    }
}

public class RestaurantBilling5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price: ");
        int price = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        Food f = new Food();
        f.bill(price, quantity);
    }
}