package LinkedList;

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node(data);
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void insertAtEnd(int data){
        Node n = new Node(data);
        Node pointer = head;
        while (head.next != null){
            head = head.next;
        }
        head.next = n;
        head = pointer;
    }
    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
