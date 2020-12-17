public class PingPong extends Thread {
    String word;
    int delay, iter;

    public PingPong(String word_p, int pause) {
        word = word_p;
        delay = pause;
    }

    public int iterationNumber() {
        return iter;
    }

    public void run() {
        try {
            for (iter = 0;; iter++) {
                System.out.println(word + "-" + iter + " ");
                sleep(delay);
            }
        } catch (InterruptedException e) {
            return;
        }
    }

    public void status() {
        System.out.println(this.word + " status: " + this.isAlive());
    }
}
