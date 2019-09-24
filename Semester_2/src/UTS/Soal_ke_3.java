package UTS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Link {
    public Character Data;
    public Link next;

    public Link(Character Data) {
        this.Data = Data;
    }

    public Character getData() {
        return Data;
    }

    public void displayLink() {

        System.out.print(Data + " ");

    }
}

class LinkedList {
    private Link first;
    private Link sorted;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(Character Data) {
        Link newLink = new Link(Data);
        newLink.next = first;
        first = newLink;
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }


    // function to sort a singly linked list using insertion sort
    void insertionSort()
    {
        // Initialize sorted linked list
        sorted = null;
        Link current = first;
        // Traverse the given linked list and insert every
        // node to sorted
        while (current != null)
        {
            // Store next for next iteration
            Link next = current.next;
            // insert current in sorted linked list
            sortedInsert(current);
            // Update current
            current = next;
        }
        // Update head_ref to point to sorted linked list
        first = sorted;
    }

    void sortedInsert(Link newnode)
    {
        /* Special case for the head end */
        if (sorted == null || sorted.Data.compareTo(newnode.Data) >= 0)
        {
            newnode.next = sorted;
            sorted = newnode;
        }
        else
        {
            Link current = sorted;
            /* Locate the node before the point of insertion */
            while (current.next != null && current.next.Data < newnode.Data)
            {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }
}

public class Soal_ke_3 {
    public static void main(String[] args) throws IOException {
        LinkedList list = new LinkedList();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan kata :");
        String kata = input.readLine();

        int size = kata.length();

        for (int i = 0; i < size; i ++)
        {
            list.insertFirst(kata.charAt(i));
        }

        list.displayList();

        list.insertionSort();
        System.out.println("setelah di urutukan");
        list.displayList();
    }
}
