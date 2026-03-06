package org.example.prefixSumsAndHashMap;

import java.util.HashMap;

public class ContinuousSubarraySum523 {

    public static boolean checkSubarraySum(int[] nums, int k) {
        boolean output = false;
        HashMap<Integer, Integer> map = new HashMap<>();

        return output;
    }

    public static void main(String[] args) {
       int[] ar1 = {23,2,4,6,7};
       int[] ar2 = {23};
       int[] ar3 = {23,2,4,6,7};

        System.out.println(checkSubarraySum(ar1, 6));
        System.out.println(checkSubarraySum(ar2, 6));
        System.out.println(checkSubarraySum(ar3, 6));


    }
}
