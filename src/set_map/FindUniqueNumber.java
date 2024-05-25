package set_map;

import java.util.*;

/**
 Implement a method :  uniqueElements(List<Integer> list)
 that takes a list of integers as input and returns a new Set containing only the unique elements from the input list.

 Input:
 List: 10, 20, 30, 20, 40, 10
 Output:
 Set: 10, 20, 30, 40
 */

public class FindUniqueNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 20, 40, 10));
        System.out.println(uniqueElements(list));
    }

    public static Set<Integer> uniqueElements(List<Integer> list) {
       // Set<Integer> newSet = new HashSet<>(list);
        return new TreeSet<Integer>(list); // using TreeSet: non duplicate and sorted
    }
}