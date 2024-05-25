package Lesson1;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        int days;
        int wins;
        boolean isRaining;
        double temperature;

        Scanner sc = new Scanner(System.in);

        System.out.print("How many days are left until the tournament ");
        days = sc.nextInt();
        System.out.print("How may games have  you won recently? ");
        wins = sc.nextInt();
        System.out.print("Is it raining? (true/false) ");
        isRaining = sc.nextBoolean();
        System.out.println("What is the temperature ouside? ");
        temperature = sc.nextDouble();

        boolean shouldPractice =(days<14 || wins<2 || (!isRaining && temperature<95));
        System.out.println("Should you practice today? "+ shouldPractice);


        }
    }
