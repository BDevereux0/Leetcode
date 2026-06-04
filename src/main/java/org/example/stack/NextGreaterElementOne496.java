package org.example.stack;

import java.util.*;

//problem 496
public class NextGreaterElementOne496 {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Deque<Integer> stack = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {

            while (!stack.isEmpty() && stack.peek() < nums2[i]) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        while (!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1= {4,1,2};
        int[] nums2= {1,3,4,2};

        int[] nums3= {2,4};
        int[] nums4= {1,2,3,4};

        int[] nums5 = {8, 6, 4, 2, 10};
        int[] nums6 = {2, 4, 6, 10};

        int[] nums7 = {3,4,2,0,1};
        int[] nums8 = {4,1,2,0};

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
        System.out.println(Arrays.toString(nextGreaterElement(nums3, nums4)));
        System.out.println(Arrays.toString(nextGreaterElement(nums6, nums5)));
        System.out.println(Arrays.toString(nextGreaterElement(nums8, nums7)));
    }
}
