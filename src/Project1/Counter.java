package Project1;
        /*Write a Java program to demonstrate the use of static variables.
        Create a class named Counter with a static variable count to
        keep track of the number of Counter objects created.  Include
        a constructor that increments the count and a method getCount() to
        return the current count.*/
public class Counter {
       public static int count;

       public Counter(){
               count++;
       }
       public int getCount(){
               return count;
       }

       public static void main(String[] args) {
               Counter c1 = new Counter();
               System.out.println(c1.getCount());
               Counter c2 = new Counter();
               System.out.println(c2.getCount());
                }}