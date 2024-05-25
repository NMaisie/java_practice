package Lesson1;

public class Operation {
    public static void main(String[] args) {

        double a = 5;
        double c =5;

        a +=  1; // 5+1 =6
        System.out.println(a);

        c += c+1; // 5+5+1 = 11
        System.out.println(c);

        double b = 10;
        b /= 2;
        System.out.println(b);
        System.out.println(Math.pow(5,6)); // 5^6


        int x = 80;
        while (x > 0) // go forever cause 80>0
            x++;
        System.out.println("x is " + x);

        // ! : not operator
        int age = 22;
        // false because (age > 21) is true
        System.out.println(!(age > 21)); // false
        // true because (age > 25) is false
        System.out.println(!(age > 25)); // true


    }
}


