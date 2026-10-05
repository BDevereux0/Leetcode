package org.example.neetcode150.arraysAndHashing;

import java.util.*;
import java.util.stream.Collectors;

//128
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        int result = 0;
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        for (int sequenceNumber : nums)

            if (!set.contains(sequenceNumber -1)){
                int length = 1;
                while (set.contains(sequenceNumber +1)){
                    sequenceNumber = sequenceNumber + 1;
                    length++;
                }
                result = Math.max(result, length);
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
