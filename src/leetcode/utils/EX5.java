package leetcode.utils;
import java.util.Scanner;
import java.io.*;
public class EX5 {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();


        int calculate = a;
        for (int j = 0; j<n;j++){
            calculate += (Math.pow(2, j) * b);
            System.out.print(calculate + " ");
        }

        in.close();
}



    }
}