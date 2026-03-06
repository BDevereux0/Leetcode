package org.example.binarySearch;

//This can be used in situations like:
/*
How many students scored the same amount on a test. S = {10,20,80,80,80,90}
Autocomplete, search = cat. S = {"cat", "catch", "cater", "dog", ...}
Could be log entries at a specific time.

 */
public class FindFirstAndLastPositionOfElementInSortedArray34 {
    public static int[] searchRange(int[] nums, int target) {

        int[] result = {-1, -1};
        //deals with empty arrays
        if (nums.length ==0){
            return result;
        }

        int start = 0;
        int end = nums.length -1;
        int mid = 0;

        //find lower bound
        while (start< end){
            mid = start + (end - start)/2;
            if (nums[mid]< target){
                start = mid +1;
            }else {
                end = mid;
            }
        }

        if (nums[start] == target){
            result[0] = start;
        }

        start = 0;
        end = nums.length -1;

        //find upper bound
        while (start < end){
            mid = start + (end - start +1)/2;
            if (nums[mid] > target){
                end = mid -1;
            }else {
                start = mid;
            }
        }

        if (nums[start] == target){
            result[1] = start;
        }


        return result;
    }

    public static void printIntArry(int[] arr){
        for (int num: arr){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {5,7,7,8,8,10};
        int[] nums2 = {5,7,7,8,8,10};
        int[] nums3 = {};
        int[] nums4 = {5,7,8,8,8,8,10};

        printIntArry(searchRange(nums1, 8));
        printIntArry(searchRange(nums2, 6));
        printIntArry(searchRange(nums3, 8));
        printIntArry(searchRange(nums4, 8));



    }
}
