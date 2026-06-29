package com.mmcoe.stack;

public class Stack {

    private int[] arr;
    private int top;

    public Stack() {
        arr = new int[10];
        top = -1;
    }

    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public void push(int data) {

        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = data;
    }

    public int pop() {

        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }

        return arr[top--];
    }

    public int peek() {

        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void print() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}