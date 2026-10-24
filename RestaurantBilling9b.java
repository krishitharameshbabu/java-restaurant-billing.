import java.util.Scanner;

interface Bill {
    void calculateBill(int quantity, double price);
}

class Restaurant implements Bill {
    public void calculateBill(int quantity, double price) {
        double total = quantity * price;
        System.out.println("Total Bill: Rs." + total);
    }
}

public class RestaurantBilling9b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Restaurant r = new Restaurant();

        System.out.print("Enter item price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        r.calculateBill(quantity, price);
    }
}