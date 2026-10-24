import java.util.Scanner;

class Welcome {
    int foodQty, drinkQty;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Food Quantity: ");
        foodQty = sc.nextInt();
        System.out.print("Enter Drink Quantity: ");
        drinkQty = sc.nextInt();
    }
}

class Food extends Welcome {
    int foodBill() {
        return foodQty * 200;
    }
}

class Drink extends Welcome {
    int drinkBill() {
        return drinkQty * 100;
    }
}

public class RestaurantBilling4b{
    public static void main(String args[]) {
        Food f = new Food();
        f.input();

        Drink d = new Drink();
        d.drinkQty = f.drinkQty;

        System.out.println("Food Bill = Rs." + f.foodBill());
        System.out.println("Drink Bill = Rs." + d.drinkBill());
        System.out.println("Total Bill = Rs." + (f.foodBill() + d.drinkBill()));
    }
}