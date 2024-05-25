package Lesson1;
//        Write a program that sorts 2 integers. The integers are entered in the console
//        window using a Scanner object. Store your numbers in 2 integer variables: num1
//        and num2. Your program should sort the numbers using a simple if statement so
//        that after sorting, the variable num1’s value should be less than or equal to the
//        variable num2’s value, that is, num1 ≤ num2.
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1: ");
        num1 = sc.nextInt();
        System.out.println("Enter the value of num2; ");
        num2 = sc.nextInt();

        if(num1<=num2) {
            System.out.println("The sorted number are "+ num1+","+num2);

        }else{
            int temp = num1;
            num1 = num2;
            num2 = temp;
        System.out.println("The sorted number are "+ num1+","+num2);


    }
}}