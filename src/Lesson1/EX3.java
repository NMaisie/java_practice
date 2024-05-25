package Lesson1;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        double amount = sc.nextDouble();
        int remainingAmount = (int) (amount*100);// convert amount: 11.56 -> 1156

        int numberOfDollar = remainingAmount/100;
        remainingAmount = remainingAmount%100;

        int numberOfQuarter = remainingAmount/25;
        remainingAmount = remainingAmount%25;

        int numberOfDime = remainingAmount/10;
        remainingAmount = remainingAmount%10;

        int numberOfNickels = remainingAmount/5;
        remainingAmount = remainingAmount%5;

        int pennies = remainingAmount;
        System.out.println("Your amount " + amount + " consists of");
              System.out.println("    " + numberOfDollar + " dollars");
              System.out.println("    " + numberOfQuarter + " quarters");
              System.out.println("    " + numberOfDime + " dimes");
              System.out.println("    " + numberOfNickels + " nickels");
              System.out.println("    " + pennies+ " pennies");
           }

}
