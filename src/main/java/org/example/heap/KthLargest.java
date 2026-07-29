package org.example.heap;

import java.util.PriorityQueue;
/*

A priority que ensure the parent is less than its child. So, if the values are 2,3,8,5,4
That is not the order they are actually in. Its more like:
It always fills the tree from left to right, one level at a time. Smaller numbers bubble up but the child nodes
are not sorted by value.
     2
    / \
   3   8
  / \
 4  5
 */
//problem 703
public class KthLargest {

    int k;
    int[] nums;
    PriorityQueue<Integer> heap;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        heap = new PriorityQueue<>();
        for (int i = 0; i < nums.length ; i++) {
            heap.offer(nums[i]);
        }

    }

    public int add(int val) {
        heap.offer(val);
        while (heap.size()>k){
            heap.poll();
        }
        return heap.peek();
    }

    public static void main(String[] args) {

        KthLargest kthLargest = new KthLargest(3, new int[]{4,5,8,2});
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));

        KthLargest k2 = new KthLargest(4, new int[] {7,7,7,7,8,3});
        System.out.println(k2.add(2));
        System.out.println(k2.add(10));
        System.out.println(k2.add(9));
        System.out.println(k2.add(9));
    }
}
