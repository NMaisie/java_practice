package linkedList;

import java.util.*;
import java.util.stream.Collectors;
/**
 1. Implement a method :  reverseList(LinkedList<Integer> list)
 that reverses the given list iteratively.

 Input: 10, 20, 30, 40, 50
 Output: 50, 40, 30, 20, 10

 Write a method: findMiddle(LinkedList<Integer> list)
 that finds the middle element of the given list in a single pass.

 Input: 10, 20, 30, 40, 50
 Output: 30
 */


 public class Programming2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println(newList((LinkedList<Integer>) list));
        System.out.println(reverseList((LinkedList<Integer>) list));
    }

    public static List<Integer> newList(LinkedList<Integer> list) {
        List<Integer> sorted = new LinkedList<>(list);
        Collections.sort(sorted, Collections.reverseOrder());
        return sorted;
    }

    // sorted for high to low
    public static List<Integer> reverseList(LinkedList<Integer> list) {
        return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(LinkedList::new));
    }
    public static void reverse(LinkedList<Integer> list){

    }
}

    // return the middle element
//    public static List<Integer> findMiddle(LinkedList<Integer> list) {
//
//
//}
