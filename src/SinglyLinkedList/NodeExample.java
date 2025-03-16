package SinglyLinkedList;

public class NodeExample {
    public static void main(String[] args) {

       Node node = new Node("abhay");
       Node node1 = new Node("prajwal");

       node.setNext(node1);

       Node node2 = new Node("Somesh");
       node1.setNext(node2);

        Node.print(node);

    }
}
