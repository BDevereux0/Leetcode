package org.example.stack;

import java.util.*;

public class NextGreaterElementII503 {
    public static int[] nextGreaterElements(int[] nums){
        int[] result = new int[nums.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int num : nums){
            stack.push(num);
        }

        System.out.println(stack);




        return result;
    }





    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] nums1 = {1,2,3,4,3};
        int[] nums2 = {1,2,3,4,5};
       // System.out.println(Arrays.toString(nextGreaterElements(nums)));
       // System.out.println(Arrays.toString(nextGreaterElements(nums1)));
        System.out.println(Arrays.toString(nextGreaterElements(nums2)));
    }
}

//this was the brute force solution.
/*
 public static int[] nextGreaterElements(int[] nums){
        int[] result = new int[nums.length];
        int counter = 0;
        int leftPointer = 0;
        int rightPointer = leftPointer +1;

        while (counter <= nums.length-1){

            if (rightPointer == leftPointer){
                if (leftPointer < nums.length-1) {
                    leftPointer++;
                }
                rightPointer = leftPointer+1;
                result[counter] = -1;
                counter++;
            }

            if (rightPointer > nums.length -1){
                rightPointer =0;
            }

            if (nums[rightPointer] == nums[leftPointer] +1){
                result[counter] = nums[rightPointer];
                leftPointer++;
                rightPointer = leftPointer +1;
                counter++;
            }else {
                rightPointer++;
            }


        }

        return result;
    }
 */