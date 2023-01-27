package _26;

import java.util.Stack;

public class as6 {
    public static void rs(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int y = stack.pop();
        rs(stack);
        iab(stack, y);
    }

    public static void iab(Stack<Integer> stack, int y) {
        if (stack.isEmpty()) {
            stack.push(y);
            return;
        }
        int a = stack.pop();
        iab(stack, y);
        stack.push(a);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);

        System.out.println("Original Stack: " + stack);
        rs(stack);
        System.out.println("Reversed Stack: " + stack);
    }
}