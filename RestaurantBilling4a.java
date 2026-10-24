import java.util.Scanner;

class Customer {
    String name;
    int table;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();
        System.out.print("Enter Table Number: ");
        table = sc.nextInt();
    }
}

class Bill extends Customer {
    void displayBill() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Food Price: ");
        int price = sc.nextInt();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        int total = 0;
        for (int i = 1; i <= qty; i++)
            total += price;

        System.out.println("\n--- Restaurant Bill ---");
        System.out.println("Customer Name: " + name);
        System.out.println("Table Number: " + table);
        System.out.println("Price: Rs." + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Bill: Rs." + total);
    }
}

public class RestaurantBilling4a{
    public static void main(String args[]) {
        Bill b = new Bill();
        b.getData();
        b.displayBill();
    }
}