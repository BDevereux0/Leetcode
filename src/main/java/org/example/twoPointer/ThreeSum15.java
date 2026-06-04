package org.example.twoPointer;

import java.util.*;

public class ThreeSum15 {
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        int start = 0;
        int end = nums.length -1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            while (start < end){
                if (start == i){
                    start++;
                }  else if (end == i) {
                    end--;
                }

                if (nums[i] + nums[start] + nums[end] ==0 ){
                        list.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    }

                if (nums[i] + nums[start] + nums[end] < 0){
                    start++;
                }else {
                    end--;
                }
            }
            start=0;
            end = nums.length -1;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        int[] nums1 = {0,1,1};
        int[] nums2 = {0,0,0};

        List<List<Integer>> list = threeSum(nums);
        System.out.println(list);
    }
}
