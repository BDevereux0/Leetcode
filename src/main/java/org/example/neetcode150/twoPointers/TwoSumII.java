package org.example.neetcode150.twoPointers;

import java.util.Arrays;
import java.util.List;
//167
public class TwoSumII {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length-1;

        while (left < right){
            if (nums[left] + nums[right] == target){
                return new int[]{left, right};
            }

            if (nums[left] + nums[right] > target){
                right--;
            }else{
                left++;
            }
        }


        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int[] nums2 = {2,3,4};
        int[] nums3 = {-1, 0};

        System.out.println(Arrays.toString(twoSum(nums1, 9)));
        System.out.println(Arrays.toString(twoSum(nums2, 6)));
        System.out.println(Arrays.toString(twoSum(nums3, -1)));

    }
}
