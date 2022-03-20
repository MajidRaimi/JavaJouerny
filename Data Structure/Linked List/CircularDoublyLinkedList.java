public class CircularDoublyLinkedList {

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        Node(int value) {
            this.value = value;
        }

    }

    private Node head;
    private Node tail;

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {

            node.next = head;
            node.prev = tail;

            tail.next = node;
            head.prev = node;

            head = node;

        }
    }

    public void deleteFirst() {

        head = head.next;
        tail.next = head;
        head.prev = tail;

        if (head == tail) {
            head = null;
            tail = null;
        }

    }

    public void insertLast(int value) {

        if (head == null) {
            insertFirst(value);
        } else {

            Node node = new Node(value);

            node.next = head;
            node.prev = tail;

            head.prev = node;
            tail.next = node;

            tail = node;

        }

    }

    public void displayAll() {

        if (head != null) {
            Node temp = head;

            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("END");
        } else {
            System.out.println("Empty Linked List");
        }

    }

}
