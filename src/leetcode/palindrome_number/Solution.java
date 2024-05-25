package leetcode.palindrome_number;

public class Solution {
    public boolean isPalindrome(int x) {
       /* if (x < 0)
            return false;

        int org_number = x; // 123
        int reverse = 0; //321
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;

        }
        if (org_number == reverse) {
            return true;

        } else {
            return false;
        }
    }}*/

        return String.valueOf(x).contentEquals(new StringBuilder(String.valueOf(x)).reverse());}}