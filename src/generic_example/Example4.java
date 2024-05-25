package generic_example;

import java.util.Scanner;

/** (Maximum element in an array)
 Implement the following method that returns the maximum element in an array.
    public static <E extends Comparable<E>> E max (E[] list)

 Write a test program that prompts the user to enter 10 integers and invokes this method to find the max.

 Sample Run:
    Enter 10 integers: 3 4 12 7 3 4 5 6 4 7
    The max number is 12
 */
public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 integers: ");

        Integer[] list = new Integer[3];
        for (int i = 0; i < list.length; i++) {
            list[i] = (sc.nextInt());

        }

        System.out.println("The max number is : "+ max(list));
//        Integer maximum = max(list);
//        System.out.println("The max number is : "+ maximum);
    }
    public static <E extends Comparable<E>> E max (E[] list){
/** This is a generic method named max that takes an array of elements of type E.
 *   The type E must be a subtype of Comparable<E>, meaning it must implement the Comparable interface.
 *   This interface allows objects of type E to be compared with each other.**/

    E max = list[0]; // initialize a variable max with the first element of the array.
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(max) > 0) {
                max = list[i];
/** This loop iterates over the elements of the array, starting from the second element (i = 1).
 *  For each element, it compares it with the current max using the compareTo method provided by the Comparable interface.
 *  If the current element is greater than the current max, it updates max to the current element.**/
            }
        } return max;
    }
}


