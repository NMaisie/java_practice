package leetcode.add_two_numbers;

import leetcode.utils.Assertion;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assertion<ListNode> assertion = new Assertion<>();
        List<ListNode> listL1 = List.of(new ListNode(new int[]{2,4,3}), new ListNode(new int[]{0}), new ListNode(new int[]{9,9,9,9,9,9,9}));
        List<ListNode> listL2 = List.of(new ListNode(new int[]{5,6,4}), new ListNode(new int[]{0}), new ListNode(new int[]{9,9,9,9}));
        List<ListNode> listExpected = List.of(new ListNode(new int[]{7,0,8}), new ListNode(new int[]{0}), new ListNode(new int[]{8,9,9,9,0,0,0,1}));
        for(int i = 0; i < listL1.size(); i++){
            try{
                System.out.printf("Test case %d: ", i + 1);
                ListNode actual = solution.addTwoNumbers(listL1.get(i), listL2.get(i));
                assertion.assertEqual(listExpected.get(i), actual);
                System.out.println("Success");
            }catch (AssertionError e){
                System.out.printf("Fail - %s \n", e.getMessage());
            }
        }
    }
}
