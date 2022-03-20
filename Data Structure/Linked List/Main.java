
public class Main {

    public static void main(String[] args) {

        CircularDoublyLinkedList myList = new CircularDoublyLinkedList();


        myList.insertLast(1) ; 
        myList.insertLast(2) ; 
        myList.insertLast(3) ; 
        myList.insertLast(4) ; 
        myList.insertLast(5) ;

        myList.deleteFirst();
        myList.deleteFirst();
        myList.deleteFirst();


        myList.displayAll();

        

    }
}