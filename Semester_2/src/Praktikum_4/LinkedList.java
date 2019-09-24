package Praktikum_4;

public class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int Data) {
        Link newLink = new Link(Data);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link find(int key) {
        Link current = first;
        while (current.Data != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while (current.Data != key) {
            if(current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }

        if(current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    public Link deleteLast() {

        // Find the second last node
        Link second_last = first;
        while (second_last.next.next != null)
            second_last = second_last.next;

        // Delete last node
        second_last.next = null;

        return second_last;
    }

    public void displayList() {
        System.out.println("List (first-->last) : ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public void insertLast(int Data) {
         /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
        Link new_node = new Link(Data);

        /* 4. This new node is going to be the last node, so
              make next of it as null */
        new_node.next = null;

        /* 5. Else traverse till the last node */
        Link last = first;
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;
    }
}
