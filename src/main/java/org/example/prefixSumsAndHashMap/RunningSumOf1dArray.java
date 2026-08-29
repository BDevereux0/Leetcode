package org.example.prefixSumsAndHashMap;

import java.util.Arrays;

//1480
public class RunningSumOf1dArray {
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;

        for (int i = 0; i <nums.length; i++) {
            sum = sum + nums[i];
            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] nums2 = {1,1,1,1,1};
        int[] nums3 = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
        System.out.println(Arrays.toString(runningSum(nums2)));
        System.out.println(Arrays.toString(runningSum(nums3)));
    }
}
