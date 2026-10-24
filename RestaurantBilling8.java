import java.util.Scanner;

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String message) {
        super(message);
    }
}

class Restaurant {
    void generateBill(int quantity, double price) throws InvalidQuantityException {
        if (quantity <= 0) {
            throw new InvalidQuantityException("Quantity must be greater than 0");
        }

        double total = quantity * price;
        System.out.println("Total Bill: Rs." + total);
    }
}

public class RestaurantBilling8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Restaurant r = new Restaurant();

        System.out.print("Enter item price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        try {
            r.generateBill(quantity, price);
        } catch (InvalidQuantityException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}