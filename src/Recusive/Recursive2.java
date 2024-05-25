package Recusive;

import java.util.Scanner;

public class Recursive2 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.println("Sum is from 5->1 is: " + sumMethod(5)); // 5+4+3+2+1 = 15

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        System.out.println(num+"^"+power+" = "+powerMethod(num,power));// try 2^3 = 8


    }

    public static int sumMethod(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumMethod(n - 1);
        }
    }

    public static int powerMethod(int num, int power) {
        if (power == 1) {
            return num;
        }else{
            return num * powerMethod(num,power -1);
        }
    }
}
