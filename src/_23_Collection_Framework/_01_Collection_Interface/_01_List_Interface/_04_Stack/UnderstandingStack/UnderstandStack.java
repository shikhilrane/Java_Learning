package _23_Collection_Framework._01_Collection_Interface._01_List_Interface._04_Stack.UnderstandingStack;

import java.util.Stack;

public class UnderstandStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("=== Stack Basic Operations ===");

        // 1. push(E item) – Adds element to the top of the stack (LIFO)
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println("Stack after pushes: " + stack);  // [1, 2, 3, 4, 5, 6, 7]

        // 2. pop() – Removes the top element of the stack
        stack.pop();
        System.out.println("Stack after pop(): " + stack);   // [1, 2, 3, 4, 5, 6]

        // 3. peek() – Returns the top element without removing it
        System.out.println("Top element (peek): " + stack.peek()); // 6

        // 4. isEmpty() – Checks if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());  // false

        // 5. search(Object o) – Returns 1-based position from the top (returns -1 if not found)
        System.out.println("Position of 1 from top: " + stack.search(1));      // from top of stack, 1 is at very bottom so it shows 6

        // 6. size() – Returns number of elements in stack
        System.out.println("Size of stack: " + stack.size());  // 6

        // 7. contains(Object o) – Checks if stack contains the element
        System.out.println("Stack contains 3? " + stack.contains(3));  // true

        // 8. Iterate through Stack (LIFO order)
        System.out.print("Iterating Stack (LIFO): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println("\nIs stack empty after popping all? " + stack.isEmpty());  // true
    }
}
