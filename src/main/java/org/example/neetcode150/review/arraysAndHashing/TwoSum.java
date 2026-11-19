package org.example.neetcode150.review.arraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Base case: k = 0. No values appear more than once.
or k = 2 where k = k.

IH: Assume, if there are duplicates the algo will find it.

IS: If k elements have duplicates then there is a match
else the algo scans k+1 looking for a duplicate of k

 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int checkNumber = Math.abs(target - nums[i]);
            if (map.containsKey(checkNumber)){
                result[0] = i;
                result[1] = map.get(checkNumber);
                break;
            }

            map.put(nums[i], i);

        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,6};
        int[] nums1 = {4,5,6};
        int[] nums2 = {5,5};

        System.out.println(Arrays.toString(twoSum(nums, 7)));
        System.out.println(Arrays.toString(twoSum(nums1, 10)));
        System.out.println(Arrays.toString(twoSum(nums2, 10)));
    }
}
