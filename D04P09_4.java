package com.learning.core.day4session1;

class D04P09_4 {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public D04P09_4(int size)
    {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }

    public void enqueue(int item) 
    {
        if (rear == capacity - 1) 
        {
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] = item;
    }

    public int dequeue() 
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = queue[front++];
        return item;
    }

    public boolean isEmpty()
    {
        return front > rear;
    }

    public void display()
    {
        System.out.print("Elements in queue: ");
        
        for (int i = front; i <= rear; i++) 
        {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        D04P09_4 queue = new D04P09_4(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.display();

        int removed = queue.dequeue();
        System.out.println("After removing first element: ");
        queue.display();
    }
}
