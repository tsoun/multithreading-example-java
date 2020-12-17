package producer_consumer;

public class app {
    private static final int High = 10;
    private static final int Low = 1;
    static storage warehouse;
    static customer customer;
    static producer producer;

    public static void main(String[] args) throws Exception {
        warehouse = new storage();
        customer = new customer(warehouse);
        producer = new producer(warehouse);

        Thread Buying = new Thread(customer);
        Thread Producing = new Thread(producer);

        Buying.setPriority(Low);
        Producing.setPriority(High);

        Buying.start();
        Producing.start();
    }
}