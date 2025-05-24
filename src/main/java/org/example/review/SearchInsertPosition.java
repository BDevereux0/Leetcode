package org.example.review;

public class SearchInsertPosition {

    public static int findTargetNum(int[] nums, int target){

        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer <= rightPointer){
            int midPoint = leftPointer + (rightPointer - leftPointer)/2;

            if (nums[midPoint]==target){
                leftPointer = midPoint;
                break;
            }else{
                if (nums[midPoint] < target){
                    leftPointer = midPoint +1;
                }else {
                    rightPointer = midPoint -1;
                }
            }
        }


        return leftPointer;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int[] nums1 = {1,3,5,6};
        int[] nums2 = {1,3,5,6};
        System.out.println(findTargetNum(nums, 1));

    }
}
