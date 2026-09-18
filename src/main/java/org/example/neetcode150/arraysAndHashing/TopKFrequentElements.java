package org.example.neetcode150.arraysAndHashing;

import java.security.KeyStore;
import java.util.*;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        //base case
        if (nums.length==1){
            return new int[]{nums[0]};
        }


        Map<Integer, Integer> map = new HashMap<>();
        //freq map
        //Big O for this section:
        //for loop - O(n). Map operations are o(1). O(1) * O(n) = o(n)
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else {
                map.replace(nums[i], map.get(nums[i]) +1);
            }
        }

        //put them into a min-heap. Smallest value has the highest priority and is removed
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((v1, v2) -> {
            return Integer.compare(v1.getValue(), v2.getValue());
        });

        /*
        Big O. Two things are happening, I'm going through a structure w/ unknown elements and
        the priorityQueue will bubble up the lowest value using a RedBlack tree.
        So, O(n) for the map iteration.
        n log n for priorityQueue. I will go through n elements and worst case I have to bubble up the last value
         */
        map.forEach((key,value) -> {
            Map.Entry<Integer, Integer> entry = Map.entry(key,value);
            pq.add(entry);
        });

        //shorten max-heap to size k
        //Big O:
        /*
          1. size is random number and so is Q. So the size will be the difference
          O(m-k) where m = size of queue
          2. pq.remove triggers tree reordering: O(log n)
          final: O(m log n)
         */
        while (pq.size() > k){
            pq.remove();
        }

        int[] result = new int[k];

        //fill array
        //Big O:
        /*
        1. loop o(k) k
        2. pq.poll log n
         */
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            result[i] = entry.getKey();
        }
        return result;

        /*

        Final Big O Analysis: O(n) + O(n log n) + O(m-k log n) + O(k log n) = O(n log n)
         */
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3};
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));

        int[] nums2 = {7,7};
        System.out.println(Arrays.toString(topKFrequent(nums2, 1)));
    }
}

/*
*  When redoing this:
*     Construct freq-map with getOrDefault()
*     When filling array, I can directly use the priorityQ w/o making the Map.Entry<Integer,Integer>...
*
*   Two optimal solutions:
*          1. Min-Heap solution
*          2. Bucket sort
*
* Try to do both next time.
*
*  Some run times:
*   HashMap get/put       → O(1) average
    PriorityQueue add     → O(log n)
    PriorityQueue poll    → O(log n)
    Array/list iteration  → O(n)
* */
