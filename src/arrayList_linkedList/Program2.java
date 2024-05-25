package arrayList_linkedList;

import java.util.*;
import java.util.stream.Collectors;

public class Program2 {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("red", "green", "blue", "red", "green", "yellow"));
        System.out.println(newList1(myList));
        System.out.println(newList2(myList));
        System.out.println(newList3(myList));
    }

    public static ArrayList<String> newList1(ArrayList<String> myList) {
        ArrayList<String> nondupList = new ArrayList<>();
        for (String mm : myList)
            if (!nondupList.contains(mm)) {
                nondupList.add(mm);
            }
        Collections.sort(nondupList);

        return nondupList;
    }

    public static ArrayList<String> newList2(ArrayList<String> myList) {
        Set<String> nonduplist = new HashSet<>();
        for (String mm : myList)
            nonduplist.add(mm);
/**       Collections.sort(nonduplist); // can't sort Set */
        //need to create a list or arrayList and add nonduplist to it to use sort
        ArrayList<String> sortedList = new ArrayList<>(nonduplist);
        Collections.sort(sortedList);

        return sortedList;
    }

    public static ArrayList<String> newList3(ArrayList<String> myList) {
        ArrayList<String> nondupList = new ArrayList<>(new HashSet<>(myList));
        Collections.sort(nondupList);
        return nondupList;
    }
    public static ArrayList<String> newList4(ArrayList<String> myList){
        return myList.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(ArrayList::new));
        // distinct(): only one or remove duplicate in this cases
    }

}



