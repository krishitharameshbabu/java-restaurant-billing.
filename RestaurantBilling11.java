class Restaurant {

    private final Object billing = new Object();
    private final Object payment = new Object();

    void processBill() {
        synchronized (billing) {
            System.out.println("Billing resource locked.");

            synchronized (payment) {
                System.out.println("Payment resource locked.");
                System.out.println("Bill processed successfully.");
            }

            System.out.println("Payment resource released.");
        }

        System.out.println("Billing resource released.");
    }
}

class Billing extends Thread {

    Restaurant r;

    Billing(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.processBill();
    }
}

class Payment extends Thread {

    Restaurant r;

    Payment(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.processBill();
    }
}

public class RestaurantBilling11 {

    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        Billing b = new Billing(r);
        Payment p = new Payment(r);

        b.start();
        p.start();
    }
}