package com.learning.core.day4session1;

class Node {
    double data;
    Node next;

    public Node(double data) {
        this.data = data;
        this.next = null;
    }
}

class StackUsingLinkedList {
    private Node top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    public void push(double data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public double pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return Double.NaN;
        }
        double poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        Node current = top;
        System.out.print("The elements of the stack are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class D04P09_2 {
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        // Push elements onto the stack
        stack.push(10.0);
        stack.push(20.0);
        stack.push(30.0);
        stack.push(40.0);

        // Display the stack
        stack.display();

        // Pop twice
        stack.pop();
        stack.pop();

        // Display the stack after popping twice
        System.out.print("After popping twice : ");
        stack.display();
    }
}