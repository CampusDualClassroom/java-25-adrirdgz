package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {

        Stack<String> stack = new Stack<>();

        stack.push("Smith");
        stack.push("Montessori");
        stack.push("Peralta");
        stack.push("House");
        return stack;

    }

    public static void printAndEmptyStack(Stack<String> stack) {

        System.out.println(stack.peek()+ "\n");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    public static void main(String[] args) {

        Stack<String> stack = createStack();
        System.out.println("Elementos de la pila: ");
        printAndEmptyStack(stack);

    }

}
