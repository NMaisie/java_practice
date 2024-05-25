package collections;

import java.util.ArrayList;
import java.util.Collection;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> myArraylist = new ArrayList<>();
        myArraylist.add("New York");
        myArraylist.add("Atlanta");
        myArraylist.add("Dallas");
        myArraylist.add("Madison");
        myArraylist.add("Chicago");
        System.out.println("A list of cities in my collection1: "+ myArraylist);

        // remove
        myArraylist.remove(2);
        System.out.println("After removing the city at index 2: "+ myArraylist);
        // add
        myArraylist.add(3,"Helloooo");
        System.out.println("After adding Helloooo at index 3: "+ myArraylist);


        Collection<String> myCollection2 = new ArrayList<>();
        myCollection2.add("Seatle");
        myCollection2.add("Portland");
        myCollection2.add("Los Angeles");
        myCollection2.add("Atlanta");
        myCollection2.add("Chicago");
        System.out.println("A list of cities in my collection2: "+ myCollection2);

        myArraylist.retainAll(myCollection2);
        System.out.println("After retaining (common) all cities in my collection2: "+ myArraylist); // must print myArraylist instead of myCollection2


        ArrayList<String> myClone = (ArrayList<String>)(myArraylist.clone());


    }
}
