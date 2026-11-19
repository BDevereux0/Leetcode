package org.example.neetcode150.review.review1;



import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    public static boolean hasDuplicate(int[] nums){
        boolean result = false;
        Set<Integer> set = new HashSet<>();

        for (int num : nums){
            if (set.contains(num)){
                result = true;
                break;
            }else {
                set.add(num);
            }
        }




        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        System.out.println(hasDuplicate(nums));

        int[] nums2 = {1,2,3,4};
        System.out.println(hasDuplicate(nums2));

    }
}
