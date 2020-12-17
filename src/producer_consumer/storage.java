package producer_consumer;

import java.util.Stack;

public class storage extends Stack<ware> {
    private static final long serialVersionUID = 838659373084238890L;

    public void pull() {
        if (!this.empty()) {
            this.lastElement().print();
            this.pop();
        } else {
            System.out.println("Empty storage.");
        }
    }
}
