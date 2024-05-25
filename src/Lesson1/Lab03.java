package Lesson1;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int num = sc.nextInt();

        if(num%5==0 && num%6==0) {
            System.out.println(num + " is divisible by both 5 and 6");
        }else if (num%5==0) {
            System.out.println(num + " is divisible by both 5 but not 6.");
        } else if (num%6 ==0) {
            System.out.println(num + " is divisible 6 and but not 5.");
        }else{
            System.out.println(num +" is divisible by neither 5 nor 6");

        }


    }
    }
