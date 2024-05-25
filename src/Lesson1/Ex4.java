package Lesson1;

import java.util.Scanner;

// Subtract two random number and check if it correct.
public class Ex4 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random()*10);// cast to integer to rid of decimal and  *10 because Math.random() contain value between 0 - 1.0 so after *10 it become 1-9
        int number2 = (int) (Math.random()*10);

        if(number1 < number2) { //avoid negative answer if number1 is less than number2
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.println("What is "+ number1+"-"+number2);

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if(number1 - number2 == answer) {
            System.out.println("Correct");
        }else{
            System.out.println("Wrong, the correct is: "+ (number1-number2));
        }
    }
}
