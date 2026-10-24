class Restaurant {

    int bill = 0;
    boolean ready = false;

    synchronized void generateBill(int amount) {
        bill = amount;
        ready = true;

        System.out.println("Bill Generated: Rs." + bill);
        System.out.println("Bill is ready for printing.");

        notify();
    }

    synchronized void printBill() {
        while (!ready) {
            try {
                System.out.println("Waiting for bill...");
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Bill Printed: Rs." + bill);
        System.out.println("Thank you for visiting!");
    }
}

class Billing extends Thread {

    Restaurant r;

    Billing(Restaurant r) {
        this.r = r;
    }

    public void run() {
        System.out.println("Billing process started.");
        r.generateBill(500);
    }
}

class Printer extends Thread {

    Restaurant r;

    Printer(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.printBill();
    }
}

public class RestaurantBilling10 {

    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        Printer p = new Printer(r);
        Billing b = new Billing(r);

        p.start();
        b.start();
    }
}