package linkedList;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
/**
 Write a method
         removeElement(LinkedList<Integer> list, int element)
 that removes all occurrences of the given element from the list
 Input: 10 20 30 40 20
 Output: 10 30 40
 */
public class Program1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 20));

        int element = 20;

        System.out.println(list);
        //System.out.println(removeDuplicate1((LinkedList<Integer>) list, element));
        removeDuplicate2(list, element);
        System.out.println(list);
        System.out.println(removeElement( list, element));

    }

    public static List<Integer> removeDuplicate1(LinkedList<Integer> list, int element) {
        List<Integer> newList = new LinkedList<>();
        for (Integer e : list) {
            if (!e.equals(element)) { //
                newList.add(e);
            }
        }
        return newList;
    }


    /** removes all occurrences */
    public static List<Integer>removeElement(LinkedList<Integer> list,int element){
        return list.stream().filter(e -> e != element).collect(Collectors.toCollection(ArrayList:: new));
    }
    public static void removeDuplicate2(LinkedList<Integer> list, int element){
     /*   list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer == element;
            }
        });*/

        list.removeIf(e-> e== element);
    }
}
/**
  When applying .filter(e -> e != 20):

  10 passes the filter because 10 != 20.
  20 fails the filter because 20 == 20.
  30 passes the filter because 30 != 20.
  40 passes the filter because 40 != 20.
  20 fails the filter because 20 == 20.
  After filtering, the resulting [10, 30, 40], which represents the list with occurrences of 20 removed.
 */