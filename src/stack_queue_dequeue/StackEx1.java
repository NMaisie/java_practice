package stack_queue_dequeue;

import java.util.Scanner;
import java.util.Stack;

public class StackEx1 {

    public static void main(String[] args) {



///*
//        myStack.push("value"); // add value to stack
//        myStack.pop(); //take value out and remove it from stack
//        myStack.peek(); // take value out without delete it in myStack
//        myStack.clear();// delete all value in myStack
//        myStack.size();// return the size of myStack
//        myStack.contains("value");// check if the value exist in myStack*/
        Scanner sc = new Scanner(System.in);
        Stack<String> myStack = new Stack<>();

        System.out.println("Enter a string: ");
        String s = sc.next();// hello

        System.out.print("Push: " );
        for (int i = 0; i < s.length(); i++) {
            myStack.push(s.charAt(i) + "");
            /** Adding ""  to the end converts the character s.charAt(i) to a string before pushing it onto the stack.
             * This is necessary because the push method of the Stack class in Java expects a String type parameter,
             * and s.charAt(i) returns a char type which needs to be converted to a String for the push operation. **/
            System.out.print(myStack);
        }
        System.out.println();
        System.out.print("Pop: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(myStack.pop());
        }
    }
}