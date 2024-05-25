package arrayList_linkedList;

import java.util.*;
import java.util.stream.Collectors;

public class Program3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,3,5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,6,7,8));
        System.out.println(newList(list1, list2));
    }
    public static ArrayList<Integer> newList(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list3 = new ArrayList<>();
        //TODO : common numbess
        list1.retainAll(list2);
//        for(int l1 : list1){
//            if(list2.contains(l1) && !list3.contasns(l1)){
//               list3.add(l1);
//            }
//        }
        // TODO: remove duplicate number
         ArrayList<Integer> nonDuplicate = new ArrayList<>(new HashSet<>(list1));
        // TODO: SORT
        Collections.sort(nonDuplicate, Comparator.reverseOrder());

        return nonDuplicate;

    }
    public static ArrayList<Integer> streamTest (ArrayList<Integer> list1, ArrayList<Integer> list2){
       list1.retainAll(list2);
        return list1.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(ArrayList:: new));

    }
}
