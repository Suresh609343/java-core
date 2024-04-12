package com.learning.core.day4session1;

import java.util.Stack;

class D04P09_3 {
	
    public int evaluateExpression(String expression) {
        
    	Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';
        
        for (int i = 0; i < expression.length(); i++) 
        {
            char c = expression.charAt(i);
            
            if (Character.isDigit(c)) 
            {
                num = num * 10 + (c - '0');
            }
            
            if (!Character.isDigit(c) && c != ' ' || i == expression.length() - 1) 
            {
                if (sign == '+')
                {
                    stack.push(num);
                } 
                else if (sign == '-') 
                {
                    stack.push(-num);
                } 
                else if (sign == '*')
                {
                    stack.push(stack.pop() * num);
                } 
                else if (sign == '/') 
                {
                    stack.push(stack.pop() / num);
                }
                sign = c;
                num = 0;
            }
        }
        int result = 0;
        while (!stack.isEmpty())
        {
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        D04P09_3 calculator = new D04P09_3();
        String expression = "10+2*6";
        int result = calculator.evaluateExpression(expression);
        System.out.println("Output: " + result);
    }
}