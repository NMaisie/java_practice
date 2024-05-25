package leetcode.palindrome_number;

import java.util.Scanner;

public class PalindromeExample {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int x = -121;
    boolean result = isPalindrome(x);
    System.out.println(result);
}
public  static boolean isPalindrome(int x) { // static
    /*if (x < 0)
        return false;

    int org_number = x; // 123
    int reverse = 0; //321
    while (x != 0) {
        reverse = reverse * 10 + x % 10;
        x /= 10;

    }
    if (org_number == reverse) {
        return true;

    } else {
        return false;
    }*/
    String xintstring = Integer.toString(x);
    String reverse = Integer.toString(x);
    return false;
}
}

