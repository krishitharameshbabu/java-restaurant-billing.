class Restaurant {

    // Access Specifier
    private String item;
    private int price;

    // Static Variable
    static String shopName = "ABC Restaurant";

    // Constructor
    Restaurant(String item, int price) {
        this.item = item;
        this.price = price;
    }

    // Static Method
    static void displayShop() {
        System.out.println("Welcome to " + shopName);
    }

    // Method Overloading
    void bill() {
        System.out.println("Item : " + item);
        System.out.println("Price: Rs " + price);
    }

    void bill(int quantity) {
        System.out.println("Item : " + item);
        System.out.println("Price: Rs " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: Rs " + (price * quantity));
    }
}

public class RestaurantBilling2 {

    public static void main(String[] args) {

        Restaurant.displayShop(); // Static Method

        Restaurant r = new Restaurant("Burger", 120);

        r.bill();      // Overloaded Method 1
        System.out.println();
        r.bill(3);     // Overloaded Method 2
    }
}