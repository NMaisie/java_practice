package leetcode.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {//097 2
        // TODO: your code go here
        Map<Integer, Integer> remain = new HashMap<>();
            HashMap<Integer, Integer> map = new HashMap<>();// <key,value>
            for (int i = 0; i < nums.length; i++) {//loop throught the whole array then store in HashMap
                int missing = target - nums[i]; //calcultate
                if (map.containsKey(missing)) {
                    return new int[]{map.get(missing), i};// get i of missing (which is 1)
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No match found");
        }

//        for (int i = 0; i < nums.length; i++) {
//            if(remain.containsKey(nums[i])){
//                return new int[]{remain.get(nums[i]), i};
//            }else{
//                remain.put(target - nums[i], i);
//            }
//        }
//        return new int[]{};
    }
