package arrayList_linkedList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.*;
public class TestArrayAndLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0, 10); // add 10 to index of 0
        arrayList.add(3, 30);
        System.out.println("Arraylist: " + arrayList);

        System.out.println("trimtosize: ");
        arrayList.trimToSize();
        System.out.println(arrayList);


        System.out.println("Linked list:");
        LinkedList<Object> linkedList = new LinkedList<>(arrayList);

        linkedList.add(1, "red");
        System.out.println("Add red to index 1: " + linkedList);

        linkedList.removeFirst();
        System.out.println("Remove first element: " + linkedList);

        linkedList.addFirst("green");
        System.out.println("Add green to first: " + linkedList);

        System.out.print("Display the linked list forward: ");
        Iterator<Object> forward = linkedList.iterator();
        while (forward.hasNext()) {
            System.out.print(forward.next() + " ");
        }
        // backward method

    }
}
