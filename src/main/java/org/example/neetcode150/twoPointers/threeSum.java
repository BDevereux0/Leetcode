package org.example.neetcode150.twoPointers;

import java.util.*;

//15
public class threeSum {

    public static List<List<Integer>> three_Sum(int[] nums){
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length ; i++) {
            int leftPointer = i + 1;
            int rightPointer = nums.length -1;

            while (leftPointer < rightPointer){
                if (nums[i] + nums[leftPointer] + nums[rightPointer] == 0){
                    set.add( new ArrayList<Integer>(List.of(nums[i], nums[leftPointer], nums[rightPointer])));
                }

                if (nums[i] + nums[leftPointer] + nums[rightPointer] > 0){
                    rightPointer--;
                }else{
                    leftPointer++;
                }

            }

        }

        return new ArrayList<>(set);
    }


    public static void main(String[] args) {
        int[] nums = {0,1,1};
        int[] nums2 = {0,0,0};
        int[] nums3 = {-1, 0, 1, 2, -1, -4};


        System.out.println((three_Sum(nums)));
        System.out.println(three_Sum(nums2));
        System.out.println(three_Sum(nums3));
    }
}
