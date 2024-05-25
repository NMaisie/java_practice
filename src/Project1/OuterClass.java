package Project1;
   /* Write a Java program that demonstrates the concept of nested classes.
        Create an outer class OuterClass with a private method getMessage().
        Define an inner class InnerClass that has a method displayMessage()
        which calls the getMessage() method of the outer class.*/
public class OuterClass {
       private void getMessage() {
           System.out.println("Outer class");
       }

        class InnerClass {
           public void displayMessage() {
               getMessage(); //calls the getMessage() method of the outer class
               System.out.println("Inner class");

           }
       }
           public static void main(String[] args) {
               OuterClass o = new OuterClass();
               o.getMessage();
               // can't print the inner message


           }
       }