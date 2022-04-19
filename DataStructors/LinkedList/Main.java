package LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(45);
        list.insert(12);

        list.insertAtStart(1);
        list.insertAtEnd(100);

        list.show();
    }
}