package org.example.binarySearch;

import java.lang.reflect.Array;

public class SearchInsetPositionReview {
    public static int searchInsert(int[] nums,int target) {
        int result = 0;
        int leftPointer = 0;
        int rightPointer = nums.length -1;

        /*Initially I had this condition as leftPointer < rightPointer. But that causes the loop to end
        when the pointers are on top of one another. So by adding the <=, I end the loop when the
        leftPointer is one index ahead of the rightPointer. Which is what I want because the invariant
        states that if the target doesn't exist it must be out of [left..right]

         */
        while (leftPointer <= rightPointer){
            int midPointer = leftPointer + (rightPointer - leftPointer)/2;
            if (nums[midPointer] == target){
                return midPointer;
            } else if (nums[midPointer] > target) {
                rightPointer = midPointer - 1;
            }else {
                leftPointer = midPointer +1;
            }
        }
        return leftPointer;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        //target exists
        System.out.println(searchInsert(nums, 5));
        //target doesn't exist
        System.out.println(searchInsert(nums, 2));
        //target oob?
        System.out.println(searchInsert(nums, 7));
    }
}
