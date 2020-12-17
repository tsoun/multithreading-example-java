package producer_consumer;

public class ware {
    String characteristic;
    int number;

    public ware(String string, int integer) {
        characteristic = string;
        number = integer;
    }

    public String print() {
        return ("Ware ID (" + characteristic + " " + number + ")");
    }
}
