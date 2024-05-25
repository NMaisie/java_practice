package Lesson1;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionExample1 {
    public static int quotien(int num1, int num2)  {
        if (num2 == 0) {
           throw new ArithmeticException("Divisor cannt be zero");
        }
            return (num1 / num2);

    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Number 1: ");
            int num1 = sc.nextInt();
            System.out.print("Number 2: ");
            int num2 = sc.nextInt();

           try {
               int result = quotien(num1, num2);
               System.out.println(num1 + " / " + num2 + " = " + result);
           }
           catch (ArithmeticException e){
               System.out.println("Exception: Enter an integer cant be divided by zero");
           }
            System.out.println(" Execute continued..");

        }
    }
