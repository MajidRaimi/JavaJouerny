public class SinglyLinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    private Node head;
    private Node tail;
    private int size = 0;

    public void insertFirst(int value) {

        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {

        if (tail == null) {
            insertFirst(value);
        } else {
            Node node = new Node(value);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void deleteLast() {

        if (getSize() <= 1) {
            deleteFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < getSize() - 2; i++) {
                temp = temp.next;
            }

            tail = temp;
            tail.next = null;
        }

    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void deleteFirst() {
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
        } else if (index == size) {
            insertLast(value);
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }

            Node node = new Node(value, temp.next);
            temp.next = node;
        }
    }

    public void displayAll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void delete(int index) {

        if (index == 0) {
            deleteFirst();
        } else if (index == getSize() - 1) {
            deleteLast();
        } else if (index <= getSize()) {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;

        }

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
            size++;
            temp = temp.next;
        }
        return size;
    }

}
