package com.learning.core.day4session1;

class D04P09_6 {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public D04P09_6(int size)
    {
        capacity = size;
        queue = new int[capacity];
        front = -1;
        rear = -1;
    }

    public void enqueue(int item) 
    {
        if ((rear + 1) % capacity == front) 
        {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty())
        {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
    }

    public int dequeue() 
    {
        if (isEmpty()) 
        {
            System.out.println("Queue is empty");
            return -1;
        }
        
        int item = queue[front];
        if (front == rear)
        {
            front = rear = -1;
        }
        else 
        {
            front = (front + 1) % capacity;
        }
        return item;
    }

    public boolean isEmpty() 
    {
        return front == -1;
    }

    public void display()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Elements in circular queue: ");
        int i = front;
        
        do {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
        } while (i != (rear + 1) % capacity);
        System.out.println();
    }

    public static void main(String[] args) {
        D04P09_6 queue = new D04P09_6(4);
        queue.enqueue(14);
        queue.enqueue(13);
        queue.enqueue(22);
        queue.enqueue(-8);
        queue.display();

        queue.dequeue();
        System.out.println("After removing first element: ");
        queue.display();
    }
}
