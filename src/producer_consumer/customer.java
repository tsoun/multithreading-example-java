package producer_consumer;

public class customer implements Runnable {
    volatile boolean active;
    storage warehouse;
    String iString;
    int i;

    public customer(storage warehouse) {
        active = true;
        this.warehouse = warehouse;
        i = 0;
    }

    @Override
    public void run() {
        while (active) {
            iString = String.valueOf(i);
            try {
                System.out.println(
                        "CONSUMER successfully bought " + warehouse.lastElement().print() + " from the warehouse.\n");
                warehouse.pull();
            } catch (java.util.NoSuchElementException e) {
                System.out.println("CONSUMER cannot buy product, came too early.\n");
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}