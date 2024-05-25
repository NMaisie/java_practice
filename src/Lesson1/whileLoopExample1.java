package Lesson1;

import java.util.Scanner;

public class whileLoopExample1 {
    public static void main(String[] args) {

        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);
       int answer = number1+number2;

        Scanner sc = new Scanner(System.in);
        System.out.print(number1+" + "+ number2+"=");
        answer = sc.nextInt();
         while(number1+number2 != answer) {
             System.out.print("Please try again\n " + number1 + " + " + number2+"=");
             answer = sc.nextInt();
         }
        System.out.println("Correct");


         }


    }
