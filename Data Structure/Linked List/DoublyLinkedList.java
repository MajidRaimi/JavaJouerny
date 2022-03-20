public class DoublyLinkedList {

    private class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }

    private Node head;
    private Node tail;
    private static int size = 0;

    public void insertFirst(int value) {

        Node node = new Node(value);

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head.prev = node;
            node.prev = null;
            head = node;
        }

        if (tail == null) {
            tail = head;
        }

    }

    public void insertLast(int value) {

        if (head == null) {
            insertFirst(value);
        } else {
            Node node = new Node(value);
            tail.next = node;
            node.prev = tail;
            node.next = null;
            tail = node;

        }

    }

    public void displayAll() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
        } else if (index == getSize()) {
            insertLast(value);
        } else {

            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node node = new Node(value);
            node.next = temp.next;
            node.prev = temp;

            temp.next.prev = node;
            temp.next = node;

        }
    }

    public void deleteFirst() {
        if (head == null) {
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteLast() {

        if (head == tail) {
            deleteFirst();
        } else {
            tail = tail.prev;
            tail.next = null;
        }

    }

    public void delete(int index) {

        if (index == 0) {
            deleteFirst();
        } else if (index == getSize() - 1) {
            deleteLast();
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            temp.next.next.prev = temp;

        }

    }

    public void displayReverse() {

        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.println("END");

    }

    public int getSum() {

        int sum = 0;

        Node temp = head;

        while (temp != null) {
            sum += temp.value;
            temp = temp.next;
        }
        return sum;
    }

    public int getSize() {

        int size = 0;

        Node temp = head;

        while (temp != null) {
            size += 1;
            temp = temp.next;
        }
        return size;
    }

}
