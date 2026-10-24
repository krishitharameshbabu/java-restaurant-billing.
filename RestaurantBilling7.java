package restaurant;

import java.util.Scanner;

public class RestaurantBilling7 {

    void calculateBill(int quantity, double price) {
        double total = quantity * price;

        System.out.println("Welcome to ABC Restaurant");
        System.out.println("Item Price: Rs." + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: Rs." + total);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RestaurantBilling7 r = new RestaurantBilling7();

        System.out.print("Enter item price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        r.calculateBill(quantity, price);
    }
}