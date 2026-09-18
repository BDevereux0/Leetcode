package org.example.neetcode150.review.review1;

/*
Base case: k = 0. No values appear more than once.
or k = 2 where k = k.

IH: Assume, if there are duplicates the algo will find it.

IS: If k elements have duplicates then there is a match
else the algo scans k+1 looking for a duplicate of k

 */

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
