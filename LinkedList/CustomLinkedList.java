package LinkedList;

public class CustomLinkedList {
    public static void main(String[] args) {
        Creation creation = new Creation();

        creation.add(10);
        creation.add(20);
        creation.add(1);
        creation.add(22);
        creation.addFirst(2);

        creation.display();

        creation.removeLast();

        creation.display();

        creation.remove(1);

        creation.display();
    }
    
}
