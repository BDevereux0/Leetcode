package org.example.prefixSumsAndHashMap;


import java.util.HashMap;
import java.util.Map;

//560
public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;

        //review this and write down wtf is happening. cause i'm fkd
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result += map.getOrDefault(sum -k, 0);
            map.put(sum, map.getOrDefault(sum,0) +1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int[] nums2 = {1,2,3};
        int[] nums3 = {1,-1,0};

        System.out.println(subarraySum(nums, 2));
        System.out.println(subarraySum(nums2, 3));
        System.out.println(subarraySum(nums3, 0));
    }

    /*fallow up question:

    If you accidentally update the map before counting, what’s the smallest counterexample
     (array and k) where your algorithm overcounts?
Explain in one sentence using the invariant why the overcount happens.
     */
}
