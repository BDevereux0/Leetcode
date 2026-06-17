package org.example.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class GreaterElementII503 {
    public static int[] nextGreaterElements(int[] nums){
        int[] result = new int[nums.length];
        int n = nums.length;
        Deque<Integer> stack = new ArrayDeque<>();
        Arrays.fill(result, -1);
        //circular array technique
        for (int i = 2*n-1; i >= 0; i--){
            //modulo wrap technique
            int index =  i % n;

            /*
            I do this because, as I go through the array anytime I encounter a higher number
            than what is on top of the stack, that is going to be the next greater value for any numbers
            to the left.
            * */
            while (!stack.isEmpty() && nums[index] >= nums[stack.peek()]){
                stack.pop();
            }

            /*
            * This populates the result array with the top element in the stack. Because when I encounter a
            * number lower than what's on the stack I've found its greatest element to the right.
            * Which is why it is important to pop above, so i maintain the next greatest element on the top of
            * the stack.
            * */
            if (!stack.isEmpty() && nums[index] < nums[stack.peek()]){
                result[index] = nums[stack.peek()];
            }

            stack.push(index);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] ar = {1,2,1};
        int[] ar1 = {1,2,3,4,3};
        int[] ar2 = {8,6,4,7,1};

        System.out.println(Arrays.toString(nextGreaterElements(ar)));
        System.out.println(Arrays.toString(nextGreaterElements(ar1)));
        System.out.println(Arrays.toString(nextGreaterElements(ar2)));
    }
}
