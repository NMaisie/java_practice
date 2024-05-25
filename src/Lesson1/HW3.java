package Lesson1;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//         int i =0;
//         int sum =0;
//
//         while (i<10){
//             sum += sum+i; // try (sum = sum+1)
//             System.out.println(sum);
//             i++;

        boolean practice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to practice your multiplication tables? (Answer 'true' or 'false'.)");
        practice = sc.nextBoolean();


        while (practice) {
            System.out.print("Please enter a number from 1-10 to begin practicing.");
            int number = sc.nextInt();

            for (int i = 1; i < 11; i++) {
                System.out.print("What does " + number +" * "+ i + " equal? ");
                int answer = sc.nextInt();

                if (answer == number * i) {
                    System.out.println("Correct");
                } else {
                    System.out.println("Please try again");
                    i--; // if answer wrong it gonna ask that question again
                }

            }
            System.out.println("Would you like to practice your multiplication tables? (Answer 'true' or\n" +
                    "'false'.)");
            practice = sc.nextBoolean();

        }
        System.out.println("Good bye");
    }
}