package SinglyLinkedList;

public class Node {
    private String data;
    private Node next;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(String data) {
        this.data = data;
    }

    public Node(Node next) {
        this.next = next;
    }

   public static void print(Node n){
        while ( n != null){
           System.out.println(n.getData());
            n = n.next;

       }
   }
    }

