package org.example.prefixSumsAndHashMap;

import java.util.Arrays;

//724
public class FindPivotIndex {

    public static int pivotIndex(int[] nums){
        int result = -1;
        int[] prefixSum = nums;

        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] += prefixSum[i-1];
        }

        for (int i = 0; i < prefixSum.length; i++) {
            int leftSum = i == 0 ? 0 : prefixSum[i-1];
            int rightSum = prefixSum[prefixSum.length-1];

            if (leftSum == (rightSum - prefixSum[i])){
                result = i;
                break;
            }

        }

        return result;
    }


    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int[] nums2 = {1,2,3};
        int[] nums3 = {2,1,-1};
        System.out.println(pivotIndex(nums));
        System.out.println(pivotIndex(nums2));
        System.out.println(pivotIndex(nums3));
    }
}

/*
Explanation:
I calculate prefix sum, so that I can evaluate left and right sums by:
leftSum is found by accessing the index to the left of i. Because the prefixSum represents the current sum
at that point.
rightSum is found by subtracting the total sum by the value at i. So, in the example below, if I substract
28 - 17 = 11. I see that it equals leftSum.



ar = [1,7,3,6,5,6]

[1, 8, 11, 17, 22, 28]



 */