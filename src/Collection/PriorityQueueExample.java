package Collection;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(25);
        queue.add(12);
        queue.add(45);

        System.out.println("Head Element: " + queue.peek());

        System.out.println("Polling Elements:");
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
