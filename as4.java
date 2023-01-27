package _26;
import java.util.Stack;


public class as4 {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str1 = "((()))()()";
        String str2 = "())((())";
        if (isBalanced(str1)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
        if (isBalanced(str2)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
