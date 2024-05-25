package Lesson1;
// https://www.youtube.com/watch?v=LShiqO7k-gA
public class WrapperClass {
    public static void main(String[] args) {
        Character character = '@';
        System.out.println(character); //@
        Boolean boo = true;
        System.out.println(boo);// true

        Boolean s1 = Boolean.valueOf("true"); //true (cause boolean contain true and false)
        Boolean s2 = Boolean.valueOf("ss"); //false (boolean not contain String, integer anything accept true false
        System.out.println(s1);
        System.out.println(s2);


        Integer x1 = 9;
        Integer x2 = 9;
        System.out.println("x1 == x9 " + (x1==x2)); // comparing the address

        Integer x3 = 128;
        Integer x4 = 128;
        System.out.println("X3 == x4? "+(x3==x4)); // false cause Integer contain -128 -> 127 so it comparing the address
        System.out.println("Make x3 == x4 by .equals() "+ (x3.equals(x4))); // equals : comparing value

        int a = 5;
    }
}
