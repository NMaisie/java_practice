package arrayList_linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class FindMiddle {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(10,20,30,40,50));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(10,20,30,40,50,60));
        System.out.println(findMiddle(list1));
        System.out.println(findMiddle(list2));

    }
    public static Integer findMiddle(LinkedList<Integer> list ){
        return list.size()%2 ==0? list.get(list.size()/2 -1): list.get(list.size()/2);
    }

}
