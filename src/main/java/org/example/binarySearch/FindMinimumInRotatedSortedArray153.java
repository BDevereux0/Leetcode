package org.example.binarySearch;

public class FindMinimumInRotatedSortedArray153 {

    public static int findMin(int[] nums) {
        int result = -1;
        int start = 0;
        int end = nums.length -1;

        while (start != end){
            int mid = start + (end - start)/2;
            if (nums[mid] - nums[mid +1] > 0){
                return nums[mid +1];
            }

            if (nums[mid] > nums[end]){
                start = mid +1;
            }else {
                end = mid;
            }

        }
        result = nums[start];


        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {3,4,5,1,2};
        int[] nums2 = {4,5,6,7,0,1,2};
        int[] nums3 = {11,13,15,17};
        System.out.println(findMin(nums1));
        System.out.println(findMin(nums2));
        System.out.println(findMin(nums3));

    }
}
