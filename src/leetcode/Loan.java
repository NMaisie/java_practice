package leetcode;

import java.nio.FloatBuffer;
import java.util.Date;
import java.util.Scanner;

public class Loan {
    private double annualInteresRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan() {
        this(2.5, 1, 1000); //default
    }

    public Loan(double annualInteresRate, int numberOfYears, double loanAmount) {
        this.annualInteresRate = annualInteresRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date(); // the date this loan was created

    }

    public double getAnnualInteresRate() {
        return annualInteresRate;
    }

    public void setAnnualInteresRate(double annualInteresRate) {
        this.annualInteresRate = annualInteresRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    java.util.Date getLoanDate() {
        return loanDate;
    }

    public double getMonthPayment() {
        double monthlyInterestRate = annualInteresRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthPayment() * numberOfYears * 12;
        return totalPayment;


    }

    public static void main(String[] args) {
        Loan loan = new Loan();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter annual interest rate: ");
        double annualInteresRate = sc.nextDouble();
        System.out.println("Enter number of years: ");
        int numberOfYear = sc.nextInt();
        System.out.println("Enter loan amount: ");
        double loanAmount = sc.nextDouble();

        System.out.println("The loan was created on " + loan.getLoanDate() + "\n" + "The monthly payment is: " + loan.getMonthPayment() + "\n" + "The total payment is: " + loan.getTotalPayment());
    }
}