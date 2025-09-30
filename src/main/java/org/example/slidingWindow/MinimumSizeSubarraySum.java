package org.example.slidingWindow;
//problem 209
public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int leftPointer = 0;
        int best = Integer.MAX_VALUE;


        //note this not O(n^2) because the pointers only ever traverse the array in a single direction
        //if the loop caused a pointer to return to nums[0] then it is O(n^2). Instead it is O(n)
       for (int rightPointer=0; rightPointer<nums.length; rightPointer++){
            sum +=nums[rightPointer];

            while (sum >= target){
                //Result doesn't work because i Want the minimum value, here I am just recomputing
                //result everytime the condition is met, not finding the SMALLEST number line (duh)
                //result = rightPointer - leftPointer +1;
                best = Math.min(best, rightPointer - leftPointer +1);
                sum -= nums[leftPointer];
                leftPointer++;
            }
       }
        System.out.println("best = "+ best);
       return best == Integer.MAX_VALUE ? 0 : best;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int[] arr2 = {1,4,4};
        int[] arr3 = {1,1,1,1,1,1,1,1};
        //failed this one:
        int[] arr4 = {5,1,3,5,10,7,4,9,2,8};
        System.out.println(minSubArrayLen(7,arr));
        System.out.println(minSubArrayLen(4,arr2));
        System.out.println(minSubArrayLen(11,arr3));
        System.out.println(minSubArrayLen(15,arr4));
    }
}

/*

My attempt:
 What I did correctly: 2 pointers, dynamically slid the left pointer.

public static int minSubArrayLen(int target, int[] nums) {
    int result = 0;
    int sum = 0;
    int leftPointer = 0;
    int rightPointer = 0;

    sum = nums[leftPointer];
    while (leftPointer < nums.length - 1) {
        if (sum < target && rightPointer != nums.length - 1) {
            rightPointer++;
            sum += nums[rightPointer];
        } else {
            while (sum >= target) {
                result = rightPointer - leftPointer + 1;
                sum -= nums[leftPointer];
                leftPointer++;
            }
            if (rightPointer == nums.length - 1) {
                sum -= nums[leftPointer];
                leftPointer++;
            }
        }
    }

    return result;
}
 */
