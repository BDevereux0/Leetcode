package org.example.binarySearch;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public static int maximumCount(int[] nums){
        int count =0;
        int leftPointer = 0;
        int rightPointer = nums.length-1;
        int leftCounter = 0;
        int rightCounter = 0;

        //TODO use binary seach to find the last negative number and the first positive number.

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {-2, -1, -1, 1, 2, 3};
        System.out.println(maximumCount(nums));
    }
}
