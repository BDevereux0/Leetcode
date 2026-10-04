package org.example.neetcode150.arraysAndHashing;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.PriorityQueue;

//128
public class LongestConsecutiveSequence {

    //TODO: My priorityQ approach produces n log n, so use something else.
    public int longestConsecutive(int[] nums) {
        int result = 0;
        int currentValue = 0;
        int compareValue = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int n : nums){
            q.add(n);
        }

        System.out.println(q);

        if (q.peek() != null) {
             currentValue = q.poll();
             compareValue = q.peek();
        }

        for (int i = 0; i < nums.length-1 ; i++) {
            if (q.peek() == null) {
                break;
            }

            if ((compareValue - currentValue) == 1){
                currentValue = compareValue;
                result++;
                compareValue = q.poll();
            }else {
                currentValue = q.poll();
            }
        }


        return result;
    }

    public static void main(String[] args) {
        int[] nums1= {100,4,200,1,3,2};
        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};
        int[] nums3 = {1,0,1,2};

        LongestConsecutiveSequence sequence = new LongestConsecutiveSequence();
        System.out.println(
        sequence.longestConsecutive(nums1));

        System.out.println(
        sequence.longestConsecutive(nums2));

        System.out.println(
        sequence.longestConsecutive(nums3));

    }
}
