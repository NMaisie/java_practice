package stack_queue_dequeue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.stream.Collectors;

public class ReverseList {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(reverseStack(stack));
        System.out.println(reverseStack2(stack));

    }
    public static Stack<Integer> reverseStack(Stack<Integer> stack){
        return stack.stream().sorted(Collections.reverseOrder()).collect(Collectors.toCollection(Stack::new));
    }
    public static Stack<Integer> reverseStack2 (Stack<Integer> stack){
        Stack<Integer> reverseStack = new Stack<>();
       while(!stack.isEmpty()){
           reverseStack.push(stack.pop());

         //   reverseStack.pop();

        }
        return reverseStack;
    }
}
