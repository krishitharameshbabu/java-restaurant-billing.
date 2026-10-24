import java.util.Scanner;

interface Bill {
    void calculate(int price, int quantity);
}

interface Discount {
    void discount(int total);
}

class Restaurant implements Bill, Discount {
    public void calculate(int price, int quantity) {
        int total = price * quantity;
        System.out.println("----- BILL -----");
        System.out.println("Price    : Rs " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : Rs " + total);
    }

    public void discount(int total) {
        System.out.println("Discount : Rs " + (total * 10 / 100));
    }
}

public class RestaurantBilling6b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price: ");
        int price = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        Bill b = new Restaurant();
        b.calculate(price, quantity);

        Discount d = new Restaurant();
        d.discount(price * quantity);
    }
}