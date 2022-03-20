public class CircularSinglyLinkedList {

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

    }

    private Node head;
    private Node tail;

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
    }

    public void displayAll() {
        Node temp = head;

        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("END");

    }

    public void insert(int value, int index) {

        if (index == 0) {
            insert(value);
        } else {
            Node temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            Node node = new Node(value);
            node.next = temp.next;
            temp.next = node;
        }

    }

    public void delete() {

        tail.next = head.next;
        head = tail.next;

        if (head == null) {
            tail = null;
        }

    }

    public void delete(int index) {

        if (index == 0) {
            delete();
        } else {
            Node temp = head;

            for (int i = 0; i < index - 1; i++) {

                temp = temp.next;

            }

            temp.next = temp.next.next;

        }

    }

}
