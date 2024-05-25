package leetcode;

import java.util.Scanner;

public class End_Of_file {
    public static void main(String[] args) {
        Scanner sc = new Scanner("/Applications/SumerJava/test.txt");
        int count = 1;
        while (sc.hasNext()){
            System.out.println(count +" "+ sc.next());
            count++;
        }

    }
}
