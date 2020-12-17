package iteration1;

public class iteration1 {
    public static void main(String[] args) throws Exception {
        PingPong ping = new PingPong("Ping", 2);
        PingPong pong = new PingPong("Pong", 2);

        ping.setPriority(2);
        pong.setPriority(10);

        ping.status();
        pong.status();

        pong.start();
        ping.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("# " + i + ", Ping - Pong: " + ping.iterationNumber() + "-" + pong.iterationNumber());
        }

        ping.status();
        pong.status();

        ping.interrupt();
        pong.interrupt();
    }
}
