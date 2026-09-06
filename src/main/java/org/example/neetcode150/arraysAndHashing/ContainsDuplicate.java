package org.example.neetcode150.arraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        boolean result = false;
        Set<Integer> set = new HashSet<>();

        for (int num : nums){
            if (!set.contains(num)){
                set.add(num);
            }else{
                return true;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] ar = {1,2,3,3};
        int[] ar2 = {1,2,3,4};
        System.out.println(containsDuplicate(ar));
        System.out.println(containsDuplicate(ar2));

    }
}
