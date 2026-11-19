package org.example.neetcode150.review.arraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean hasDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();

        for (int num : nums){
            if (!set.add(num)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        int[] nums2 = {1,2,3,4};
        System.out.println(hasDuplicate(nums));
        System.out.println(hasDuplicate(nums2));

    }
}
