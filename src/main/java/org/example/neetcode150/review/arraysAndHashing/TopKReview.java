package org.example.neetcode150.review.arraysAndHashing;

import java.util.*;

public class TopKReview {

    public static int[] topKFrequent(int[] nums, int k){
        int[] result = new int[k];

        Map<Integer,Integer> map = new HashMap<>();

        Arrays.stream(nums).forEach(num -> {
            map.merge(num, 1, Integer::sum);
        });

        List<Integer>[] buckets = new ArrayList[nums.length +1];

        map.forEach((key,val) -> {
            if (buckets[val] == null) {
                buckets[val] = new ArrayList<>();
                buckets[val].add(key);
            }
            buckets[val].add(key);

        });

        //todo fix this
        for (int i = buckets.length -1; i >= 0 ; i--) {
            result[i] = buckets[i].get(i);
        }


        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3};
        int[] nums1 = {7,7};

        System.out.println( Arrays.toString(topKFrequent(nums, 2)));
        System.out.println(Arrays.toString(topKFrequent(nums1, 1)));
    }
}
