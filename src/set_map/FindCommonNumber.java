package set_map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 Implement a method:  intersectionOfSets(Set<Integer> set1, Set<Integer> set2)
 that takes two sets of integers as input and returns a new Set containing the intersection of the two input sets.

 Input:
 Set 1: 10, 20, 30, 40
 Set 2: 20, 30, 50, 60
 Output:
 Intersection Set: 20, 30
 */
public class FindCommonNumber {
    public static void main(String[] args) {

        Set<Integer> set1 = new TreeSet<>(Arrays.asList(10, 20, 30, 40));
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(20, 30, 50, 60));
        System.out.println(intersectionOfSets(set1,set2));
        System.out.println(usingStream(set1,set2));
    }

    public static Set<Integer> intersectionOfSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> newSet = new HashSet<>(set1);
        newSet.retainAll(set2); // retainAll: keeps only the elements that are common to both sets.
            return newSet;
        }
    public static Set<Integer> usingStream (Set<Integer> set1, Set<Integer> set2) {
        return set1.stream()
                .filter(set2::contains) // kiểm tra xem một phần tử từ stream có tồn tại trong set2 không. "chỉ giữ lại những phần tử của stream có tồn tại trong set2".
                .collect(Collectors.toSet());
    }
}