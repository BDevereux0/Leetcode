package org.example.array;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(target-nums[i])){
                map.put(nums[i], i);
            }else {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] output = twoSum(nums, target);

        int[] nums1 = {3,2,4};
        int target1 = 6;
        int[] output1 = twoSum(nums1, target1);
        for (int n : output1){
            System.out.println(n);
        }
    }
}
