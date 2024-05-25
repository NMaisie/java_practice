package generic_example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**  Write the following method that return a new Arraylist. The new list contains the duplicate element from the original list.
 *  public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 */
public class Example5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integer ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Remove duplicate number are: "+removeDuplicates(list));
    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>();

//        for (int i = 0; i < list.size(); i++) {
//           E element = list.get(i);
        for (E element : list) { // get each element of list
            if (!newList.contains(element)) { // if the list does not contain the element
                newList.add(element); // then add element to the list
            }
        }
       // Collections.sort(newList);
     return newList;
        }
        }

