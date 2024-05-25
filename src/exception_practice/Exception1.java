package exception_practice;
// https://www.youtube.com/watch?v=EVoMK9Yo0fY

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Age: ");

        /**   when any exception happen in any line inside try-block then
         *    after that all the code below inside the try-block can not run**/
        try { // put line of code that may cause error in to try block
            int age = sc.nextInt();
            System.out.println("Your age is: " + age);
            int error = age / 0;
            System.out.println( "After line of code that cause error"); // try 5, this line doesn't print out cause there was error cannt devided by 0.

        } catch (InputMismatchException ex) {
            System.out.println("Please enter an integer");
        } catch (ArithmeticException ar) {
            System.out.println("Can not divided by zero");
        } finally { // always run
            System.out.println("End.");
        }
    }

}