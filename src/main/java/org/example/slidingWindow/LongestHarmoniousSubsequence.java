package org.example.slidingWindow;

import java.util.*;

//problem 594
public class LongestHarmoniousSubsequence {

    public static int findLHS(int[] nums) {
        int leftPointer = 0; int rightPointer = leftPointer + 1;
        int size = 0;
        Arrays.sort(nums);
        while (rightPointer < nums.length && leftPointer < nums.length){
            //condition met; grow window and get new size of window
            if (nums[rightPointer] - nums[leftPointer] ==1){
                //do size before moving rightPointer because I haven't evaluated the next number (duh).
                size = Math.max(size, rightPointer - leftPointer + 1);
                rightPointer++;
                //I can't combine this condition with the one above because the condition to resize the
                //window hasn't been met. But since I can have something like {2,2,2,3} be a subsequence
                //I have to account for the additional 2s.
            } else if (nums[leftPointer] == nums[rightPointer]) {
                rightPointer++;
            } else {
            //condition not met; shrink window
                leftPointer++;
            }
        }
        return size;
    }

    public static void main(String[] args) {
        // 1 2 2 2 3 3 5 7
        int[] arr = {1,3,2,2,5,2,3,7};
        int[] arr2 = {3,2,2,2,3};
        int[] arr3 = {1,2,3,4};
        int[] arr4 = {1,1,1,1};

        System.out.println(findLHS(arr));
        System.out.println(findLHS(arr2));
        System.out.println(findLHS(arr3));
        System.out.println(findLHS(arr4));
    }
}
