package Praktikum_3;

class Stack {
    private int maxSize;
    private Character[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new Character[maxSize];
        top = -1;
    }

    public void push(Character item) {
        stackArray[++top] = item;
    }

    public Character pop() {

        return stackArray[top--];
    }

    public Character peek() {

        return stackArray[top];

    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {

        return (top == maxSize - 1);

    }
}


