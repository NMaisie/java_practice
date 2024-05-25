package Lesson1;

import Lesson1.Circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double area = radius*radius*Math.PI;// rewrite the method

        System.out.println("The area of circle is " + area);

    }

}
