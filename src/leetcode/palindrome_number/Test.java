package leetcode.palindrome_number;

import leetcode.utils.Assertion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assertion<Boolean> assertion = new Assertion<>();
        List<Integer> listX = List.of(121, -121, 10);
        List<Boolean> listExpected = List.of(true, false, false);
        for(int i = 0; i < listX.size(); i++){
            try{
                System.out.printf("Test case %d: ", i + 1);
                Boolean actual = solution.isPalindrome(listX.get(i));
                assertion.assertEqual(listExpected.get(i), actual);
                System.out.println("Success");
            }catch (AssertionError e){
                System.out.printf("Fail - %s \n", e.getMessage());
            }
        }
    }
}
