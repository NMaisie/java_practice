package Recusive;

import java.util.Scanner;

public class Recusive1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        System.out.println("Enter n: ");
        n = sc.nextInt();
        System.out.println(fibonacci(n));

    }

    public static long fibonacci(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fibonacci(n - 1);
    }
//        String a = "test";
//        String b = "test";
//        String c = new String("test");
//        System.out.println(a==b);
//        System.out.println(b==c);// so sanh dia chi nen false
//        System.out.println(a==c);
//        System.out.println(a.equals(b));// so sanh noi dung nen true
//        System.out.println(b.equals(c));
//        System.out.println(a.equals(c));
    }

}
