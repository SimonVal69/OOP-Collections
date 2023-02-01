package servicies;

import transport.Transport;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> queue;

    public ServiceStation() {
        this.queue = new LinkedList<>();
    }

    public void addIntoQueue(Transport transport) {
        queue.offer(transport);
    }

    public void doDiagnostic() {
        while (queue.peek() != null) {
            System.out.println(queue.poll());
        }
    }
}
