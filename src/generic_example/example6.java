package generic_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/** write  method that sort an ArrayList:
 *  public static <E extends Comparable<E>> void sort(ArrayList<E> list)
 */
public class example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integer ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        sort(list);
        System.out.println("The sorted ArrayList are: "+ list);

        for(int mm : list){
            System.out.print(mm+" ");
        }
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        Collections.sort(list);
    }
}
