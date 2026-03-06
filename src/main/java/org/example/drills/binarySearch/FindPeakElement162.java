package org.example.drills.binarySearch;

public class FindPeakElement162 {
    
    public static int findPeakElement(int[] nums) {
        int result = 0;
        int start = 0;
        int end = nums.length -1;
        if (nums.length ==1){
            return 0;
        }

        while (start != end){
            int mid = start + (end - start)/2;
            if (nums[mid] - nums[mid +1] < 0){
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        result = start;
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,1,3,5,6,4};
        int[] nums3 = {2};
        System.out.println(findPeakElement(nums1));
        System.out.println(findPeakElement(nums2));
        System.out.println(findPeakElement(nums3));
    }
}
