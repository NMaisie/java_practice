package stack_queue_dequeue;

import java.util.Stack;

public class ParenthesisBalance {
    public static void main(String[] args) {

        String s = new String("((a+b) * (c-d)");
        System.out.println(balanceParenthesis(s));
    }

    public static boolean balanceParenthesis(String s) {
        Stack<Character> newStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                newStack.push(c);
            } else if (c == ')') {
                if (!newStack.isEmpty()) {
                    newStack.pop();
                } else {
                    return false;
                }
            }
        }
        return newStack.isEmpty();// true
    }
}
