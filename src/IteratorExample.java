import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        /** The program uses the Collection interface and the ArrayList class from the Java Collections Framework.
         A Collection of strings named myString is created and initialized(khoi tao) as an ArrayList.*/
        Collection<String> myString = new ArrayList<>();
        myString.add("New York");
        myString.add("Atlanta");
        myString.add("Dallas");
        myString.add("Madison");

        System.out.print("Using lamda expression: ");
        myString.forEach(e-> System.out.print(e.toUpperCase()+" "));
        System.out.println();



        Iterator<String> myIterator = myString.iterator();
      /*  while(myIterator.hasNext()){ // using myIterator
            System.out.print(myIterator.next().toUpperCase()+" ");
            System.out.println();*/

        System.out.print("Using iterator: ");
        for(String mm : myString){ /** why not myIterator?? */
            System.out.print(mm.toUpperCase()+" ");
        }

    }
}
