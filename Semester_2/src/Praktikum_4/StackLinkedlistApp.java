package Praktikum_4;

class Stack {
    int id;
    String nama;
    Stack link; // reference variavle Node type
}

class StackLinkedlist {
    Stack top;

    public StackLinkedlist() {
        this.top = null;
    }

    public void push(int id, String nama) {
        Stack stack = new Stack();

        // cek jika stack penuh
        if (stack == null) {
            System.out.println("Stack penuh !!!");
            return;
        }

        // mengisi data dari input
        stack.id = id;
        stack.nama = nama;

        // put top into temp link
        stack.link = top;

        // update top
        top = stack;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public void pop() {
        top = (top).link;
    }

    public void display() {
        Stack stack = top;

        System.out.println("Stack(top --> bottom) :");
        while (stack != null) {
            System.out.print("{"+stack.id+", "+stack.nama+"}");
            System.out.println();

            stack = stack.link;
        }
        System.out.println();
    }
}

public class StackLinkedlistApp {
    public static void main(String[] args) {
        StackLinkedlist stack = new StackLinkedlist();

        // memasukkan data pada stack dengan method push
        stack.push(1, "VCD");
        stack.push(2, "TV");

        // cetak data dari stack
        stack.display();

        // memasukkan data pada stack dengan method push
        stack.push(3, "Kulkas");
        stack.push(4, "PC");
        stack.push(5, "Rice Cooker");
        stack.push(6, "Dispenser");

        // cetak data dari stack
        stack.display();

        // remove data dari stack
        stack.pop();
        stack.pop();

        // cetak data dari stack
        stack.display();
    }
}



