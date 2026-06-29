package com.mmcoe.stack;

public class TestStack {
	public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top Element: " + s.peek());

        s.print();

        s.pop();

        s.print();
    }
}
