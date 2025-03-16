package Collection;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Task1");
        tasks.add("Task2");
        tasks.add("Task3");

        tasks.addFirst("Urgent tasks");
        tasks.addLast("Low prority tasks");

        System.out.println("Tasks: " + tasks);

        tasks.removeFirst();
        tasks.removeLast();

        //itreating for loop
        System.out.println("Task after removal");
        for (String task: tasks){
            System.out.println(task);
        }
    }
}
