package Praktikum_4;

public class Queue {
    private LinkQueue front;
    private LinkQueue rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void insert(int nim, String nama) {
        // create a new data on linkedlist
        LinkQueue temp = new LinkQueue(nim, nama);

        // If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
    }

    public LinkQueue remove() {
        // If queue is empty, return NULL.
        if (this.front == null) {
            return null;
        }

        // Store previous front and move front one node ahead
        LinkQueue temp = this.front;
        this.front = this.front.next;

        // If front becomes NULL, then change rear also as NULL
        if (this.front == null)
            this.rear = null;

        return temp;
    }

    public void displayQueue() {
        System.out.println("Queue (front-->rear) :");

        LinkQueue current = front;
        while(current != null) {
            System.out.println(current.nim + " " + current.nama);
            current = current.next;
        }
        System.out.println("");
    }
}
