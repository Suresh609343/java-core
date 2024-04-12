package com.learning.core.day4session1;

class D04P09_5 {
	
    private class Node {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    private Node front, rear;

    public D04P09_5() 
    {
        front = rear = null;
    }

    public void enqueue(int item) 
    {
        Node newNode = new Node(item);
        
        if (rear == null)
        {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() 
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = front.data;
        front = front.next;
        
        if (front == null)
        {
            rear = null;
        }
        return item;
    }

    public boolean isEmpty() 
    {
        return front == null;
    }

    public void display()
    {
        Node current = front;
        System.out.print("Elements in queue: ");
        while (current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        D04P09_5 queue = new D04P09_5();
        queue.enqueue(89);
        queue.enqueue(99);
        queue.enqueue(109);
        queue.enqueue(209);
        queue.enqueue(309);
        queue.display();

        queue.dequeue();
        queue.dequeue();
        System.out.println("After removing two elements: ");
        queue.display();
    }
}
