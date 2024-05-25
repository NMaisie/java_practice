package Lesson1;

import java.util.Scanner;

public class CelToFer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius =( 5.0/9.0)*(fahrenheit-32);
        System.out.println(fahrenheit+"F is convert to C is: " +celsius);

    }
}
