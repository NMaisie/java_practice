package Lesson1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Interest Rate: ");
        double interestRate = sc.nextDouble();


        System.out.print("Number of Year: ");
        int year = sc.nextInt();

        System.out.print("Loan amount: ");
        int loan = sc.nextInt();

        double monthlyInterestRate = interestRate / 1200;
        double monthlyPayment = loan*interestRate/(1-1/Math.pow(1+ monthlyInterestRate, year));
        double totalPayment = monthlyPayment*year*12;
        System.out.println("The monthly payment is $"+ (int) (monthlyPayment*100)/100.0);
        System.out.println("The total Payment is $"+(int)(totalPayment*100)/100.0);


    }
}
