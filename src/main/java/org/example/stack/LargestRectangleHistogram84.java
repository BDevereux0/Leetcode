package org.example.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangleHistogram84 {

    public static int largestRectangleArea(int[] heights){
        int result =0;
        int width = 0;
        int height = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < heights.length-1 ; i++) {

            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
                stack.pop();
                if (!stack.isEmpty()) {
                    height = heights[i];
                    width = stack.peek() - i;
                }

                result = Math.max(result, height * width);
            }

            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        int[] heights2 = {2,4};
        int[] heights3 = {2,1,5,6,4,3};

        System.out.println(largestRectangleArea(heights3));
    }
}
