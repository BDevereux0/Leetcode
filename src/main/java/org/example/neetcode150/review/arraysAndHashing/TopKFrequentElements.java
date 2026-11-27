package org.example.neetcode150.review.arraysAndHashing;
/*
A retail company tracks the number of times each product is purchased.
Each product is represented by an integer identification code.

Some products are purchased more frequently than others. The company
wants to identify its best-selling products by determining which
identification codes appear most frequently in its sales records.

Write a function that accepts an array of product identification codes
and an integer k, then returns the k most frequently occurring codes.

You may return the results in any order.

You may assume that k is always valid and that the answer is unique.
*/

import java.util.*;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k){
        int[] result = new int[k];
        Queue<Map<Integer, Integer>> queue = new ArrayDeque<>(k);
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) +1);
        }

        List<Integer>[] buckets1 = new ArrayList[nums.length +1];

        for (int num : freqMap.keySet()){
            int frequency = freqMap.get(num);

            if (buckets1[num] == null){
                buckets1[num] = new ArrayList<>();
            }

            buckets1[frequency].add(num);
        }

        int index = 0;

        for (int i = buckets1.length -1; i >= 0 && index < k ; i--){
            if (buckets1[i] != null){
                for (int num: buckets1[i]){
                    result[index++] = num;

                    if (index ==k){
                        return result;
                    }
                }
            }
        }


        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};
        int[] nums1 = {7,7};

        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
        System.out.println(Arrays.toString(topKFrequent(nums1, 1)));
    }
}

/*

public static int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> freqMap = new HashMap<>();

    // Step 1: Count frequencies
    for (int num : nums) {
        freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    // Step 2: Create frequency buckets
    List<Integer>[] buckets = new ArrayList[nums.length + 1];

    for (int num : freqMap.keySet()) {
        int frequency = freqMap.get(num);

        if (buckets[frequency] == null) {
            buckets[frequency] = new ArrayList<>();
        }

        buckets[frequency].add(num);
    }

    // Step 3: Collect the k most frequent elements
    int[] result = new int[k];
    int index = 0;

    for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
        if (buckets[i] != null) {
            for (int num : buckets[i]) {
                result[index++] = num;

                if (index == k) {
                    return result;
                }
            }
        }
    }

    return result;
}
 */
