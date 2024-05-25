package collections;

import java.util.*;
import java.util.stream.Collectors;

public class ListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6, 7, 8, 9, 10));
        tranform(myList);

    }

    public static void tranform(ArrayList<Integer> list) {
        ArrayList<Integer> reverseList = reversed(list);
        System.out.println("Reversed List: " + reverseList);
      //  System.out.println("Maximum Value: "+findMax(list));
        list.stream().max(Integer::compareTo).ifPresent(max-> System.out.println("Maximum Value:"+ max));
        System.out.println("Minimum Value: "+ findMin(list));
        System.out.println("List after removing even numbers:"+removeEvenNumber(reverseList));
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> list) {
       /* Stack<Integer> newStack = new Stack<>();
        for (Integer m : list) {
            newStack.push(m);
        }
        ArrayList<Integer> reverseList = new ArrayList<>();
        while (!newStack.isEmpty()) {
            reverseList.add(newStack.pop());
        }
        return reverseList;*/
        Collections.reverse(list);
        return list;
    }

    public static int findMax(ArrayList<Integer> list) {
     /*   int max = list.get(0);
        for (Integer m : list) {
            if (max < m) {
                max = m;
            }
        }
        return max;*/

      /*  Optional<Integer> optionalMax = list.stream().max(Integer :: compareTo);
        return optionalMax.isPresent()? optionalMax.get(): list.get(0);*/

        return Collections.max(list);
    }
    public static int findMin(ArrayList<Integer> list) {
        int min = list.get(0);
        for(Integer m : list){
            //min = 10, m = 9, min>m
            if(min>m){
                min = m;
            }
        }
        return min;
    }
    public static ArrayList<Integer> removeEvenNumber (ArrayList<Integer> list){
       /* ArrayList<Integer> removeEven = new ArrayList<>();
        for(Integer m: list){
            if(m%2!=0){
                removeEven.add(m);
            }
        }
        return removeEven;*/

        return list.stream().filter(x-> x%2!=0).collect(Collectors.toCollection(ArrayList::new));
    }
}

