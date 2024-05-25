package Lesson1;

public class Casting {
    public static void main(String[] args) {
        float a = 25.3f;
        int b = (int)a; // a=25.3-> a=25

        System.out.println(a); // still keep it 25.3f
        System.out.println(b); // change from float to int, a=25.3-> a=25
        System.out.println();


        double amount = 5;
        System.out.println(amount / 2);//2.5 cause amount is double
        System.out.println(5 / 2);// kh phu thuoc vao gi ca
        System.out.println(6*4);
        System.out.println();

        int myInt = 10;
        double myDouble = myInt; // Implicit casting from int to double
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println();

        double hi = 10.5;
        int ham = (int) myDouble; // Explicit casting from double to int
        System.out.println(hi);
        System.out.println(ham);



    }
}
