package org.example.heap;

import java.util.PriorityQueue;

public class findKthLargest215 {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            heap.add(nums[i]);
        }

        int valuesToRemove = heap.size() - k;

        for (int i = 1; i <= valuesToRemove ; i++) {
            heap.remove();
        }

        return heap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int[] nums1 = {3,2,3,1,2,4,5,5,6};

        findKthLargest(nums, 2);
        findKthLargest(nums1, 4);
    }
}
