package generic_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Write the following method that sorts an ArrayList:
       public static <E extends Comparable<E>>void sort(ArrayList<E> list)

 Write a test program that prompts the user to enter 10 integers, invokes this method to sort the numbers, and displays the numbers in increasing order.
 Sample Run:
       Enter 10 integers: 3 4 12 7 3 4 5 6 4 7
       The sorted numbers are 3 3 4 4 4 5 6 7 7 12              **/

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 integers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(sc.nextInt());
        }
        mySort(list); // call mySort method

        System.out.print("The sorted numbers are "+ list); // output: The sorted numbers are [1, 2, 3, 4, 5, 6, 7, 8, 9, 9]

        System.out.println();

        System.out.print("Sorted number are: ");  // output: Sorted number are: 1 2 3 4 6 3 2 4 23 2
        for (int mm : list) {
            System.out.print(mm+" ");
        }
    }

    public static <E extends Comparable<E>> void mySort(ArrayList<E> list) { //
           Collections.sort(list); // Collections.sort(): sorts in ascending order by default min to max.
        // Collections.sort(list,Collections.reverseOrder()); // sort in descending order

    }}
