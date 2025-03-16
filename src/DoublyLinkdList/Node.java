package DoublyLinkdList;

public class Node {
    private String data;
    private Node next;
    private Node previous;

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

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node(String data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public static void print(Node n){
        while (n != null){
            System.out.println(n.getData());
            n=n.next;
        }
    }

    public static void main(String[] args) {
        Node node = new Node("abhay",null,null);
        Node node1 = new Node("parth",node,null);

        node.setNext(node1);
        node.setPrevious(node1);
        Node node2 = new Node("vishu",node1,null);

        Node node3 = new Node("Sayan",null,null);


        node1.setNext(node2);
        node1.setPrevious(node2);

        node2.setNext(node3);
        node3.setPrevious(node2);
        Node.print(node);



    }
}
