package producer_consumer;

public class producer implements Runnable {
    volatile boolean active;
    storage warehouse;
    String iString;
    int i;

    public producer(storage warehouse) {
        this.warehouse = warehouse;
        active = true;
        i = 0;
    }

    @Override
    public void run() {
        while (active) {
            iString = String.valueOf(i) + " / ";
            if (warehouse.empty()) {
                warehouse.push(new ware(iString, i));
                System.out.println(
                        "PRODUCER successfully placed " + warehouse.lastElement().print() + " into the warehouse.\n");
            } else {
                System.out.println("PRODUCER cannot sell item, came too early. Warehouse full.\n");
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
