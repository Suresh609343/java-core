package com.learning.core.day4session1;

class Stack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack(int size)
    {
        this.maxSize = size;
        this.stackArray = new String[maxSize];
        this.top = -1;
    }

    public void push(String element) 
    {
        if (top < maxSize - 1) 
        {
            stackArray[++top] = element;
        } 
        else
        {
            System.out.println("Stack is full. Cannot push element: " + element);
        }
    }

    public String pop()
    {
        if (top >= 0) 
        {
            return stackArray[top--];
        } 
        else 
        {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    public void display() 
    {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) 
        {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

public class D04P09_1 {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        
        // Pushing elements into the stack
        stack.push("Hello");
        stack.push("world");
        stack.push("java");
        stack.push("Programming");

        // Display the stack after pushing elements
        System.out.print("After Pushing 4 Elements: ");
        stack.display();

        // Pop an element from the stack
        String poppedElement = stack.pop();
        System.out.println("After a Pop: " + poppedElement);

        // Display the stack after popping an element
        stack.display();
    }
}