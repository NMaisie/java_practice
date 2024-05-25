package leetcode.two_sum;

import leetcode.utils.Assertion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assertion<Integer> assertion = new Assertion<>();
        List<int[]> listNumbers = List.of(new int[]{2, 7, 11, 15}, new int[]{3, 2, 4}, new int[]{3, 3});
        List<Integer> listTarget = List.of(9, 6, 6);
        List<List<Integer>> listExpected = List.of(List.of(0, 1), List.of(1, 2), List.of(0, 1));
        for(int i = 0; i < listTarget.size(); i++){
            try{
                System.out.printf("Test case %d: ", i + 1);
                List<Integer> actual = Arrays.stream(solution.twoSum(listNumbers.get(i), listTarget.get(i)))
                        .boxed()
                        .collect(Collectors.toList());
                assertion.assertEqual(listExpected.get(i), actual);
                System.out.println("Success");
            }catch (AssertionError e){
                System.out.printf("Fail - %s \n", e.getMessage());
            }
        }
    }
}
