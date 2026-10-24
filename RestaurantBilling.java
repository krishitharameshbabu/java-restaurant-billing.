class Restaurant {
    String item;
    int price;

    Restaurant(String item, int price) {
        this.item = item;
        this.price = price;
    }

    void bill(int quantity) {
        int total = price * quantity;

        System.out.println("----- BILL -----");
        System.out.println("Item     : " + item);
        System.out.println("Price    : Rs " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : Rs " + total);
    }
}

public class RestaurantBilling {
    public static void main(String[] args) {
        Restaurant r = new Restaurant("Burger", 120);
        r.bill(2);
    }
}