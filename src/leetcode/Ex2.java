package leetcode;

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("Enter an integer: ");
        int i = scan.nextInt();

        scan.nextLine();
        System.out.print("Enter a string: ");
        String s = scan.nextLine();

        System.out.println("String: " + s);
        //System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();

    }
}
