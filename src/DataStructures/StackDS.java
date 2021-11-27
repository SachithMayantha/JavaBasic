package DataStructures;

import java.util.Stack;

public class StackDS {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Kamal");
        stack.push("Nimal");
        stack.push("Sumal");

        stack.pop();

        System.out.println(stack.peek());
    }
}
