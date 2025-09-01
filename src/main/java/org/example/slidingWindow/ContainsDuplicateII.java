package org.example.slidingWindow;

import java.util.HashSet;

//Problem 219
public class ContainsDuplicateII {


    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k ==0){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        int leftPointer = 0;
        int rightPointer = leftPointer + 1;
        set.add(nums[leftPointer]);

        while (rightPointer < nums.length){
            if (set.contains(nums[rightPointer])){
                return true;
            }else {
                set.add(nums[rightPointer]);
                rightPointer++;
            }
            if (Math.abs(leftPointer - rightPointer) > k){
                set.remove(nums[leftPointer]);
                leftPointer++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int[] arr2 = {1,0,1,1};
        int[] arr3 = {1,2,3,1,2,3};
        int[] arr4 = {1,4,2,3,1,2};
        int[] arr5 = {1,2,3,4,5,6,7,8,9,9};


        System.out.println(containsNearbyDuplicate(arr, 3));
        System.out.println(containsNearbyDuplicate(arr2, 1));
        System.out.println(containsNearbyDuplicate(arr3, 2));
        System.out.println(containsNearbyDuplicate(arr4, 3));
        System.out.println(containsNearbyDuplicate(arr5, 3));
    }

}
