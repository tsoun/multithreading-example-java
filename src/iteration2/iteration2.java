package iteration2;

public class iteration2 {
    public static void main(String[] args) throws Exception {
        Thread ping = new Thread(new PingPongRunnable("Ping"), "1");
        Thread pong = new Thread(new PingPongRunnable("Pong"), "2");

        ping.setPriority(2);
        pong.setPriority(10);

        pong.start();
        ping.start();
    }
}
