package Praktikum_8;

import java.util.Scanner;

class hashTable{

    private int size, elementCount;
    private int[] table;
    public Scanner sc = new Scanner(System.in);

    // initialize hash Table
    hashTable(){
        System.out.print("Enter the size of the Table : ");
        this.size = sc.nextInt();

        this.table = new int[size];

        for(int i=0; i < size; i++){
            this.table[i] = 0;
        }
        this.elementCount = 0;
    }


    // method that checks if the hash table is full or not
    boolean isFull(){
        if(this.elementCount == this.size){
            return true;
        }else{
            return false;
        }
    }


    // method that returns position for a given element
    int hashFunction(int element){
        return element % this.size;
    }

    // method that finds the next empty position using quadratic probing
    int quadraticProbing(int element, int position){
        int limit = 50, i = 1;
        int newPosition = -1;
        while(i <= 50){
            newPosition = this.hashFunction(position + (int)Math.pow(i, 2));
            if(this.table[newPosition] == 0){
                break;
            }
            else{
                i++;
            }
        }
        return newPosition;
    }

    // method that inserts element inside the hash table
    void insert(int element){
        int position;
        // checking if the this.table is full
        if(this.isFull()){
            System.out.println("Hash Table Full");
            return;
        }

        boolean isStored = false;

        position = this.hashFunction(element);

        // checking if the position is empty
        if(this.table[position] == 0){
            this.table[position] = element;
            System.out.println("Element " + element + " at position " + position);
            isStored = true;
            this.elementCount += 1;
        }

        // collision occured hence we do quadratic probing
        else{
            System.out.println("Collision occured for Element " + element + " at position " + position + "Finding new position.");
            position = this.quadraticProbing(element, position);
            if(position != -1){
                this.table[position] = element;
                this.elementCount += 1;
                System.out.println("Element " + element + " stored at position " + position);
            }
        }
        return;
    }

    // method that searches for an element in the table
    // returns position of element if found
    // else returns false
    int search(int element){
        boolean found = false;

        int position = this.hashFunction(element);

        if(this.table[position] == element){
            found = true;
            return position;
        }

        // if element is not found at position returned by hash function
        // then we search element using quadratic probing
        else{
            int limit = 50, i = 1;
            int newPosition = -1;
            while(i <= 50){
                newPosition = this.hashFunction(position + (int)Math.pow(i, 2));
                if(this.table[newPosition] == element){
                    found = true;
                    break;
                }
                else{
                    i++;
                }
            }
            if(found){
                return newPosition;
            }
            else{
                System.out.println("Element not found");
                return -1;
            }
        }
    }


    // method to remove an element from the table
    void remove(int element){
        int position = this.search(element);
        if(position != -1){
            this.table[position] = 0;
            System.out.println("Element " + element + " is Deleted");
            this.elementCount -= 1;
        }else{
            System.out.println("Element is not present in the Hash Table");
        }
        return;
    }

    // method to display the hash table
    void display(){
        for (int i = 0; i < this.size; i++){
            System.out.println(i + " = " + this.table[i]);
        }
        System.out.println("The number of element is the Table are : " + this.elementCount);
    }
};

public class Nim_genap{
    public static void main(String arg[]){

        hashTable table1 = new hashTable();

        // storing elements in this.table
        table1.insert(12);
        table1.insert(26);
        table1.insert(31);
        table1.insert(17);
        table1.insert(90);
        table1.insert(28);
        table1.insert(88);
        table1.insert(40);
        table1.insert(77);      // element that causes collision at position 0

        // displaying the Table
        table1.display();

        // printing position of elements
        System.out.println("The position of element 31 is : " + table1.search(31));
        System.out.println("The position of element 28 is : " + table1.search(28));
        System.out.println("The position of element 90 is : " + table1.search(90));
        System.out.println("The position of element 77 is : " + table1.search(77));
        System.out.println("The position of element 1 is : " + table1.search(1));


        table1.remove(90);
        table1.remove(12);

        table1.display();
    }
}