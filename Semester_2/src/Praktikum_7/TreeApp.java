package Praktikum_7;
import java.io.*;
import java.util.Stack;

class Node {

    public int iData;
    public Node leftChild;
    public Node rightChild;

    public Node(int data) {
        iData = data;
        leftChild = null;
        rightChild = null;
    }
    public void display() {
        System.out.print(iData + " ");
    }
}

class Tree {
    public Node root;

    public Tree() {
        root = null;
    }
    public Node find(int key) {
        Node current = root;
        while(current.iData != key) {
            if(key < current.iData)
                current = current.leftChild;
            else
                current = current.rightChild;
            if(current == null)
                return null;
        }
        return current;
    }

    // Returns the max value in a binary tree
    int findMax(Node root)
    {
        if (root == null)
            return Integer.MIN_VALUE;

        int res = root.iData;
        int lres = findMax(root.leftChild);
        int rres = findMax(root.rightChild);

        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }

    int findMin(Node node)
    {
        if (node == null)
            return Integer.MAX_VALUE;

        int res = node.iData;
        int lres = findMin(node.leftChild);
        int rres = findMin(node.rightChild);

        if (lres < res)
            res = lres;
        if (rres < res)
            res = rres;
        return res;
    }

    // To check if tree has duplicates
    public boolean checkDup(int key)
    {
        Node current = root;
        while(current.iData != key) {
            if(key < current.iData)
                current = current.leftChild;
            else
                current = current.rightChild;
            if(current == null)
                return false;
        }

        return true;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
            if(root == null) {
                root = newNode;
            } else {
                if (checkDup(data)) {
                    System.out.println("tidak boleh ada data yang sama");
                } else {
                Node current = root;
                Node parent;
                while(true) {
                    parent = current;
                    if(data < current.iData) {
                        current = current.leftChild;
                        if(current == null) {
                            parent.leftChild = newNode;
                            return;
                        }
                    }
                    else {
                        current = current.rightChild;
                        if(current == null) {
                            parent.rightChild = newNode;
                            return;
                        }

                    }
                }
            }
        }
    }

    public boolean delete(int key) {

        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while(current.iData != key) {
            parent = current;
            if(key < current.iData) {
                current = current.leftChild;
                isLeftChild = true;
            }
            else {
                current = current.rightChild;
                isLeftChild = false;
            }
            if(current == null)
                return false;
        }

        if(current.leftChild == null && current.rightChild == null) {
            if(current == root)
                root = null;
            else if(isLeftChild)
                parent.leftChild = null;
            else
                parent.rightChild = null;
        }

        if(current.leftChild == null) {
            if(current == root)
                root = current.rightChild;
            else if(isLeftChild)
                parent.leftChild = current.rightChild;
            else
                parent.rightChild = current.rightChild;
        }

        else if(current.rightChild == null) {
            if(current == root)
                root = current.leftChild;
            else if(isLeftChild)
                parent.leftChild = current.leftChild;
            else
                parent.rightChild = current.leftChild;
        }

        else {
            Node successor = getSuccessor(current);

            if(current == root)
                root = successor;
            else if(isLeftChild)
                parent.leftChild = successor;
            else
                parent.rightChild = successor;

            successor.leftChild = current.leftChild;
        }
        return true;
    }
    private Node getSuccessor(Node deleteItem) {
        Node successor = deleteItem;
        Node successorParent = deleteItem;
        Node current = deleteItem.rightChild;
        while(current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if(deleteItem.rightChild != successor) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = deleteItem.rightChild;
        }
        return successor;
    }
    public void traverse(int traverseType) {
        switch(traverseType) {
            case 1:
                System.out.print("\nPreorder traversal: ");
                preOrder(root);
                break;
            case 2:
                System.out.print("\nInorder traversal: ");
                inOrder(root);
                break;
            case 3:
                System.out.print("\nPostorder traversal: ");
                postOrder(root);
                break;
        }
        System.out.println("");
    }

    private void preOrder(Node current) {
        if(current != null) {
            System.out.print(current.iData + " ");
            preOrder(current.leftChild);
            preOrder(current.rightChild);
        }
    }
    private void inOrder(Node current) {
        if(current != null) {
            inOrder(current.leftChild);
            System.out.print(current.iData + " ");
            inOrder(current.rightChild);
        }
    }
    private void postOrder(Node current) {
        if(current != null) {
            postOrder(current.leftChild);
            postOrder(current.rightChild);
            System.out.print(current.iData + " ");
        }
    }

    public void displayTree() {

        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("............................");
        while(isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for (int j = 0; j < nBlanks; j++) {
                System.out.print(' ');
            }
            while(globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.iData);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if (temp.leftChild != null || temp.rightChild != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }

                for (int j = 0; j < nBlanks * 2-2;j++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            nBlanks /= 2;
            while (localStack.isEmpty() == false) {
                globalStack.push(localStack.pop());
            }
        }
        System.out.println("-----------------------------------");
    }
}

public class TreeApp {

    public static void main(String args[]) throws IOException {

        int value;
        Tree tree = new Tree();

        while(true) {
            System.out.print("Enter first letter of insert, show, ");
            System.out.print("delete, find, traverse, besar or kecil: ");
            char choice = getChar();
            switch(choice) {
                case 's':
                    tree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter data value to insert: ");
                    System.out.flush();
                    value = getInt();
                    tree.insert(value);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    System.out.flush();
                    value = getInt();
                    Node temp = tree.find(value);
                    if(temp != null)
                        System.out.println("Found " + temp.iData);
                    else
                        System.out.println("Not found " + value);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    System.out.flush();
                    value = getInt();
                    if(tree.delete(value))
                        System.out.println("Deleted " + value);
                    else
                        System.out.println("Can't delete " + value);
                    break;
                case 't':
                    System.out.print("Enter 1 for Preorder traversal, 2 for ");
                    System.out.print("Inorder Traversal, 3 for Postorder Traversal: ");
                    System.out.flush();
                    value = getInt();
                    tree.traverse(value);
                    break;
                case 'b':
                    System.out.flush();
                    System.out.println("Max number is : "+tree.findMax(tree.root));
                    break;
                case 'k':
                    System.out.flush();
                    System.out.println("Min number is : "+tree.findMin(tree.root));
                    break;
            }
        }

    }
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}