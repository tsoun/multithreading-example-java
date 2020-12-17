package iteration2;

public class PingPongRunnable implements Runnable {
    String name;

    public PingPongRunnable(String str) {
        name = str;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + (i + 1)
                    + "th iteration of PingPongRunnable - " + this.name + ".");
        }
    }
}
